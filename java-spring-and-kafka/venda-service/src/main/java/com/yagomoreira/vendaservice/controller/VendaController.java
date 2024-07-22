package com.yagomoreira.vendaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public VendaController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<Void> realizarVenda(@RequestBody String idProduto) {
        kafkaTemplate.send("estoque-topico", idProduto);
        return ResponseEntity.ok().build();
    }
}
