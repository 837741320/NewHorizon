package com.qfedu.newhorizon.domain.user;


import java.io.Serializable;

public class Province implements Serializable {

    private Integer id;

    private String pname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
}