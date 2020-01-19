package pl.arsonproject.nbp_currency.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Rate(
    @Json(name = "effectiveDate") val effectiveDate: String,
    @Json(name = "no") val no: String,
    @Json(name = "mid") val midPrice: Double
)