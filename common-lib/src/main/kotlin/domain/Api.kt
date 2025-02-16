package domain

import domain.request.Request

data class Api(
    private val availableRequests: List<Request>,
)