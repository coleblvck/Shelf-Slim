package com.coleblvck.shelfSlim.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.observeOnce(observer: Observer<T>) {
    observeForever(object : Observer<T> {
        override fun onChanged(value: T) {
            if (value != null) {
                observer.onChanged(value)
            }
            removeObserver(this)
        }
    })
}