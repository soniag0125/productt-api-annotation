package com.wiredbraincoffe.producttapiannotation.controller;

import com.wiredbraincoffe.producttapiannotation.model.CustomerSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/csid")
public class CustomerSessionController {

    @GetMapping()
    public Mono<CustomerSession> getCSID() {
        return Mono.just(CustomerSession.builder().CSID("123456").date("20200405").time("231234333").build());
    }

}
