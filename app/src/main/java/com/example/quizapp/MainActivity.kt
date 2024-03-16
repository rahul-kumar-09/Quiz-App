package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var quizModelList: MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizModelList = mutableListOf()
        getDataFromFirebase()


    }
    private fun getDataFromFirebase(){
        val listQuestionModel = mutableListOf<QuestionModel>()
        listQuestionModel.add(QuestionModel("What is Android?", mutableListOf("Language", "OS", "Product", "None"), "OS"))
        listQuestionModel.add(QuestionModel("Who own Android?", mutableListOf("Samsung", "Google", "Apple", "Microsoft"), "Google"))

        quizModelList.add(QuizModel("1", "Programming", "All the basic programming", "10"))
        quizModelList.add(QuizModel("2", "Computer", "All the basic Computer", "15"))
        quizModelList.add(QuizModel("3", "Geography", "All the basic Geography", "20"))

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        adapter = QuizListAdapter(quizModelList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

}