package com.diconium;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fahrbsve on 25/04/17.
 */

@Controller
@EnableAutoConfiguration
public class NewsBotController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "¡Hola mundo!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NewsBotController.class, args);
    }
}
