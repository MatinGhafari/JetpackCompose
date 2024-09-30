package ir.matin.jetpackcompose.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val textFieldLiveData= MutableLiveData<String>()

    fun onDataTextFieldChanged(newText :String){

            textFieldLiveData.value =newText


    }

}