package com.example.android.scoreboard_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.scoreboard_login.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private var myemail:String="vlmmani2000@gmail.com"
    private var mypassword:String="1234"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)


           binding.loginButton.setOnClickListener { view: View ->
               var text = binding.emailField.text.toString()
               var number = binding.editTextNumberPassword.text.toString()
               if (text == myemail && number == mypassword) {
                   Navigation.findNavController(view)
                       .navigate(R.id.action_loginFragment_to_scoreFragment)

               }
               else{
                   Toast.makeText(context, "incorrect", Toast.LENGTH_SHORT).show()
               }

           }
        binding.signUp.setOnClickListener{view:View ->
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_signupFragment4)
        }


        return binding.root

    }
}