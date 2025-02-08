package com.gasme.manualapi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "manuals")
public class Manual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manual_id")
    private Integer manualId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "manual_name", nullable = false)
    private String manualName;

    @OneToMany(mappedBy = "manual")
    private Set<PermissionManual> permissionManuals;

    @OneToMany(mappedBy = "manual", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoryAccess> historyAcccess = new ArrayList<>();

    @OneToMany(mappedBy = "manual", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VersionManual> versions = new ArrayList<>();

    public Manual() { }

    public Manual(Integer manualId, Department department, String manualName, Set<PermissionManual> permissionManuals, List<HistoryAccess> historyAcccess, List<VersionManual> versions) {
        this.manualId = manualId;
        this.department = department;
        this.manualName = manualName;
        this.permissionManuals = permissionManuals;
        this.historyAcccess = historyAcccess;
        this.versions = versions;
    }

    public Integer getManualId() {
        return manualId;
    }

    public void setManualId(Integer manualId) {
        this.manualId = manualId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getManualName() {
        return manualName;
    }

    public void setManualName(String manualName) {
        this.manualName = manualName;
    }

    public Set<PermissionManual> getPermissionManuals() {
        return permissionManuals;
    }

    public void setPermissionManuals(Set<PermissionManual> permissionManuals) {
        this.permissionManuals = permissionManuals;
    }

    public List<HistoryAccess> getHistoryAcccess() {
        return historyAcccess;
    }

    public void setHistoryAcccess(List<HistoryAccess> historyAcccess) {
        this.historyAcccess = historyAcccess;
    }

    public List<VersionManual> getVersions() {
        return versions;
    }

    public void setVersions(List<VersionManual> versions) {
        this.versions = versions;
    }
}
