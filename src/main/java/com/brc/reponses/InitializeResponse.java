package com.brc.reponses;

import com.brc.entities.UploadSummary;
import com.brc.models.UploadMetadata;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class InitializeResponse extends BaseResponse{
    private boolean isNewEntry;
    @Nullable
    private UploadSummary uploadSummary;
}
