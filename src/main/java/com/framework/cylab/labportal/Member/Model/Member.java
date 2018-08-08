package com.framework.cylab.labportal.Member.Model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name ="T_TEST_MEMBER")
public class Member  implements Serializable {


    private static final long serialVersionUID = 7277181767719736127L;

    @Id
    @Column(name="MEMBER_ID")
    private  String memberId;
    @Column(name="MEMBER_PW")
    private  String memberPw;
    @Column(name="MEMBER_EMAIL")
    private  String memberEmail;
    @Column(name="MEMBER_AUTH")
    private  String memberAuth;
    @Column(name="REG_DT")
    private Date regDt;
    @Column(name="REG_USR")
    private  String regUsr;
    @Column(name="UPD_DT")
    private Date updDt;
    @Column(name="UPD_USR")
    private  String updUsr;





}
