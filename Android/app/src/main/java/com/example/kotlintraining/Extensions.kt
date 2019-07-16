package com.example.kotlintraining

import java.text.SimpleDateFormat
import java.util.*

object Extensions {
    fun Date.format(pattern: String): String {
        return SimpleDateFormat(pattern, Locale.US).format(this@format)
    }

}