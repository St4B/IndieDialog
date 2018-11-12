package com.quadible.indiedialog.app

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IdRes
import android.widget.Toast
import com.quadible.indiedialog.IndieDialog
import com.quadible.indiedialog.NegativeButton
import com.quadible.indiedialog.PositiveButton

class MainActivity : AppCompatActivity(), PositiveButton, NegativeButton {

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

    override fun onPositiveClick(@IdRes id: Int) {
        Toast.makeText(this, "Positive clicked!", Toast.LENGTH_LONG).show()
    }

    override fun onNegativeClick(@IdRes id: Int) {
        Toast.makeText(this, "Negative clicked!", Toast.LENGTH_LONG).show()
    }

}
