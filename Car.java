//package group8.Main;
package GUI_SelfPractice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasmineshin
 */
public class Car {
    
    private String id;
    private String name;
    private String make;
    private String engine;
    private String model;
    private String transmission;
    private int year;
    private int stockNumber;
    private String fuel;
    private String VIN;
    private double msrp;
    private CarCategory carCategory;
    private String exteriorColor;
    private String interiorColor;
    private String location;
    private int mileage;
    private int seatCount;
    private int ratings;
    private double discount = 1.0;
    private String vehicleDescription;
    private String dealersInformation;

    //engine
    //picture
    public enum CarCategory {
        USED,
        NEW,
        CERTIFIEDPREOWNED
    }
    public Car(){
        this.id = "1234";
        this.make = "2010";
        this.model = "Acura MDX SH-AWD w/Advance";
        this.name = this.make+" "+this.model;
        this.year = 2010;
        this.msrp = 13955;
        this.carCategory = CarCategory.USED;
        this.exteriorColor = "Silver";
        this.interiorColor = "Gray";
        this.engine = "3.7L V6";
        this.transmission = "Automatic 6-Speed";
        this.fuel = "Gasoline";
        this.VIN = "2HNYD2H59AH533278";
        this.stockNumber = 738;
        this.seatCount = 4;
        this.mileage = 1174;
        this.ratings = 4;
        this.dealersInformation = "Daily Deals Auto Sale \n8100 Ane North\nWashington";
        this.vehicleDescription = "Beautiful White Frost. Abel Chevrolet Buick. Many Financing Options available. Credit Challenged? We can help! We have great relationships with many lenders which allows us to offer financing that many others can't! We're here to help you get in the vehicle you want! At Abel, we do our best to offer you an unique experience when purchasing a New or Pre-Owned vehicle. Unlike traditional car dealers, we offer a non-pressured environment giving you the time and space to make an informed decision. Our advertised prices are our best deal upfront. No Games, just fair prices and outstanding customer service. We won't waste your time! Once you've found the Abel Vehicle you're looking for, on average, you'll go from test drive to driving home in less than an hour!";
    }
//    public Car(String id,String name, String make, String model, int year, double msrp, boolean used,
//                String color, String location, int mileage){
//        this.id = id;
//        this.name = name;
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.msrp = msrp;
//        this.used = used;
//        this.color = color;
//        this.location = location;
//        this.mileage = mileage;
//    }
    
    /*******************  GETTER  *******************/
    public String getID(){
        return id;
    }
    public String getName(){
        return this.name;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getMSRP(){
        return msrp;
    }
    public String getCarCategory() {
        return carCategory.toString();
    }
    public String getExteriorColor(){
        return exteriorColor;
    }
    public String getInteriorColor() {
        return this.interiorColor;
    }
    public int getStockNumber(){return this.stockNumber;}
    public String getVIN(){ return this.VIN; }
    public String getTransmission(){
        return this.transmission;
    }
    public String getEngine(){
        return this.engine;
    }

    public String getFuel(){
        return this.fuel;
    }
    public String getLocation(){
        return location;
    }
    public int getMileage(){
        return mileage;
    }
    public int getSeatCount(){
        return seatCount;
    }
    public int getRatings(){
        return ratings;
    }
    public double getPriceAfterDiscount(){
        return msrp * discount;
    }
    public String getVehicleDescription(){
        return this.vehicleDescription;
    }
    public String getDealersInformation(){
        return this.dealersInformation;
    }
    /*******************  SETTER  *******************/
    public void setID(String id){
        this.id = id;
    }
    public void setName(String Name){
        this.name = name;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMSRP(double msrp){
        this.msrp = msrp;
    }
//    public void setUsed(boolean used){
//        this.used = used;
//    }
//    public void setColor(String color){
//        this.color = color;
//    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setMileage(int mileage){
        this.mileage =  mileage;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
}