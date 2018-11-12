package com.quadible.indiedialog

import android.app.Activity
import android.app.AlertDialog
import android.app.Application
import android.support.annotation.IdRes
import android.support.annotation.StyleRes
import com.quadible.activityjobexecutor.ActivityJobExecutor

class IndieDialog {

    companion object {

        @JvmStatic fun init(application: Application) {
            ActivityJobExecutor.init(application)
        }

    }

    private var title: String? = null

    private var message: String? = null

    private @StyleRes var themeId: Int = -1

    private var cancelable: Boolean = true

    private var positiveTitle: String? = "OK"

    private @IdRes var id: Int = -1

    public fun title(title: String): IndieDialog {
        this.title = title
        return this
    }

    public fun message(message: String): IndieDialog {
        this.message = message
        return this
    }

    public fun theme(@StyleRes themeId: Int): IndieDialog {
        this.themeId = themeId
        return this
    }

    public fun cancelable(cancelable: Boolean): IndieDialog {
        this.cancelable = cancelable
        return this
    }

    public fun positiveButton(positiveTitle: String): IndieDialog {
        this.positiveTitle = positiveTitle
        return this
    }

    public fun show() {
        ActivityJobExecutor.execute(WhenReadyShow(this))
    }

    private class WhenReadyShow(val dialog: IndieDialog) : ActivityJobExecutor.ActivityJob {

        override fun run(activity: Activity) {
            val builder by lazy {
                if (dialog.themeId != -1) {
                    AlertDialog.Builder(activity, dialog.themeId)
                } else {
                    AlertDialog.Builder(activity)
                }
            }

            builder.setTitle(dialog.title)
                .setMessage(dialog.message)
                .setCancelable(dialog.cancelable)
                .setPositiveButton(dialog.positiveTitle, null)
                .show()
        }

    }

}