package arief.com.ankokotlin.repository.model

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import rx.Observable


/**All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Originally written by Author Name Arief Maffrudin A N, 18/04/17
 */
class Service {

    val BASE_URL: String = "https://api.github.com/repos/JetBrains/kotlin/"
    fun create(): Retrofit{

       return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
    }

    interface api{

        @GET("contributors")
        fun getContributor(): Observable<List<Contributor>>
    }
}