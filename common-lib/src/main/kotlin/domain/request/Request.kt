package domain.request

data class Request(
    private val name: String,
    private val requestType: RequestType,
    private val requiredFields: List<String>,
)
