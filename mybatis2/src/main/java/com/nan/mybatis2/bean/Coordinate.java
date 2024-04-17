package com.nan.mybatis2.bean;

/**
 * @author shuimiao
 * @date 2020-06-28-10:54
 */
public class Coordinate {
    private Integer id;
    private String hxArrary;
    private String vxArrary;
    private String axArrary;
    private String conclusion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHxArrary() {
        return hxArrary;
    }

    public void setHxArrary(String hxArrary) {
        this.hxArrary = hxArrary;
    }

    public String getVxArrary() {
        return vxArrary;
    }

    public void setVxArrary(String vxArrary) {
        this.vxArrary = vxArrary;
    }

    public String getAxArrary() {
        return axArrary;
    }

    public void setAxArrary(String axArrary) {
        this.axArrary = axArrary;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
