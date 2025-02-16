package domain.trigger

import domain.field.Field

data class Trigger(
    private val id: String,
    private val producedFields: List<Field>
)