package com.kafka.producer.usecase;

import com.kafka.producer.domain.Client;

import java.util.List;

public interface GetClientUseCase {

    List<Client> execute();
}
