package com.gasme.manualapi.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="dealership")
public class Dealership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dealership_id;

    @Column(nullable = false)
    private String dealership_name;

    @Column(nullable = false)
    private String dealership_address;

    @Column(nullable = false)
    private String dealership_city;

    @OneToMany(mappedBy = "dealership", cascade = CascadeType.ALL)
    private List<Department> departments = new ArrayList<Department>();

}
