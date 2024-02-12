package com.brc.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UploadSummary {
    private boolean completed;
    private List<Integer> remainingChunks;
}
