package server;

public class Calculator {


    public double add (double opt1, double opt2){
        return opt1 + opt2;
    }

    public double sub (double opt1, double opt2){
        return opt1 - opt2;
    }

    public double mult (double opt1, double opt2){
        return opt1 * opt2;
    }

    public double div (double opt1, double opt2){

        if (opt2 == 0){
            return 0;
        }

        return opt1 / opt2;
    }
}
