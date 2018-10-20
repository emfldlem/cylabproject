package com.framework.cylab.labportal.Login.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CyUser extends User {


    private static final long serialVersionUID = 8072212532126765488L;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CyUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String email) {
        super(username, password, true, true, true, true, authorities);
        this.email = email;
    }
}