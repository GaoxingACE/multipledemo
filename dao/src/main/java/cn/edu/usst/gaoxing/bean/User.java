package cn.edu.usst.gaoxing.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1435515995276255188L;


    private Integer userid;

    private String username;

    private Integer copyrationid;

    private String gender;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCopyrationid() {
        return copyrationid;
    }

    public void setCopyrationid(Integer copyrationid) {
        this.copyrationid = copyrationid;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}