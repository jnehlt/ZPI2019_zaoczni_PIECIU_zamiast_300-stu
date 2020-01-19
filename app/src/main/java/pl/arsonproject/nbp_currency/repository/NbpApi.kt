package pl.arsonproject.nbp_currency.repository

import kotlinx.coroutines.Deferred
import pl.arsonproject.nbp_currency.model.Currency
import pl.arsonproject.nbp_currency.model.ListCurrency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface NbpApi {
    @GET("exchangerates/tables/{table}/")
    fun getAllCurrencyAsync(@Path("table") table: String): Deferred<Response<List<ListCurrency>>>

    @Headers("Accept: application/json")
    @GET("exchangerates/rates/{table}/{curr}/")
    fun getCurrencyInfoAsync(@Path("table") table: String, @Path("curr") curr: String): Deferred<Response<Currency>>

}