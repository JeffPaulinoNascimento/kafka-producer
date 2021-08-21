package com.kafka.producer.external.kafka.impl;

import com.kafka.producer.domain.Client;
import com.kafka.producer.external.kafka.BaseClientProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class BaseClientProducerImpl implements BaseClientProducer {

    @Value("${spring.kafka.topic-client-consumer}")
    private String topic;

    private final KafkaTemplate<String, List<Client>> kafkaTemplate;

    @Override
    public void execute( List<Client> clients ) {

        log.info( "Enviando JSON para o tópico: {} ", topic );

        kafkaTemplate.send( topic, clients );

        log.info( "Finalizando o envio para o tópico producer" );
    }
}
