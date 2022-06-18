package com.example.mybmi;

public class bmiclass {
    private double h, w;
    public bmiclass(double h, double w)
    {
        this.w = w;
        this.h = h;
    }
    public double getBMI(){
        double bmi = w/(h*h);
        return bmi;
    }
    public String getChuanDoan(){
        double bmi = this.getBMI();
        String kq="";
        if(bmi<18) kq="Gầy";
        else if(bmi<=24.9) kq="Bình thường";
        else if(bmi<=29.9) kq="Béo phì cấp độ I";
        else if(bmi<=34.9) kq="Béo phì cấp độ II";
        else kq="Béo phì cấp độ II";
        return kq;
    }
}
