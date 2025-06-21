package com.library.controller;

import com.library.model.Publisher;
import com.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @PostMapping
    public Mono<Publisher> createPublisher(@RequestBody Publisher publisher) {
        return publisherService.createPublisher(publisher);
    }

    @GetMapping
    public Flux<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }
}
