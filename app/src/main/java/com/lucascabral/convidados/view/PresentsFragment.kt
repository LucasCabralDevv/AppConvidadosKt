package com.lucascabral.convidados.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lucascabral.convidados.R
import com.lucascabral.convidados.viewmodel.PresentsViewModel

class PresentsFragment : Fragment() {

    private lateinit var presentsViewModel: PresentsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        presentsViewModel =
                ViewModelProvider(this).get(PresentsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_presents, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        presentsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}