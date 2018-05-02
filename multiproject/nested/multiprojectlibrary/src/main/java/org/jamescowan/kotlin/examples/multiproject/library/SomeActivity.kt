package org.jamescowan.kotlin.examples.multiproject.library

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.some_activity)
    }
}
