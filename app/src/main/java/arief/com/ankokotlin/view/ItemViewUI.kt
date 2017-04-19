package arief.com.ankokotlin.view

import android.content.Context
import android.view.View
import arief.com.ankokotlin.R
import org.jetbrains.anko.*

/**All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Author Name Arief Maffrudin A N, 18/04/17
 */
class ItemViewUI : AnkoComponent<Context> {

    override fun createView(ui: AnkoContext<Context>): View = with(ui){

        return relativeLayout {
            padding = dip(16)
            imageView{
                lparams{
                    width = dip(32)
                    height = dip(32)
                    setMargins(0, 0, dip(16), 0)
                }
                id = R.id.img

            }

            textView{
                lparams{
                    width = wrapContent
                    height = wrapContent
                    rightOf(R.id.img)
                }
                textSize = sp(8).toFloat()
                id = R.id.txtName

            }
            textView{
                lparams {
                    width = wrapContent
                    height = wrapContent
                    rightOf(R.id.img)
                    below(R.id.txtName)
                }
                    textSize = sp(6).toFloat()
                    id = R.id.txtType
                }


            }

    }
}