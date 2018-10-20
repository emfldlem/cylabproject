package com.framework.cylab.labportal.Join.Controller;

import com.framework.cylab.labportal.Config.AjaxResult;
import com.framework.cylab.labportal.Join.Dao.JoinRepository;
import com.framework.cylab.labportal.Login.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value = "/join")
public class JoinController {

    @Autowired
    JoinRepository joinRepository;

    @GetMapping("")
    public String join_step1() {
        return "join/join_step1";
    }

    @GetMapping("/joinstep2")
    public String join_step2() {
        return "join/join_step2";
    }

    @GetMapping("/joinstep3")
    public String join_step3() {
        return "join/join_step3";
    }

    @GetMapping("/joinstep4")
    public String join_step4() {
        return "join/join_step4";
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
