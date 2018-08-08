package com.framework.cylab.labportal.Member.Controller;

import com.framework.cylab.labportal.Member.Model.Member;
import com.framework.cylab.labportal.Member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Controller
@RequestMapping("/member")
public class MemberController {


    @Autowired
    MemberService memberService;

    private static int currentPage = 1;
    private static int pageSize = 10;

    @GetMapping("")
    public String getMemberList(Model model) {

        PageRequest pageRequest = new PageRequest(0,10);

        Page<Member> MemberPage = memberService.getAllmemberList(pageRequest);
        model.addAttribute("memberList", MemberPage);


        int totalPages = MemberPage.getTotalPages();
        if(totalPages > 0 ) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "member/memberList";
    }

    @GetMapping("/listmember")
    public String getPageMemberList(Model model,
                                    @RequestParam("page") Optional<Integer> page,
                                    @RequestParam("size") Optional<Integer> size) {

        page.ifPresent(p -> currentPage = p);
        size.ifPresent(s -> pageSize = s);

        PageRequest pageRequest = new PageRequest(0,10);

        Page<Member> MemberPage = memberService.getAllmemberList(PageRequest.of(currentPage-1,pageSize));
        model.addAttribute("memberList", MemberPage);


        int totalPages = MemberPage.getTotalPages();
        if(totalPages > 0 ) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "member/memberList";
    }




}
