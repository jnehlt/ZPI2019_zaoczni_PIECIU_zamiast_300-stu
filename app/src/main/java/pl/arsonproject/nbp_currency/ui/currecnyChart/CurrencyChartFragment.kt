package pl.arsonproject.nbp_currency.ui.currecnyChart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import pl.arsonproject.nbp_currency.R

class CurrencyChartFragment : Fragment() {

    private lateinit var currencyChartViewModel: CurrencyChartViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currencyChartViewModel =
            ViewModelProviders.of(this).get(CurrencyChartViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_currency_chart, container, false)

        return root
    }
}