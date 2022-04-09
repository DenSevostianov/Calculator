package com.neoflex.den.controller;

import com.neoflex.den.model.ArithmeticModel;
import com.neoflex.den.service.ArithmeticService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "ArithmeticController", description = "Выполнение арифметических операций")
@RestController
@RequestMapping("/arithmetic")
public class ArithmeticController {

    ArithmeticService arithmeticService;

    @Autowired
    public ArithmeticController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/{oneNumber}")
    public ResponseEntity<ArithmeticModel> findResult(@PathVariable Long oneNumber, Long secondNumber, char action) {

        return ResponseEntity.ok(arithmeticService.getResult(oneNumber, secondNumber, action));
    }
}
