package com.framework.cylab.labportal.Member.Dao;

import com.framework.cylab.labportal.Member.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {


}
