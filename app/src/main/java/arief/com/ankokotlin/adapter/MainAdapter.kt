package arief.com.ankokotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import arief.com.ankokotlin.R
import arief.com.ankokotlin.config.ImageUtils
import arief.com.ankokotlin.repository.model.Contributor
import arief.com.ankokotlin.view.ItemViewUI
import org.jetbrains.anko.AnkoContext

/**All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Author Name Arief Maffrudin A N, 18/04/17
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder> {

    var mLs: MutableList<Contributor> = ArrayList<Contributor>()

    constructor(ls: MutableList<Contributor>){
        mLs = ls
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(mLs[position])
    }

    override fun getItemCount(): Int {
        return mLs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(ItemViewUI().createView(AnkoContext.create(parent!!.context)))
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView?.findViewById(R.id.img) as ImageView
        val txtTitle: TextView = itemView?.findViewById(R.id.txtName) as TextView
        val txtType: TextView = itemView?.findViewById(R.id.txtType) as TextView

        fun bind(contributor: Contributor){
            ImageUtils().displayImage(itemView.context, contributor.avatar_url, img)
            txtTitle.setText(contributor.login)
            txtType.setText(contributor.type)

        }
    }

    fun update(ls: List<Contributor>){
        mLs = ls as MutableList<Contributor>
        notifyDataSetChanged()
    }
}