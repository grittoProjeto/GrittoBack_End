package com.gritto.bairro.service;

import com.gritto.bairro.domain.repository.BairroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BairroService {

    private final BairroRepository repository;

}
