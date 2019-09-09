package com.cdg.eat.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

internal open class BaseViewModel : ViewModel() {

    private val disposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()

        disposable.clear()
    }
}