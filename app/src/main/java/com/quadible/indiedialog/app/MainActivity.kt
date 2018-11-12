package com.quadible.indiedialog.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.quadible.indiedialog.IndieDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        IndieDialog()
            .title("Indie")
            .message("I am an indie dialog")
            .positiveButton("OK")
            .cancelable(false)
            .show()
    }

    override fun onPause() {
        super.onPause()
        IndieDialog()
            .title("Indie")
            .message("who can be called when no activity is available")
            .positiveButton("OK")
            .cancelable(false)
            .show()

    }

}
