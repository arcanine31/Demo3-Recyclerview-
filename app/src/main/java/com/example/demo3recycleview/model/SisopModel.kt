package com.example.demo3recycleview.model
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class SisopModel (
    var name: String ?= "",
    var logo: Int
) : Parcelable

