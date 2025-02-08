package com.gasme.manualapi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "versions_manuals")
public class VersionManual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "version_id")
    private Integer versionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manual_id")
    private Manual manual;

    @Column(name = "version_code", nullable = false)
    private Double versionCode;

    @Column(name = "edition_code", nullable = false)
    private Double editionCode;

    @Column(name = "revision_code", nullable = false)
    private Integer revisionCode;

    @Column(name = "effective_date", nullable = false)
    private LocalDateTime effectiveDate;

    @Column(nullable = false)
    private String changes;

    @CreationTimestamp
    @Column(updatable = false, name = "create_at")
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String data;

    public VersionManual() {
    }

    public VersionManual(Integer versionId, Manual manual, Double versionCode, Double editionCode, Integer revisionCode, LocalDateTime effectiveDate, String changes, LocalDateTime createdAt, String data) {
        this.versionId = versionId;
        this.manual = manual;
        this.versionCode = versionCode;
        this.editionCode = editionCode;
        this.revisionCode = revisionCode;
        this.effectiveDate = effectiveDate;
        this.changes = changes;
        this.createdAt = createdAt;
        this.data = data;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Manual getManual() {
        return manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    public Double getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Double versionCode) {
        this.versionCode = versionCode;
    }

    public Double getEditionCode() {
        return editionCode;
    }

    public void setEditionCode(Double editionCode) {
        this.editionCode = editionCode;
    }

    public Integer getRevisionCode() {
        return revisionCode;
    }

    public void setRevisionCode(Integer revisionCode) {
        this.revisionCode = revisionCode;
    }

    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
