package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val someNumber: Int,
    @DrawableRes val imageResourceId: Int,
)
