package com.kafka.producer.usecase.impl;

import com.kafka.producer.domain.Client;
import com.kafka.producer.external.kafka.BaseClientProducer;
import com.kafka.producer.usecase.ClientUseCase;
import com.kafka.producer.usecase.GetClientUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class ClientUseCaseImpl implements ClientUseCase {

    private final BaseClientProducer producer;
    private final GetClientUseCase getClientUseCase;

    @Override
    public void execute() {

        log.info( "Chamando o getClienteUseCase" );

        List<Client> clients = getClientUseCase.execute();

        producer.execute( clients );

    }


}
