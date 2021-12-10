package net.jamesmcmahon.kafkatdd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkatddApplication

fun main(args: Array<String>) {
	runApplication<KafkatddApplication>(*args)
}
