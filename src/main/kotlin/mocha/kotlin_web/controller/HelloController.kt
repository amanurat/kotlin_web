package mocha.kotlin_web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {
    @RequestMapping("/")
    @ResponseBody
    fun home(): String {
        return "Hello, Spring Boot!"
    }
}
