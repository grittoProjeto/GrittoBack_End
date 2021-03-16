package com.gritto.uniaoFederativa.service;

import com.gritto.uniaoFederativa.domain.repository.UniaoFederativaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniaoFederativaService {

    private final UniaoFederativaRepository repository;

}
