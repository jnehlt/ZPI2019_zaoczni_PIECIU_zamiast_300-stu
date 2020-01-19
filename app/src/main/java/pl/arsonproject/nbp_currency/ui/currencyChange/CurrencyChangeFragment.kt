package pl.arsonproject.nbp_currency.ui.currencyChange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pl.arsonproject.nbp_currency.R

class CurrencyChangeFragment : Fragment() {

    private lateinit var currencyChangeViewModel: CurrencyChangeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currencyChangeViewModel =
            ViewModelProviders.of(this).get(CurrencyChangeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_currency_change, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        currencyChangeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}