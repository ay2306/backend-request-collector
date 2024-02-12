package com.brc.controllers;

import com.brc.reponses.InitializeResponse;
import com.brc.requests.InitializeRequest;
import com.brc.services.InitializeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InitializeController {
    @Autowired
    private InitializeService initializeService;
    @PostMapping(value = "/initialize", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    InitializeResponse initialize(@RequestBody InitializeRequest request){
        return initializeService.initialize(request.getFileName(), request.getChunkCounts());
    }
}

