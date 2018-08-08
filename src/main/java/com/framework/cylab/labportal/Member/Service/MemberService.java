package com.framework.cylab.labportal.Member.Service;

import com.framework.cylab.labportal.Member.Dao.MemberRepository;
import com.framework.cylab.labportal.Member.Model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public Page<Member> getAllmemberList(Pageable page){

        int pageSize = page.getPageSize();
        int currentPage = page.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Member> list;
        List<Member> actlist = memberRepository.findAll();

        if(actlist.size() < startItem) {
            list = Collections.emptyList();
        }
        else {
            int toIndex = Math.min(startItem+pageSize, actlist.size());
            list = actlist.subList(startItem, toIndex);
        }

        Page<Member> memberPage = new PageImpl<Member>(list, PageRequest.of(currentPage,pageSize), actlist.size());

        return memberPage;
    }
}
