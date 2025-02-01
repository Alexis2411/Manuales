package com.gasme.manualapi.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "titles")
@Entity
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department_id")
    private Department department;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "titles")
    private Set<User> users = new HashSet<User>();

    @ManyToMany
    @JoinTable(
            name = "titles_manuals",
            joinColumns = @JoinColumn(name = "title_id"),
            inverseJoinColumns = @JoinColumn(name="manual_id")
    )
    private Set<Manual> manuals = new HashSet<>();
}
