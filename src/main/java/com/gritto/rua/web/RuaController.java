package com.gritto.rua.web;

import com.gritto.rua.service.RuaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RuaController {

    private final RuaService service;
}
