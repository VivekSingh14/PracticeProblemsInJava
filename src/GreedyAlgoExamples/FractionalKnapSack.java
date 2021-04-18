package GreedyAlgoExamples;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

    public static void main(String args[]){
        int[] weights = {10,20,30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        double maxValue = getMaxValue(weights, values, capacity);

        System.out.println("max value attainable: "+ maxValue);
    }

    public static double getMaxValue(int[] weights, int[] val, int capacity){

        WeightValue[] weightValue = new WeightValue[weights.length];

        for (int i = 0; i < weights.length; i++) { 
            weightValue[i] = new WeightValue(weights[i], val[i]); 
        } 
        
        Arrays.sort(weightValue, new Comparator() { 
            public int compare(WeightValue o1, WeightValue o2) 
            { 
                return o2.ratio.compareTo(o1.ratio); 
            } 
        }); 

        double totalValue = 0d; 
  
        for (WeightValue i : weightValue) { 
  
            int curWeight = (int)i.weight; 
            int curValue = (int)i.value; 
  
            if (capacity - curWeight >= 0)  
            { 
                // this weight can be picked while 
                capacity = capacity - curWeight; 
                totalValue += curValue; 
            } 
            else 
            { 
                // item cant be picked whole 
                double fraction 
                    = ((double)capacity / (double)curWeight); 
                totalValue += (curValue * fraction); 
                capacity 
                    = (int)(capacity - (curWeight * fraction)); 
                break; 
            } 
        } 
  
        return totalValue; 

    }

    static class WeightValue{
        Double ratio;
        double weight, value;

        public WeightValue(int weight, int value){
            this.weight = weight;
            this.value = value;
            
            //deprecated
            //ratio = new Double((double)value / (double)weight);
            //updated
            ratio = Double.valueOf((double)value / (double)weight );
        }
    }
    
}
