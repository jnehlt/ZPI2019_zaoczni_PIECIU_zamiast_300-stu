package pl.arsonproject.nbp_currency.ui.currencyInfo

import android.view.View
import android.widget.AdapterView
import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pl.arsonproject.nbp_currency.repository.ApiFactory


class CurrencyInfoViewModel : ViewModel() {

    val name = ObservableField<String>()
    val currencyPrice = ObservableDouble()
    val publicationDate = ObservableField<String>()
    val currencyList = ObservableField<List<String>>()
    val errorMessage = MutableLiveData<String>()

    init {
        if (currencyList.get() == null)
            viewModelScope.launch {
                try {
                    var nbpApi = ApiFactory.nbpApi
                    val response = nbpApi.getAllCurrencyAsync("a").await()
                    if (response.isSuccessful()) {
                        var list = arrayListOf<String>()
                        for (curr in response.body()?.get(0)?.rates!!) {
                            list.add(curr.code)
                        }
                        currencyList.set(list)
                    }
                } catch (e: Exception) {
                    errorMessage.value = e.message
                }
            }
    }

    fun onSelectItem(
        parent: AdapterView<*>?,
        view: View?,
        pos: Int,
        id: Long
    ) {
        currencyChange(parent?.selectedItem.toString())
    }

    fun currencyChange(currentCurrency: String) {
        viewModelScope.launch {
            try {
                var nbpApi = ApiFactory.nbpApi
                val response = nbpApi.getCurrencyInfoAsync("a", currentCurrency).await()
                if (response.isSuccessful()) {
                    name.set(response.body()?.currency)
                    currencyPrice.set(response.body()?.rates?.get(0)?.midPrice!!)
                    publicationDate.set(response.body()?.rates?.get(0)?.effectiveDate!!)
                }
            } catch (e: Exception) {
                errorMessage.value = e.message
            }
        }
    }
}