package com.example.android.scoreboard_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android.scoreboard_login.databinding.FragmentSignupBinding


class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        lateinit var selectedState:String
        lateinit var selectedstage:String
        val binding: FragmentSignupBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false)
        val state = resources.getStringArray(R.array.state)
        val stage = resources.getStringArray(R.array.position)
        val adapter=ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_item,state.toList())
        val adapter2=ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_item,stage.toList())
        binding.spinner1.adapter = adapter
        binding.spinner2.adapter = adapter2
        binding.spinner1.onItemSelectedListener=object :
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedState=state[position]
                selectedState=stage[position]
                
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(context, "Nothing Selected", Toast.LENGTH_SHORT).show()
            }
        }





            return binding.root

        }




}