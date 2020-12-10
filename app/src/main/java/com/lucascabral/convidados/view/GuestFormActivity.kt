package com.lucascabral.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lucascabral.convidados.viewmodel.GuestFormViewModel
import com.lucascabral.convidados.R
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        setListeners()

        observe()
    }

    override fun onClick(view: View) {

        val id = view.id
        if (id == R.id.guestSaveButton) {

            val name = guestNameEdit.text.toString()
            val presence = guestPresenceRadio.isChecked

            mViewModel.save(name, presence)
        }
    }

    private fun setListeners() {

        guestSaveButton.setOnClickListener(this)
    }

    private fun observe() {

        mViewModel.saveGuest.observe(this, Observer {

            if (it) {
                Toast.makeText(applicationContext, "Sucesso!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Falha!", Toast.LENGTH_SHORT).show()
            }
            finish()
        })
    }
}