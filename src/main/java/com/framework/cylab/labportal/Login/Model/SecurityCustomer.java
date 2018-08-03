package com.framework.cylab.labportal.Login.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecurityCustomer extends CyUser {

    private static final String ROLE_PREFIX = "ROLE_";
    private static final Long serialVersionUID = 1L;

    public SecurityCustomer(Customer customer) {
        super(customer.getName(), customer.getPassword(), makeGrantedAuthority(customer.getMAuth()), customer.getEmail() );
        //super(customer.getEmail() , customer.getPassword(), customer.getName(), makeGrantedAuthority(customer.getMAuth()) );
    }

    private static List<GrantedAuthority> makeGrantedAuthority(String customerMauth) {
        List<String> MauthList = Arrays.asList(customerMauth.split(","));
        List<GrantedAuthority> oauth = new ArrayList<>();
        for(int i = 0; i<MauthList.size(); i++) {
            oauth.add(new SimpleGrantedAuthority(ROLE_PREFIX+MauthList.get(i)));
        }
        return oauth;
    }


}
