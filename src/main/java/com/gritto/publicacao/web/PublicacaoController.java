package com.gritto.publicacao.web;

import com.gritto.publicacao.service.PublicacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PublicacaoController {

    private final PublicacaoService service;
}
