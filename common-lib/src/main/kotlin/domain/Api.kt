package domain

import domain.request.Request

data class Api(
    val availableRequests: List<Request>,
)