package com.company.hometask_17;

public class Tyre {
    public  String brand;
    private  String season;
    protected int widthMm;
    double aspectRatioPercent;
    public int innerDiameterInch;
    private double price;

    public Tyre(String brand, String season, int widthMm, double aspectRatioPercent, int innerDiameterInch, double price) {
        this.brand = brand;
        this.season = season;
        this.widthMm = widthMm;
        this.aspectRatioPercent = aspectRatioPercent;
        this.innerDiameterInch = innerDiameterInch;
        this.price = price;
    }

    private Tyre(String brand, int innerDiameterInch, double price) {
        this.brand = brand;
        this.innerDiameterInch = innerDiameterInch;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getWidthMm() {
        return widthMm;
    }

    public void setWidthMm(int widthMm) {
        this.widthMm = widthMm;
    }

    public double getAspectRatioPercent() {
        return aspectRatioPercent;
    }

    public void setAspectRatioPercent(double aspectRatioPercent) {
        this.aspectRatioPercent = aspectRatioPercent;
    }

    public int getInnerDiameterInch() {
        return innerDiameterInch;
    }

    public void setInnerDiameterInch(int innerDiameterInch) {
        this.innerDiameterInch = innerDiameterInch;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", widthMm=" + widthMm +
                ", aspectRatioPercent=" + aspectRatioPercent +
                ", innerDiameterInch=" + innerDiameterInch +
                ", price=" + price +
                '}';
    }

    public void totalHeightMm(){
        System.out.println("Total height of the tyre "+brand+" is "+((innerDiameterInch*25.4)+((widthMm*
                (aspectRatioPercent/100))*2))+" mm.");
    }

    private double pricePerSet(int quantity){
        return price*quantity;
    }
}
