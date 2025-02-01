package com.gasme.manualapi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "versions_manual")
public class VersionManual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer versionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manual_id")
    private Manual manual;

    @Column(nullable = false)
    private String version;

    @Column(nullable = false)
    private String changes;

    @CreationTimestamp
    @Column(updatable = false, name = "create_at")
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String data;
}
