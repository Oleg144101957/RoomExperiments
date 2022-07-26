package com.vishnevskiypro.roomexperiments.screens.addNote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vishnevskiypro.roomexperiments.databinding.FragmentAddNoteBinding
import com.vishnevskiypro.roomexperiments.databinding.FragmentDetailBinding

class AddNoteFragment : Fragment() {

    private lateinit var binding: FragmentAddNoteBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddNoteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}