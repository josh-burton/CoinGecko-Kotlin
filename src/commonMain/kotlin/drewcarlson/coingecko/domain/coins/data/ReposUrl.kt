package drewcarlson.coingecko.domain.coins.data

import kotlinx.serialization.Serializable

@Serializable
data class ReposUrl(
        val github: List<String>,
        val bitbucket: List<String>
)