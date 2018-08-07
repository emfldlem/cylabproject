package com.framework.cylab.labportal.Login.Model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@TableGenerator(name = "MY_GENERATOR", table = "SEQ_TABLE", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_VALUE", pkColumnValue = "USER_SEQ")
@Data
@Entity
@Table(name ="customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -7291882322359393649L;


    @Id
  //  @GeneratedValue(strategy = GenerationType.TABLE, generator = "MY_GENERATOR")
    @GenericGenerator(name="REQUEST_NO", strategy = "com.framework.cylab.labportal.Login.Model.ClientIdGenerator")
    @GeneratedValue(generator = "REQUEST_NO")
    @Column(name = "REQUEST_NO")
    private String requesetNo;

    @Column(name = "name")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "M_AUTH")
    private String mAuth;

    @Column(name = "created_date")
    private Date created_date;

    //private Collection<? extends GrantedAuthority> authorities;

    /*public Customer(String name, String email, Date created_date) {
        this.name = name;
        this.email = email;
        this.created_date = created_date;

    }
    public Customer() {}*/




}
