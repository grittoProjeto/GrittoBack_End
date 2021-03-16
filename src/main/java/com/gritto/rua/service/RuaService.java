package com.gritto.rua.service;

import com.gritto.rua.domain.repository.RuaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RuaService {

    private final RuaRepository repository;

}
