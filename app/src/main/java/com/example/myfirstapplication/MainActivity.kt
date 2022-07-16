package com.example.myfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun createbirthdaycard(view: View) {
        val name = nameInput.editableText.toString()
        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val name1 = nameInput.editableText.toString()
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }


    //fun createbirthdaycard(view: View) {
      //  Toast.makeText(this,"name was $",Toast.LENGTH_LONG).show()
    //}
}

