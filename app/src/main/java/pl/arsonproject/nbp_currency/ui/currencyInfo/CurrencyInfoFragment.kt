package pl.arsonproject.nbp_currency.ui.currencyInfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pl.arsonproject.nbp_currency.R

class CurrencyInfoFragment : Fragment() {

    private lateinit var currencyInfoViewModel: CurrencyInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currencyInfoViewModel =
            ViewModelProviders.of(this).get(CurrencyInfoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_currency_info, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        currencyInfoViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}