package domain

import domain.trigger.Trigger

data class Module(
    private val id: String,
    private val api: List<Api>,
    private val triggers: List<Trigger>
)