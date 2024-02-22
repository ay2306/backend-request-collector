package com.brc.services;

import com.brc.models.UploadMetadata;
import com.brc.reponses.BaseResponse;
import com.brc.reponses.InitializeResponse;
import com.brc.repositories.UploadMetadataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InitializeService {
    @Autowired
    private UploadMetadataRepository uploadMetadataRepository;
    public InitializeResponse initialize(String fileName, int chunkCount){
        List<UploadMetadata> findOneMetadata = uploadMetadataRepository.findByFileName(fileName);
        if(findOneMetadata.size() != 0){
            // TODO(#1): Make changes for resume feature.
            return InitializeResponse.builder().status(BaseResponse.Status.FAILED).message("File Already Exists").build();
        }
        uploadMetadataRepository.saveByFields(fileName, chunkCount, UploadMetadata.UploadState.INITIATED.name());
        return InitializeResponse.builder().status(BaseResponse.Status.SUCCESS).isNewEntry(true).build();
    }
}