package com.kafka.producer.external.gateway.impl;

import com.kafka.producer.domain.Account;
import com.kafka.producer.domain.Client;
import com.kafka.producer.external.gateway.ClientGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
public class ClientGatewayImpl implements ClientGateway {

    @Override
    public List<Client> getClients() {

        log.info( " **** Buscando clientes... **** " );

        return Arrays.asList(

                Client.builder()
                        .name( "Jubileu" )
                        .cpf( "41265478969" )
                        .accounts(
                                Arrays.asList(
                                        Account.builder()
                                                .agency( "0324" )
                                                .number( "12236" )
                                                .bank( "Bradesco" )
                                                .build(),
                                        Account.builder()
                                                .agency( "0555" )
                                                .number( "66584" )
                                                .bank( "Itau" )
                                                .build() ) )
                        .build(),

                Client.builder()
                        .name( "Henrique" )
                        .cpf( "88745698545" )
                        .accounts(
                                Arrays.asList(
                                        Account.builder()
                                                .agency( "4565" )
                                                .number( "789545" )
                                                .bank( "Bradesco" )
                                                .build(),
                                        Account.builder()
                                                .agency( "9874" )
                                                .number( "123456" )
                                                .bank( "Itau" )
                                                .build() ) )
                        .build() );
    }
}