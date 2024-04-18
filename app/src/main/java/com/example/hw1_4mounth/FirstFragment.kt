package com.example.hw1_4mounth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw1_4mounth.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()

    }
    private fun setupListener() {
        binding.buttonSubmit.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(user(
                    binding.editTextName.text.toString
                    binding.editTextEmail.text.toString(),
                    binding.editTextPassword.text.toString().toInt()
                ))
            )
        }
    }

}
