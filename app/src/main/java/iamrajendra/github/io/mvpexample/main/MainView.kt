package iamrajendra.github.io.mvpexample.main

interface MainView {
    fun showProgress()
    fun hideProgress()
    fun setItems(items: List<String>)
    fun showMessage(message: String)
}