package com.gritto.publicacao.service;

import com.gritto.publicacao.domain.repository.PublicacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublicacaoService {

    private final PublicacaoRepository repository;

}
