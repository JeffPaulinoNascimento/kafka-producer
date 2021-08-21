package com.kafka.producer.external.gateway;

import com.kafka.producer.domain.Client;

import java.util.List;

public interface ClientGateway {

    List<Client> getClients();
}
