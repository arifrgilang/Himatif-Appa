package com.arifrgilang.presentation.utils

import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import com.arifrgilang.presentation.R
import com.google.android.material.snackbar.Snackbar

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun Button.enable() {
    isEnabled = true
}

fun Button.disable() {
    isEnabled = false
}

fun View.showErrorSnackbar(message: String) {
    val snackbar = Snackbar.make(this, message, Snackbar.LENGTH_LONG)
    snackbar.setBackgroundTint(ContextCompat.getColor(this.context, R.color.redDanger))
    snackbar.show()
}


fun View.showSuccessSnackbar(message: String) {
    val snackbar = Snackbar.make(this, message, Snackbar.LENGTH_LONG)
    snackbar.setBackgroundTint(ContextCompat.getColor(this.context, R.color.green))
    snackbar.show()
}