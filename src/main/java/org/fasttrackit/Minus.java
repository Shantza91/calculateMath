package org.fasttrackit;

public class Minus {

    public int minusNumbers(int x, int y){

        int total = x-y;
        System.out.println(x+" - "+y+" = "+total);
        return(total);
    }

    public double minusNumbers(int x){
        return minusNumbers(x,5);
    }
}
