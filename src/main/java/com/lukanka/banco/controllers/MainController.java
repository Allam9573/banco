package com.lukanka.banco.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/")
    public String index(@RequestParam String nombre) {
        return nombre;
    }

    @GetMapping(value = "/{nombre}")
    public String hola(@PathVariable String nombre) {
        return "new SomeData()";
    }

    @GetMapping(value = "/cuenta/{cuenta}")
    public String cuenta(@RequestBody String cuenta) {
        return cuenta;
    }

}
