package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var myRV =findViewById<RecyclerView>(R.id.rv_name) //?
        var constraintLay=findViewById<ConstraintLayout>(R.id.CL)
        var butSubmit = findViewById<Button>(R.id.butSubmitUserName)
        var editTextUserName = findViewById<EditText>(R.id.etUserName)
        var namesArray:ArrayList<String> = arrayListOf("zahra","huda","z","zahra","huda","z","zahra","huda","z","zahra","huda","z")
        butSubmit.setOnClickListener(){
           val userInout=editTextUserName.text.toString()
            if(userInout.isNotEmpty()){
                namesArray.add(userInout)
                editTextUserName.text.clear()
                editTextUserName.clearFocus()
            } else
                Snackbar.make(constraintLay, "Please enter some text", Snackbar.LENGTH_LONG).show()
        }
        rv_name.adapter=RecyclerVieww(this, namesArray)
    }
}