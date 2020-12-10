package com.lucascabral.convidados.service.repository

import android.content.Context
import com.lucascabral.convidados.service.model.GuestModel

class GuestRepository private constructor(context: Context) {

    private var mGuestDataBaseHelper: GuestDataBaseHelper = GuestDataBaseHelper(context)

    // Singleton
    companion object {

        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun getAll(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresents(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsents(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    // CRUD - Create, Read, Update, Delete

    fun save(guest: GuestModel) {

        mGuestDataBaseHelper.writableDatabase
    }

    fun update(guest: GuestModel) {

    }

    fun delete(guest: GuestModel) {

    }
}