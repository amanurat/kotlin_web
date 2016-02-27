package mocha.kotlin_web

import org.springframework.boot.SpringApplication
import mocha.kotlin_web.controller.HelloController
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class App {
    companion object {
        @JvmStatic fun main(vararg args : String) {
            SpringApplication.run(App::class.java, *args);
        }
    }
}
