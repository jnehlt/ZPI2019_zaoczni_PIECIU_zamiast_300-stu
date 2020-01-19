package pl.arsonproject.nbp_currency.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListCurrencyResponse(
    val data: List<ListCurrency>
)
