package pl.arsonproject.nbp_currency.ui.currencyInfo

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
import pl.arsonproject.nbp_currency.databinding.FragmentCurrencyInfoBinding

class CurrencyInfoFragment : Fragment() {

    private lateinit var currencyInfoViewModel: CurrencyInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currencyInfoViewModel =
            ViewModelProviders.of(this).get(CurrencyInfoViewModel::class.java)

        val binding = DataBindingUtil.inflate<FragmentCurrencyInfoBinding>(
            inflater,
            R.layout.fragment_currency_info,
            container,
            false
        )
        binding.vm = currencyInfoViewModel

        setUI()

        return binding.root
    }

    private fun setUI() {
        currencyInfoViewModel.errorMessage.observe(this, Observer {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        })
    }
}