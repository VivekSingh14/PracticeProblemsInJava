package basic_programs.CoinCollectionAssignment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class App {
    public static void main(String args[]){
        ArrayList<Coin> coincollection  = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Coin c1 = new Coin("India", 5, 2001, 5, df.parse("12-10-2011"));
            coincollection.add(c1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("***********************");
        for (Coin coin : coincollection) {
            System.out.println(coin.toString());
        }
    }
}
