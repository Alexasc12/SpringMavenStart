package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String getStart() {
        return "Приложение запущенно!";
    }

    @GetMapping("/info")
    @ResponseBody
    public String getInfo() {
        return "  \"Имя \" : \"Александр\",\n" +
                "    \"Название проекта\" : \"SpringMavenStart\",\n" +
                "    \"Дата создания\" : \"27.02.2023\",\n" +
                "    \"Описание\" : \"создает энд поинты т.е два гет запроса\"";
    }


}