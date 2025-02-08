package com.gasme.manualapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "permission_manual")
public class PermissionManual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private Integer permissionId;

    private boolean access;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "manual_id")
    private Manual manual;

    public PermissionManual() {
    }

    public PermissionManual(int permissionId, boolean access, Rol rol, Manual manual) {
        this.permissionId = permissionId;
        this.access = access;
        this.rol = rol;
        this.manual = manual;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Manual getManual() {
        return manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }
}
