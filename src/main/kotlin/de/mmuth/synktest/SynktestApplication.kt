package de.mmuth.synktest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SynktestApplication

fun main(args: Array<String>) {
	runApplication<SynktestApplication>(*args)
}
