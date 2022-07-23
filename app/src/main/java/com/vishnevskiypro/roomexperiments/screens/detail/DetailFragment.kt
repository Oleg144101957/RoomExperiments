package com.vishnevskiypro.roomexperiments.screens.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vishnevskiypro.roomexperiments.R
import com.vishnevskiypro.roomexperiments.databinding.FragmentDetailBinding
import com.vishnevskiypro.roomexperiments.databinding.FragmentStartBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}