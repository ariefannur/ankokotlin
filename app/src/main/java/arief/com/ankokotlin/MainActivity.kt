package arief.com.ankokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import arief.com.ankokotlin.adapter.MainAdapter
import arief.com.ankokotlin.repository.model.Contributor
import arief.com.ankokotlin.repository.model.Service
import arief.com.ankokotlin.view.MainActivityUI
import org.jetbrains.anko.setContentView
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // generateLayout()

        val adapter: MainAdapter = MainAdapter(ArrayList<Contributor>())
        MainActivityUI(adapter).setContentView(this)
        getData(adapter)

    }


    fun getData(adapter:MainAdapter) {
        val api: Service.api = Service().create().create(Service.api::class.java)
        api.getContributor()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    ls: List<Contributor> ->
                    if (ls.size > 0) {
                        Log.d("AF", "List :: "+ls.size)
                        adapter.update(ls)
                    }

                }




    }
}
