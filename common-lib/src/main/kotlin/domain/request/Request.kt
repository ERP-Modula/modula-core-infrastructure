package domain.request

data class Request(
    val name: String,
    val requestType: RequestType,
    val requiredFields: List<String>,
)
