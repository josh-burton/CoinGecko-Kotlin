package drewcarlson.coingecko.domain.coins

import drewcarlson.coingecko.domain.coins.data.Roi
import drewcarlson.coingecko.domain.coins.data.SparklineIn7d
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinMarkets(
        @SerialName("id")
        val id: String? = null,
        @SerialName("symbol")
        val symbol: String? = null,
        @SerialName("name")
        val name: String? = null,
        @SerialName("image")
        val image: String? = null,
        @SerialName("current_price")
        val currentPrice: Long = 0,
        @SerialName("market_cap")
        val marketCap: Long = 0,
        @SerialName("market_cap_rank")
        val marketCapRank: Long = 0,
        @SerialName("total_volume")
        val totalVolume: Long = 0,
        @SerialName("high_24h")
        val high24h: Long = 0,
        @SerialName("low_24h")
        val low24h: Long = 0,
        @SerialName("price_change_24h")
        val priceChange24h: Double = 0.0,
        @SerialName("price_change_percentage_24h")
        val priceChangePercentage24h: Double = 0.0,
        @SerialName("market_cap_change_24h")
        val marketCapChange24h: Long = 0,
        @SerialName("market_cap_change_percentage_24h")
        val marketCapChangePercentage24h: Double = 0.0,
        @SerialName("circulating_supply")
        val circulatingSupply: Long = 0,
        @SerialName("total_supply")
        val totalSupply: Long?,
        @SerialName("ath")
        val ath: Long = 0,
        @SerialName("ath_change_percentage")
        val athChangePercentage: Double = 0.0,
        @SerialName("ath_date")
        val athDate: String? = null,
        @SerialName("roi")
        val roi: Roi? = null,
        @SerialName("last_updated")
        val lastUpdated: String? = null,
        @SerialName("sparkline_in_7d")
        val sparklineIn7d: SparklineIn7d? = null,
        @SerialName("price_change_percentage_1h_in_currency")
        val priceChangePercentage1hInCurrency: Double = 0.0
)