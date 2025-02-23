package core.process.api.http

data class CreateBusinessProcessRequest(
    private val name: String,
    private val description: String,
)