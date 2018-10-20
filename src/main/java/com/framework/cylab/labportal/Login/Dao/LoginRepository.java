package com.framework.cylab.labportal.Login.Dao;

import com.framework.cylab.labportal.Member.Model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends CrudRepository<Member, String> {
    //@Query(nativeQuery = true, value="select * from customer where name = :Name")
    Member findByMemberId(@Param("MemberId") String MemberId);



}
