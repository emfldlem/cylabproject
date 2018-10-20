package com.framework.cylab.labportal.Login.Service;

import com.framework.cylab.labportal.Login.Dao.LoginRepository;
import com.framework.cylab.labportal.Login.Model.SecurityCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return
                Optional.ofNullable(loginRepository.findByMemberId(username))
                .filter(m -> m!= null)
                .map(m->new SecurityCustomer(m)).get();
    }

}
