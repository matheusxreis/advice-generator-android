package com.matheusxreis.advicegenerator.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.widget.ContentLoadingProgressBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.matheusxreis.advicegenerator.R
import com.matheusxreis.advicegenerator.ui.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var advice:TextView = findViewById(R.id.label_quotes);
        var number: TextView = findViewById(R.id.label_advice_number)
        var button: FloatingActionButton = findViewById(R.id.buttonf)
        var loading: ContentLoadingProgressBar = findViewById(R.id.loading)

        val viewModel = ViewModelProvider(this).get(MainViewModel()::class.java);

        viewModel.getAdvices();

        viewModel.advice.observe(this, Observer {
            advice.text = "'"+ it.advice+"'"
            number.text = "ADVICE #" + it.id.toString()
            loading.visibility= View.INVISIBLE
            button.isClickable = true
        })


        button.setOnClickListener{
            advice.text=""
            number.text="ADVICE #"
            loading.visibility= View.VISIBLE
            button.isClickable = false
            viewModel.getAdvices()
        }

    }



}