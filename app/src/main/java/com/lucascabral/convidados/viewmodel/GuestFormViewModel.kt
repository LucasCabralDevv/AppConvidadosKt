package com.lucascabral.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lucascabral.convidados.service.model.GuestModel
import com.lucascabral.convidados.service.repository.GuestRepository

class GuestFormViewModel(application: Application): AndroidViewModel(application) {

    private val mContext = application.applicationContext
    private val mGuestRepository: GuestRepository = GuestRepository.getInstance(mContext)

    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest: LiveData<Boolean> = mSaveGuest

    private var mGuest = MutableLiveData<GuestModel>()
    val guest: LiveData<GuestModel> = mGuest

    fun save(name: String, presence: Boolean){
        val guest = GuestModel(name = name, presence = presence)
        mSaveGuest.value = mGuestRepository.save(guest)
    }

    fun load(id: Int) {
        mGuest.value = mGuestRepository.get(id)
    }
}