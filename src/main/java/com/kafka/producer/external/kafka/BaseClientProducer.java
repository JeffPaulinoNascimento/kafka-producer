package com.kafka.producer.external.kafka;


import com.kafka.producer.domain.Client;

import java.util.List;

public interface BaseClientProducer {

    void execute( List<Client> clients );

}
