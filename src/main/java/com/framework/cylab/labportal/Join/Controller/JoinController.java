package com.framework.cylab.labportal.Join.Controller;

import com.framework.cylab.labportal.Config.AjaxResult;
import com.framework.cylab.labportal.Join.Dao.JoinRepository;
import com.framework.cylab.labportal.Login.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class JoinController {

    @Autowired
    JoinRepository joinRepository;

    @GetMapping("/join")
    public String join() {
        return "join/join";
    }


    @PostMapping("/joinInsert")
    public @ResponseBody
    AjaxResult Join_insert(Customer customer) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));

        customer.setMAuth("A");
        customer.setCreated_date(new Date());

        joinRepository.save(customer);

        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode("success");

        return ajaxResult;

    }

}
