package DesignPatterns.Behavioral.chainOfResponsibility;

public class TestChainApp {
    public static void main(String args[]){
        Chain chain = new Chain();
        chain.process(new Number(90)); 
        chain.process(new Number(-50)); 
        chain.process(new Number(0)); 
        chain.process(new Number(91)); 

    }   
}
