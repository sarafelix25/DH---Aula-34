package com.e.aula34_splasscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {

    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //COM THREAD
//        Thread(Runnable {
//            Thread.sleep(5000)
//            //para não quebrar, falamos pra executar essa mudança do Ui na UiThread
//            runOnUiThread {
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//            }
//        }).start()

        val intent = Intent(this, MainActivity::class.java)
        //COM COROUTINE
        scope.launch {
            delay(5000)
            startActivity(intent)
        }
    }
}