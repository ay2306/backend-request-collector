package com.brc.reponses;

import com.brc.entities.UploadSummary;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Datals
@Builder
public class InitializeResponse {
    private boolean isNewEntry;
    private boolean success;
    @Nullable
    private UploadSummary uploadSummary;
}
