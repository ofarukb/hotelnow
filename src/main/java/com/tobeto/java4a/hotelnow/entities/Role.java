package com.tobeto.java4a.hotelnow.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    CUSTOMER, ADMIN, MANAGER;

    @Override
    public String getAuthority() {
        return name();
    }
}
