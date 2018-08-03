package com.framework.cylab.labportal.Login.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name ="customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -7291882322359393649L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", created_date=" + created_date +
                '}';
    }
}
