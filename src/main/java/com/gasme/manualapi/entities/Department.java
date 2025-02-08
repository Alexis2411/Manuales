package com.gasme.manualapi.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "departments")
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer departmenteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dealership")
    private Dealership dealership;

    @Column(name = "department_name", nullable = false)
    private String departmentName;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(name = "state_name", nullable = false)
    private String stateName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Rol> roles = new ArrayList<>();

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Manual> manuals = new ArrayList<>();

    public Department() {
    }

    public Department(Integer departmenteId, Dealership dealership, String departmentName, String cityName, String stateName, List<Rol> roles, List<Manual> manuals) {
        this.departmenteId = departmenteId;
        this.dealership = dealership;
        this.departmentName = departmentName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.roles = roles;
        this.manuals = manuals;
    }

    public Integer getDepartmenteId() {
        return departmenteId;
    }

    public void setDepartmenteId(Integer departmenteId) {
        this.departmenteId = departmenteId;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Manual> getManuals() {
        return manuals;
    }

    public void setManuals(List<Manual> manuals) {
        this.manuals = manuals;
    }
}
