package pl.arsonproject.nbp_currency.ui.currecnyChart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pl.arsonproject.nbp_currency.R
import pl.arsonproject.nbp_currency.databinding.FragmentCurrencyChartBinding

class CurrencyChartFragment : Fragment() {

    private lateinit var currencyChartViewModel: CurrencyChartViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currencyChartViewModel =
            ViewModelProviders.of(this).get(CurrencyChartViewModel::class.java)
        val binding = DataBindingUtil.inflate<FragmentCurrencyChartBinding>(
            inflater,
            R.layout.fragment_currency_chart,
            container,
            false
        )

        binding.vm = currencyChartViewModel
        setUI()
        return binding.root
    }

    private fun setUI() {
        currencyChartViewModel.errorMessage.observe(this, Observer {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        })
    }
}