package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        Add adding = new Add();
        Minus minus = new Minus();
        int total = adding.addingNumbers(4,7);
        int subtract = minus.minusNumbers(6,3);
    }
}
