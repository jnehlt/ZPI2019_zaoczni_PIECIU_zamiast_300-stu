package pl.arsonproject.nbp_currency.ui.currencyInfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pl.arsonproject.nbp_currency.repository.ApiFactory

class CurrencyInfoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


    init {
        viewModelScope.launch {
            try {

                var nbpApi = ApiFactory.nbpApi
                val response = nbpApi.getCurrencyInfoAsync("a", "chf").await()
                if (response.isSuccessful()) {
                    var a = response.body()
                    var v = a
                }
            } catch (e: Exception) {
                var x = e.message
            }

        }
    }
}