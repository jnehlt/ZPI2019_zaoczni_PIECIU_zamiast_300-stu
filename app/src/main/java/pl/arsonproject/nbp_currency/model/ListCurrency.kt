package pl.arsonproject.nbp_currency.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListCurrency(
    @Json(name = "table") val table: String,
    @Json(name = "no") val currency: String,
    @Json(name = "effectiveDate") val code: String,
    @Json(name = "rates") val rates: List<ListRate>
)
