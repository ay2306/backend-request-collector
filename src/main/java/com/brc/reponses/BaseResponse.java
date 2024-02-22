package com.brc.reponses;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseResponse {
    public enum Status{
        SUCCESS,
        FAILED
    }
    Status status;
    String message;
}
