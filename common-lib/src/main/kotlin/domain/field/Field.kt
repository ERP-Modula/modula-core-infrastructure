package domain.field

data class Field(
    private val key: String,
    private val type: FieldType,
    private val stringValue: String,
)
