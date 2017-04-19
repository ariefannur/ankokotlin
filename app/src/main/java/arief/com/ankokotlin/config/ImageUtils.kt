package arief.com.ankokotlin.config

import android.content.Context
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Author Name Arief Maffrudin A N, 18/04/17
 */
class ImageUtils {

    fun displayImage(context: Context, img: String, imgView: ImageView){
        Picasso.with(context).load(img).into(imgView)
    }
}