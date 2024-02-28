package com.arquitecturahexagonal.arquetipo.adapters.driveradapters.restadapter;

import com.arquitecturahexagonal.arquetipo.domain.api.ExampleHandler;
import com.arquitecturahexagonal.arquetipo.domain.model.dto.ExampleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    private final ExampleHandler exampleHandler;

    @Autowired
    public ExampleRestController(ExampleHandler exampleHandler) {
        this.exampleHandler = exampleHandler;
    }

    @GetMapping("example/resource")
    public ExampleDto getExampleDtoData(@RequestParam("id") String id){
        return exampleHandler.getExampleDtoById(id);
    }

}
