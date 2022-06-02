package com.matheusxreis.advicegenerator.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.matheusxreis.advicegenerator.data.model.Advice
import com.matheusxreis.advicegenerator.data.repository.AdviceRepository
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {

    var repository = AdviceRepository()
    lateinit var advice: MutableLiveData<Advice>;

    init {
        advice = MutableLiveData()
    }

    fun getAdvices(){

            viewModelScope.launch {
                try {
                val a = repository.getAdvice();
                advice.value = a
                }catch(err:Exception){
                    advice.value = Advice(0, "There was some problem, sorry =/")
                }
            }



    }
}