package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BirthdayGenerate(view: View) {
        val name  = get_name.editableText.toString();

        Toast.makeText(this,"Button clicked and name is $name",Toast.LENGTH_LONG).show();

        val intent  = Intent(this,birthday_greet_activity::class.java); //passing to next screen

        intent.putExtra("name",name)//passing values as key value pair format

        startActivity(intent); //all these methods inherited from appCompatActivity class //this method for one activity to another


    }
}