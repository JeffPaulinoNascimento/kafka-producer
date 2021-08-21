package com.kafka.producer.usecase.impl;

import com.kafka.producer.domain.Client;
import com.kafka.producer.external.gateway.ClientGateway;
import com.kafka.producer.usecase.GetClientUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetClientUseCaseImpl implements GetClientUseCase {

    private final ClientGateway gateway;

    @Override
    public List<Client> execute() {

        return gateway.getClients();

    }
}
