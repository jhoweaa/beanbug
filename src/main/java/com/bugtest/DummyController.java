package com.bugtest;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class DummyController {
    @Get("dummy")
    public String result() {
        return "Hello";
    }
}
