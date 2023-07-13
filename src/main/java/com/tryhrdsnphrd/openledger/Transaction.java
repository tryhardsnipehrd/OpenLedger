package com.tryhrdsnphrd.openledger;


import java.time.LocalDate;

public class Transaction {

    private String Location;
    private LocalDate Date;
    private Money Total;
    private String Memo;
    private String[] Tags;

    public Transaction(String Location, LocalDate Date, Money Total, String Memo, String[] Tags) {
        this.Location = Location;
        this.Date = Date;
        this.Total = Total;
        this.Memo = Memo;
        this.Tags = Tags;
    }

    public String getLocation() {
        return Location;
    }

    public LocalDate getDate() {
        return Date;
    }

    public Money getTotal() {
        return Total;
    }

    public String getMemo() {
        return Memo;
    }

    public String[] getTags() {
        return Tags;
    }

}
