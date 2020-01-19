package pl.arsonproject.nbp_currency.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Currency(
    @Json(name = "table") val table: String,
    @Json(name = "currency") val currency: String,
    @Json(name = "code") val code: String,
    @Json(name = "rates") val rates: List<Rate>
)