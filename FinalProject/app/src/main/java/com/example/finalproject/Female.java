package com.example.finalproject;

import java.io.Serializable;

public class Female implements Serializable {

    private int imagecourt ;
    public String courtname ;
    public String courtloca ;
    public String courtprice ;



    public Female(int imagecourt, String courtname, String courtloca, String courtprice) {
        this.imagecourt = imagecourt;
        this.courtname = courtname;
        this.courtloca = courtloca;
        this.courtprice = courtprice;
    }

    public int getImagecourt() {
        return imagecourt;
    }

    public void setImagecourt(int imagecourt) {
        this.imagecourt = imagecourt;
    }

    public String getCourtname() {
        return courtname;
    }

    public void setCourtname(String courtname) {
        this.courtname = courtname;
    }

    public String getCourtloca() {
        return courtloca;
    }

    public void setCourtloca(String courtloca) {
        this.courtloca = courtloca;
    }

    public String getCourtprice() {
        return courtprice;
    }

    public void setCourtprice(String courtprice) {
        this.courtprice = courtprice;
    }
}
