package com.ucx.training.demo.entity;

import com.ucx.training.demo.type.RecordStatus;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import java.time.LocalDateTime;

public class FileEntity extends BaseEntity<Integer> {

    private String fileName;
    private String fileType;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "DATA", columnDefinition = "BLOB", nullable = false)
    private byte[] data;

    // save the file size in the db
    @CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    @Builder
    public FileEntity(Integer id, String name, RecordStatus recordStatus) {
        super(id, recordStatus);
        this.fileName = name;
    }
}
