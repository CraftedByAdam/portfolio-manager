package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double Karat;

    public Jewelry(double Karat){
        super("Jewelry",0);
        this.Karat = Karat;
    }

    @Override
    public double getValue(){
        double baseValue = 0;
        double karatValue = Karat * 5000;
        return baseValue + karatValue;
    }
}
