package domain.trigger

import domain.field.Field

data class Trigger(
    val id: String,
    val producedFields: List<Field>
)