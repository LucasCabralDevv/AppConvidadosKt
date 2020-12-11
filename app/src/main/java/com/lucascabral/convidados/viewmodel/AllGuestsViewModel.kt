package com.lucascabral.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lucascabral.convidados.service.model.GuestModel
import com.lucascabral.convidados.service.repository.GuestRepository

class AllGuestsViewModel(application: Application) : AndroidViewModel(application) {

    val mContext = application.applicationContext
    private val mGuestRepository = GuestRepository.getInstance(mContext)

    private val mGuestList = MutableLiveData<List<GuestModel>>()
    val guestList: LiveData<List<GuestModel>> = mGuestList

    fun load() {
        mGuestList.value = mGuestRepository.getAll()
    }

    fun delete(id: Int){

        mGuestRepository.delete(id)
    }
}