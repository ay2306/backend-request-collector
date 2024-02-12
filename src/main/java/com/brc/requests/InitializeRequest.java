package com.brc.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class InitializeRequest {
    private String fileName;
    private int chunkCounts;
}
