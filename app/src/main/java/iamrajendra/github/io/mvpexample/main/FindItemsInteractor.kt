package iamrajendra.github.io.mvpexample.main

import android.os.Handler

class FindItemsInteractor {
    var handler:Handler ?=null;
    init {
        handler = Handler();
    }

    fun findItems(callback: (List<String>) -> Unit) {
        handler?.postDelayed( { callback(createArrayList()) },2000)
    }

    private fun createArrayList(): List<String> = (1..10).map { "Item $it" }
}