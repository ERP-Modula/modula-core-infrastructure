package core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoreFunctionalityService

fun main(args: Array<String>) {
    runApplication<CoreFunctionalityService>(*args)
}