package basic_programs.CoinCollectionAssignment;

import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "Coin [aquiredDate=" + aquiredDate + ", country=" + country + ", denomination=" + denomination
                + ", mintingYear=" + mintingYear + ", value=" + value + "]";
    }

    public Coin search(String country, int denomination, ArrayList<Coin> list){
            for (Coin coin : list) {
                if(coin.getCountry().equals(country) && coin.getDenomination() == denomination){
                    return coin;
                }
            }
        
        return null;
    }

    public void search2(String country, int year, ArrayList<Coin> list){
        for (Coin coin : list) {
            if(coin.getCountry().equals(country) && coin.getMintingYear() == year){
                System.out.println(coin.toString());
            }
        }
    }

    public void search3(String country, int year, int denomination, ArrayList<Coin> list){
        for (Coin coin : list) {
            if(coin.getCountry().equals(country) && coin.getMintingYear() == year && coin.getDenomination() == denomination){
                System.out.println(coin.toString());
            }
        }
    }
}
