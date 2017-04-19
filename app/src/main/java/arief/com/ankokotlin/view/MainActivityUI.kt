package arief.com.ankokotlin.view

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import arief.com.ankokotlin.MainActivity
import arief.com.ankokotlin.adapter.MainAdapter
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Author Name Arief Maffrudin A N, 18/04/17
 */
class MainActivityUI (val mAdapter: MainAdapter): AnkoComponent<MainActivity>{

    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui){

        return relativeLayout{
            padding = dip(16)
            lparams (width = matchParent, height = wrapContent)

            recyclerView{
                lparams (width = matchParent, height = wrapContent)
                layoutManager = LinearLayoutManager(ctx)
                adapter = mAdapter
            }

        }

    }

}