package com.lucascabral.convidados.service.repository

import com.lucascabral.convidados.service.model.GuestModel

class GuestRepository {

    fun getAll(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresents(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsents(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    // CRUD - Create, Read, Update, Delete

    fun save(guest: GuestModel) {
    }

    fun update(guest: GuestModel) {
    }

    fun delete(guest: GuestModel) {
    }
}