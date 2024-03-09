package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var quizModel: MutableList<QuizModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModel = mutableListOf()


    }
    private fun getDataFromFirebase(){
        quizModel.add(QuizModel("1", "Programming", "All the basic programming", "10"))
        quizModel.add(QuizModel("2", "Computer", "All the basic Computer", "15"))
        quizModel.add(QuizModel("3", "Geography", "All the basic Geography", "20"))
    }

}