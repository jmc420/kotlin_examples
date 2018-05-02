package org.jamescowan.kotlin.examples.multiproject.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

import org.jamescowan.kotlin.examples.multiproject.library.SomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = Timer()

        timer.schedule(object : TimerTask() {
            override fun run() {
                this@MainActivity.runOnUiThread(Runnable {
                    val intent:Intent = Intent(this@MainActivity, SomeActivity::class.java)

                    startActivity(intent)
                });
            }

            override fun equals(other: Any?): Boolean {
                return super.equals(other)
            }

        }, 5000)
    }
}
