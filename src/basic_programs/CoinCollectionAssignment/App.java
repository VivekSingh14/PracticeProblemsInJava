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
            Coin c2 = new Coin("India", 10, 2003, 10, df.parse("04-03-2021"));
            Coin c3 = new Coin("India", 20, 1998, 20, df.parse("06-01-2009"));
            Coin c4 = new Coin("India", 25, 1998, 25, df.parse("10-10-2003"));
            Coin c5 = new Coin("India", 30, 2006, 100, df.parse("08-10-2001"));
            Coin c6 = new Coin("India", 35, 2009, 50, df.parse("06-10-2003"));
            coincollection.add(c1);
            coincollection.add(c2);
            coincollection.add(c3);
            coincollection.add(c4);
            coincollection.add(c5);
            coincollection.add(c6);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("***********************");
        for (Coin coin : coincollection) {
            System.out.println(coin.toString());
        }

        System.out.println("********searching the coin from list based on country and denomination**********");
        Coin test = new Coin();
        System.out.println(test.search("India", 5, coincollection));
        System.out.println("#############################");
        System.out.println("********************searching the coin from the list based on country and minting year*******************************");
        test.search2("India", 1998, coincollection);
    }
}
