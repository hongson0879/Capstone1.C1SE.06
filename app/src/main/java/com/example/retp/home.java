package com.example.retp;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class home {
    private int RE_id;
    private String title;
    private String Description;
    private Boolean status;
    private String Imagepath;
    private String Address;
    private DecimalFormat longitude;
    private DecimalFormat latitude;
    private int userid;
    private DateTimeFormatter posteddate;
    private DateTimeFormatter updatedate;

    public int getRE_id() {
        return RE_id;
    }

    public void setRE_id(int RE_id) {
        this.RE_id = RE_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getImagepath() {
        return Imagepath;
    }

    public void setImagepath(String imagepath) {
        Imagepath = imagepath;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public DecimalFormat getLongitude() {
        return longitude;
    }

    public void setLongitude(DecimalFormat longitude) {
        this.longitude = longitude;
    }

    public DecimalFormat getLatitude() {
        return latitude;
    }

    public void setLatitude(DecimalFormat latitude) {
        this.latitude = latitude;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public DateTimeFormatter getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(DateTimeFormatter posteddate) {
        this.posteddate = posteddate;
    }

    public DateTimeFormatter getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(DateTimeFormatter updatedate) {
        this.updatedate = updatedate;
    }
}
