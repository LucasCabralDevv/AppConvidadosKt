package com.lucascabral.convidados.service.repository

import android.content.Context
import com.lucascabral.convidados.service.model.GuestModel

class GuestRepository (context: Context) {

    // Acesso ao banco de dados
    private val mDataBase = GuestDataBase.getDatabase(context).guestDAO()

    fun save(guest: GuestModel): Boolean {
        return mDataBase.save(guest) > 0
    }

    fun update(guest: GuestModel): Boolean {
        return mDataBase.update(guest) > 0
    }

    fun delete(guest: GuestModel) {
        return mDataBase.delete(guest)
    }

    fun getAll(): List<GuestModel> {
        return mDataBase.getInvited()
    }

    fun getPresents(): List<GuestModel> {
        return mDataBase.getPresent()
    }

    fun getAbsents(): List<GuestModel> {
        return mDataBase.getAbsent()
    }

    fun get(id: Int): GuestModel {
        return mDataBase.load(id)
    }
}