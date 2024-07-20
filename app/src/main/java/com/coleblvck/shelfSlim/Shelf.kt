package com.coleblvck.shelfSlim

import android.app.Application

class Shelf : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: Shelf? = null

        fun get(): Shelf {
            return instance as Shelf
        }
    }
}