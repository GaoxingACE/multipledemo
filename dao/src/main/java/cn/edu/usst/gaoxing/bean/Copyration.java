package cn.edu.usst.gaoxing.bean;

import java.io.Serializable;

public class Copyration implements Serializable {

    private static final long serialVersionUID = 1435515995276255188L;
    private Integer copyrationid;

    private String copyrationname;

    private Integer parentcopyrationid;

    public Integer getCopyrationid() {
        return copyrationid;
    }

    public void setCopyrationid(Integer copyrationid) {
        this.copyrationid = copyrationid;
    }

    public String getCopyrationname() {
        return copyrationname;
    }

    public void setCopyrationname(String copyrationname) {
        this.copyrationname = copyrationname;
    }

    public Integer getParentcopyrationid() {
        return parentcopyrationid;
    }

    public void setParentcopyrationid(Integer parentcopyrationid) {
        this.parentcopyrationid = parentcopyrationid;
    }
}