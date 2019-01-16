package org.fasttrackit;

public class Add {



    public int addingNumbers(int x, int y){

        int total = x+y;
        System.out.println(x+" + "+y+" = "+total);
        return(total);
    }
    public double addingNumbers(int x){
        return addingNumbers(x, 2);
    }
}
