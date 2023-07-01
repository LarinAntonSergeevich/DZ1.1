package com.itis.dz11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    fun onClick(view: View)
    {
        var BigEvilCorporation1 = findViewById<EditText>(R.id.editTextText)
        var BigEvilCorporation2 = findViewById<EditText>(R.id.editTextText3)
        var BigEvilCorporation3 = findViewById<EditText>(R.id.editTextText4)
        var BigEvilCorporation4 = findViewById<EditText>(R.id.editTextText5)

        var outBigEvilCorporation = findViewById<TextView>(R.id.textView7)

        var Evil: Float = 0f
        val name = BigEvilCorporation1.text.toString()
        val height = BigEvilCorporation2.text.toString().toInt()
        val weight = BigEvilCorporation3.text.toString().toFloat()
        val age = BigEvilCorporation4.text.toString().toInt()


        if(name.contains("А")){
            Evil = Evil + 0.1f
        }
        if(height<=100){
            Evil = Evil + 0.1f
        }
        if(weight>=200){
            Evil = Evil + 0.1f
        }
        if(age>=100){
            Evil = Evil + 0.1f
        }
        else if(age<=52){
            Evil = Evil + 0.1f
        }
        var value = ""
        if (Evil >= 0.5f){
            value="Вы Орк эксбиционист!"
        }
        else{
            value="Вы Огр Онанист?!"
        }
        if(name.contains("Э")){
            Evil = Evil + 0.1f
        }
        if(height<=50){
            Evil = Evil + 0.1f
        }
        if(weight>=150){
            Evil = Evil + 0.1f
        }
        if(age>=25){
            Evil = Evil + 0.1f
        }
        else if(age<=2){
            Evil = Evil + 0.1f
        }
        if (Evil >= 0.5f){
            value="Вы Эльф Гамосек!"
        }
        else{
            value="Вы Лысый Чмошник?!"
        }
        if(name.contains("Т")){
            Evil = Evil + 0.1f
        }
        if(height<=180){
            Evil = Evil + 0.1f
        }
        if(weight>=100){
            Evil = Evil + 0.1f
        }
        if(age>=18){
            Evil = Evil + 0.1f
        }
        else if(age<=18){
            Evil = Evil + 0.1f
        }
        if (Evil >= 0.5f){
            value="Вы Тихон!"
        }
        else{
            value="Вы не Тихон?!"
        }
        outBigEvilCorporation.text = "$value"

    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainButton = findViewById<Button>(R.id.button6)

        mainButton.setOnClickListener { onClick(it) }

    }

}
