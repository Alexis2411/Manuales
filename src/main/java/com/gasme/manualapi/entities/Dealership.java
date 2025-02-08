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
    @Column(name = "dealership_id")
    private Integer dealershipId;

    @Column(nullable = false, name = "dealership_name")
    private String dealershipName;

    @Column(nullable = false, name = "dealership_address")
    private String dealershipAddress;

    @Column(nullable = false, name = "dealership_city")
    private String dealershipCity;

    @OneToMany(mappedBy = "dealership", cascade = CascadeType.ALL)
    private List<Department> departments = new ArrayList<Department>();

    public Dealership() {
    }

    public Dealership(Integer dealershipId, String dealershipName, String dealershipAddress, String dealershipCity, List<Department> departments) {
        this.dealershipId = dealershipId;
        this.dealershipName = dealershipName;
        this.dealershipAddress = dealershipAddress;
        this.dealershipCity = dealershipCity;
        this.departments = departments;
    }

    public Integer getDealershipId() {
        return dealershipId;
    }

    public void setDealershipId(Integer dealershipId) {
        this.dealershipId = dealershipId;
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public String getDealershipAddress() {
        return dealershipAddress;
    }

    public void setDealershipAddress(String dealershipAddress) {
        this.dealershipAddress = dealershipAddress;
    }

    public String getDealershipCity() {
        return dealershipCity;
    }

    public void setDealershipCity(String dealershipCity) {
        this.dealershipCity = dealershipCity;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
