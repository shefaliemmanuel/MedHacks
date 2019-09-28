package com.example.postopapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


//parse data
@Entity()
public class Data {
    @PrimaryKey(autoGenerate = true)
    private int  userID;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "age")
    private int age;

    @ColumnInfo(name = "temp")
    private int temp;

    @ColumnInfo(name = "hr")
    private int hr;

    @ColumnInfo(name = "sbp")
    private int sbp;

    @ColumnInfo(name = "dbp")
    private int dbp;

    @ColumnInfo(name = "rr")
    private int rr;

    @ColumnInfo(name = "spo2")
    private int spo2;

    public int getUserID(){ return userID;}
    public String getFirstName() {return firstName;}
    public String getLastName(){ return lastName;}
    public int getAge() {return age;}

    public int getTemp() {
        return temp;
    }

    public int getHr() {
        return hr;
    }

    public int getSbp() {
        return sbp;
    }

    public int getDbp() {
        return dbp;
    }

    public int getRr() {
        return rr;
    }

    public int getSpo2() {
        return spo2;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public void setRr(int rr) {
        this.rr = rr;
    }

    public void setSpo2(int spo2) {
        this.spo2 = spo2;
    }
}
