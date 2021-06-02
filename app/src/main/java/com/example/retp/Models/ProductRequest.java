package com.example.retp.Models;

import android.app.Dialog;
import android.view.View;
import android.widget.Toast;

public class ProductRequest {
    //public int re_id ;
    private String title ;
    private String description ;
    //  public Boolean status { set; get; }

    private String address;


    //public decimal longitude { set; get; }
    //public decimal latitude { set; get; }
    // public int userID { set; get; }
    // public DateTime postedDate { set; get; }
    // public DateTime updateDate { set; get; }
    public ProductRequest(){}
   public ProductRequest(String Title, String Description, String Address){
       // re_id = Re_id;
        title=Title;
        description=Description;
        address=Address;

    }

    /*public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
