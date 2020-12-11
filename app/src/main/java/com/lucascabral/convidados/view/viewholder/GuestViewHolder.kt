package com.lucascabral.convidados.view.viewholder

import android.app.AlertDialog
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lucascabral.convidados.R
import com.lucascabral.convidados.service.model.GuestModel
import com.lucascabral.convidados.view.listener.GuestListener
import kotlinx.android.synthetic.main.adapter_guest.view.*

class GuestViewHolder(itemView: View, private val listener: GuestListener) :
    RecyclerView.ViewHolder(itemView) {

    fun bind(guest: GuestModel) {
        val textName = itemView.findViewById<TextView>(R.id.adapterGuestTextView)
        textName.text = guest.name

        textName.setOnClickListener {
            listener.onClick(guest.id)
        }

        textName.setOnLongClickListener {

            AlertDialog.Builder(itemView.context)
                .setTitle(R.string.dialog_remover_title)
                .setMessage(R.string.dialog_remover_message)
                .setPositiveButton(R.string.dialog_positive_button) { _, which ->
                    listener.onDelete(guest.id)
                }
                .setNeutralButton(R.string.dialog_negative_button, null)
                .show()
            true
        }
    }
}