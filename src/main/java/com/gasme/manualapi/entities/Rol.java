package com.gasme.manualapi.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "roles")
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id")
    private Integer rolId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department_id")
    private Department department;

    @Column(name = "rol_name", nullable = false)
    private String rolName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();

    @OneToMany(mappedBy = "rol")
    private Set<PermissionManual> permissionManuals = new HashSet<>();

    public Rol() {
    }

    public Rol(Integer rolId, Department department, String rolName, Set<User> users, Set<PermissionManual> permissionManuals) {
        this.rolId = rolId;
        this.department = department;
        this.rolName = rolName;
        this.users = users;
        this.permissionManuals = permissionManuals;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<PermissionManual> getPermissionManuals() {
        return permissionManuals;
    }

    public void setPermissionManuals(Set<PermissionManual> permissionManuals) {
        this.permissionManuals = permissionManuals;
    }
}
