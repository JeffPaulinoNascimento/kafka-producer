package com.kafka.producer.endpoint;

import com.kafka.producer.usecase.ClientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class ManagerClientController {

    private final ClientUseCase clientUseCase;

    @PostMapping("/clients")
    public void postClientTopic() {

        clientUseCase.execute();

    }
}
