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
        var BigEvilCorporation1 = findViewById<EditText>(R.id.edit_Text_name)
        var BigEvilCorporation2 = findViewById<EditText>(R.id.edit_Text_Rost)
        var BigEvilCorporation3 = findViewById<EditText>(R.id.edit_Text_Ves)
        var BigEvilCorporation4 = findViewById<EditText>(R.id.edit_Text_vozrast)

        var outBigEvilCorporation = findViewById<TextView>(R.id.textView_result)

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
            Evil = Evil + 0.2f
        }
        if(height<=50){
            Evil = Evil + 0.2f
        }
        if(weight>=150){
            Evil = Evil + 0.2f
        }
        if(age>=25){
            Evil = Evil + 0.2f
        }
        else if(age<=2){
            Evil = Evil + 0.2f
        }
        if (Evil >= 1f){
            value="Вы Эльф Гамосек!"
        }
        else{
            value="Вы Лысый Чмошник?!"
        }
        if(name.contains("К")){
            Evil = Evil + 1f
        }
        if(height<=180){
            Evil = Evil + 1f
        }
        if(weight>=100){
            Evil = Evil + 1f
        }
        if(age>=18){
            Evil = Evil + 1f
        }
        else if(age<=18){
            Evil = Evil + 1f
        }
        if (Evil >= 5f){
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
        val mainButton = findViewById<Button>(R.id.button_Raschet)

        mainButton.setOnClickListener { onClick(it) }

    }

}
