package com.brc.repositories;

import com.brc.models.UploadMetadata;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UploadMetadataRepository extends JpaRepository<UploadMetadata, Integer> {
    List<UploadMetadata> findByFileName(String fileName);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO upload_metadata (file_name, total_chunks, upload_state) VALUES(?1, ?2, ?3)", nativeQuery = true)
    void saveByFields(String fileName, int totalChunks, String state);
}
