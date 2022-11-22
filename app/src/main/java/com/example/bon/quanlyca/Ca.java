package com.example.bon.quanlyca;

import java.io.Serializable;

public class Ca implements Serializable {
    private  String id;
    private  String tenkhoahoc;
    private  String tenthuonggoi;
    private  String mau;

    @Override
    public String toString() {
        return "Ca{" +
                "id='" + id + '\'' +
                ", tenkhoahoc='" + tenkhoahoc + '\'' +
                ", tenthuonggoi='" + tenthuonggoi + '\'' +
                ", mau='" + mau + '\'' +
                '}';
    }

    public Ca(String id, String tenkhoahoc, String tenthuonggoi, String mau) {
        this.id = id;
        this.tenkhoahoc = tenkhoahoc;
        this.tenthuonggoi = tenthuonggoi;
        this.mau = mau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public void setTenkhoahoc(String tenkhoahoc) {
        this.tenkhoahoc = tenkhoahoc;
    }

    public String getTenthuonggoi() {
        return tenthuonggoi;
    }

    public void setTenthuonggoi(String tenthuonggoi) {
        this.tenthuonggoi = tenthuonggoi;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
}
