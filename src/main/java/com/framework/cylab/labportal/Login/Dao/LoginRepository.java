package com.framework.cylab.labportal.Login.Dao;

import com.framework.cylab.labportal.Login.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends CrudRepository<Customer, Long> {
    //@Query(nativeQuery = true, value="select * from customer where name = :Name")
    Customer findByName(@Param("Name") String Name);
    //List<String> authFindbyName(String Name);


}
