package com.example.android.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val myName:MyName= MyName("Manikandan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName=myName
//        findViewById<Button>(R.id.done_button).setOnClickListener {
//            addNickname(it)
//        }
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

        private fun addNickname(view: View){
//            val edittext=findViewById<EditText>(R.id.nickname_edit)
//            val nicknametextview=findViewById<TextView>(R.id.nickname_text)
//            nicknametextview.text=edittext.text
//            edittext.visibility=View.GONE
//            view.visibility=View.GONE
//            nicknametextview.visibility=View.VISIBLE



//            binding.nicknameText.text=binding.nicknameEdit.text
//            binding.nicknameEdit.visibility=View.GONE
//            binding.doneButton.visibility=View.GONE
//            binding.nicknameText.visibility=View.VISIBLE


            binding.apply {
//                nicknameText.text=binding.nicknameEdit.text
                myName?.nickname=nicknameEdit.text.toString()
                invalidateAll()
                nicknameEdit.visibility=View.GONE
                doneButton.visibility=View.GONE
                nicknameText.visibility=View.VISIBLE
            }


            // Hide the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)

        }

}
    