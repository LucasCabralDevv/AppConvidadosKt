package com.lucascabral.convidados.view.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lucascabral.convidados.R
import com.lucascabral.convidados.service.model.GuestModel
import com.lucascabral.convidados.view.listener.GuestListener
import kotlinx.android.synthetic.main.adapter_guest.view.*

class GuestViewHolder(itemView: View, private val listener: GuestListener) : RecyclerView.ViewHolder(itemView) {

    fun bind(guest: GuestModel){
        val textName = itemView.findViewById<TextView>(R.id.adapterGuestTextView)
        textName.text = guest.name

        textName.setOnClickListener {
            listener.onClick(guest.id)
        }
    }
}