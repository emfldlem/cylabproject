package com.framework.cylab.labportal.Login.Model;

import com.framework.cylab.labportal.Member.Model.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecurityCustomer extends CyUser {

    private static final String ROLE_PREFIX = "ROLE_";
    private static final Long serialVersionUID = 1L;

    public SecurityCustomer(Member member) {
        super(member.getMemberId(), member.getMemberPw(), makeGrantedAuthority(member.getMemberAuth()), member.getMemberEmail());
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
