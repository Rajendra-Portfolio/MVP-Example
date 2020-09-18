package iamrajendra.github.io.mvpexample.login


import  android.os.Handler;
class LoginInteractor {
    var handler: Handler? = null;

    init {
        handler = Handler();
    }

    interface OnLoginFinishedListener {
        fun onUsernameError()
        fun onPasswordError()
        fun onSuccess()
    }


    fun login(username: String, password: String, listener: OnLoginFinishedListener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        handler?.postDelayed({

            when {
                username.isEmpty() -> listener.onUsernameError()
                password.isEmpty() -> listener.onPasswordError()
                else -> listener.onSuccess()
            }

        }, 2000)

    }
}