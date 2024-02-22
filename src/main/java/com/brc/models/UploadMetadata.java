package com.brc.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "upload_metadata")
@NoArgsConstructor
public class UploadMetadata {
    public enum UploadState{
        INITIATED,
        IN_PROGRESS,
        PAUSED,
        TERMINATED,
        UNKNOWN;

        public static UploadState fromValue(String value) {
            try {
                return UploadState.valueOf(value);
            } catch (IllegalArgumentException e) {
                return UNKNOWN;
            }
        }
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fileName;

    private Integer totalChunks;

    @Enumerated(EnumType.STRING)
    private UploadState uploadState;
}
