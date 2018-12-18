package com.example.win10.library_main;

public class Data_Model {

    // Getter and Setter model for recycler view items
    private String titleName;
    private String titleview;
    private String titlerate;

    private int imageLogo;

    public Data_Model(String titleName,String titleview, String titlerate,int imageLogo) {

        this.titleName = titleName;
        this.titleview = titleview;
        this.titlerate = titlerate;


        this.imageLogo = imageLogo;
    }

    public String getTitleName() {
        return titleName;
    }
    public String getViewName() {
        return titleview;
    }
    public String getRateName() {
        return titlerate;
    }


    public int getImageLogo() {
        return imageLogo;
    }
}