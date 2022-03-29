package com.example.dem02;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "Users")


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "mobilenumber")
    public String mobilenumber;
    @Column(name = "email")
    public String email;
    @Column(name = "psw")
    public String psw;
    @Column(name = "pswrepeat")
    public String pswrepeat;
    @Column(name = "name")
    public String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getPswrepeat() {
        return pswrepeat;
    }

    public void setPswrepeat(String pswrepeat) {
        this.pswrepeat = pswrepeat;
    }


}
