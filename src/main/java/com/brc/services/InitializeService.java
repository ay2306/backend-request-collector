package com.brc.services;

import com.brc.reponses.InitializeResponse;
import org.springframework.stereotype.Service;

@Service
public class InitializeService {
    public InitializeResponse initialize(String fileName, int chunkCount){
        return InitializeResponse.builder().success(true).isNewEntry(true).build();
    }
}