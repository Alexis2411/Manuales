package com.gasme.manualapi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.*;

@Entity
@Table(name = "manuals")
public class Manual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer manual_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(nullable = false)
    private String manual_name;

    @Column(nullable = false)
    private String manual_description;

    @Column
    private String manual_location;

    @Column(updatable = false, name = "created_at")
    @CreationTimestamp
    private Date manual_created_at;

    @ManyToMany(mappedBy = "manuals")
    private Set<Title> titles = new HashSet<>();

    @OneToMany(mappedBy = "manual", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoryAccess> historyAcccess = new ArrayList<>();

    @OneToMany(mappedBy = "manual", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VersionManual> versions = new ArrayList<>();
}
