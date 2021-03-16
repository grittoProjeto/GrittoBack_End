package com.gritto.uniaoFederativa.web;

import com.gritto.uniaoFederativa.service.UniaoFederativaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UniaoFederativaController {

    private final UniaoFederativaService service;
}
