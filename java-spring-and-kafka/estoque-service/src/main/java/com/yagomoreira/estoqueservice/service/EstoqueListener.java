package com.yagomoreira.estoqueservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EstoqueListener {

    @KafkaListener(topics = "estoque-topico", groupId = "estoque-group")
    public void processarVenda(String message) {
        System.out.println("Venda recebida: " + message);
    }
}
