package drewcarlson.coingecko.domain.coins

import drewcarlson.coingecko.domain.coins.data.*
import drewcarlson.coingecko.domain.shared.Image
import drewcarlson.coingecko.domain.shared.Ticker
import drewcarlson.coingecko.domain.status.StatusUpdates
import drewcarlson.coingecko.domain.status.Update
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinFullData(
        val id: String,
        val symbol: String,
        val name: String,
        @SerialName("block_time_in_minutes")
        val blockTimeInMinutes: Long = 0,
        val categories: List<String>,
        val localization: Map<String, String>,
        val description: Map<String, String>,
        val links: Links,
        val image: Image,
        @SerialName("country_origin")
        val countryOrigin: String? = null,
        @SerialName("genesis_date")
        val genesisDate: String? = null,
        @SerialName("contract_address")
        val contractAddress: String? = null,
        @SerialName("ico_data")
        val icoData: IcoData? = null,
        @SerialName("market_cap_rank")
        val marketCapRank: Long = 0,
        @SerialName("coingecko_rank")
        val coingeckoRank: Long = 0,
        @SerialName("coingecko_score")
        val coingeckoScore: Double = 0.0,
        @SerialName("developer_score")
        val developerScore: Double = 0.0,
        @SerialName("community_score")
        val communityScore: Double = 0.0,
        @SerialName("liquidity_score")
        val liquidityScore: Double = 0.0,
        @SerialName("public_interest_score")
        val publicInterestScore: Double = 0.0,
        @SerialName("market_data")
        val marketData: MarketData? = null,
        @SerialName("community_data")
        val communityData: CommunityData? = null,
        @SerialName("developer_data")
        val developerData: DeveloperData? = null,
        @SerialName("public_interest_stats")
        val publicInterestStats: PublicInterestStats? = null,
        @SerialName("status_updates")
        val statusUpdates: List<Update>? = null,
        @SerialName("last_updated")
        val lastUpdated: String? = null,
        val tickers: List<Ticker>
)