package basic_programs.CoinCollectionAssignment;

import java.util.Date;

public class Coin {
    private String country;
    private int denomination;
    private int mintingYear;
    private double value;
    private Date aquiredDate;

    public Coin(){}

    public Coin(String country, int denomination, int mintingYear, double value, Date aquiredDate) {
        this.country = country;
        this.denomination = denomination;
        this.mintingYear = mintingYear;
        this.value = value;
        this.aquiredDate = aquiredDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public int getMintingYear() {
        return mintingYear;
    }

    public void setMintingYear(int mintingYear) {
        this.mintingYear = mintingYear;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getAquiredDate() {
        return aquiredDate;
    }

    public void setAquiredDate(Date aquiredDate) {
        this.aquiredDate = aquiredDate;
    }

    
}
