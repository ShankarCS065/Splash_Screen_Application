package com.krashkrosh748199.socialtwitch

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val time:Long=4000
        Handler().postDelayed(Runnable {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },time)



    }

}