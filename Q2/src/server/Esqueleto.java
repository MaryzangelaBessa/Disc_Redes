package server;

public class Esqueleto {

    Calculator calc = new Calculator();

    public String add (String args){
        String array [] = args.split(" ");
        return Double.toString(calc.add((Double.parseDouble(array[1])),(Double.parseDouble(array[2]))));
    }

    public String sub (String args){
        String array [] = args.split(" ");
        return Double.toString(calc.sub((Double.parseDouble(array[1])),(Double.parseDouble(array[2]))));
    }

    public String mult (String args){
        String array [] = args.split(" ");
        return Double.toString(calc.mult((Double.parseDouble(array[1])),(Double.parseDouble(array[2]))));
    }

    public String div (String args){
        String array [] = args.split(" ");
        return Double.toString(calc.div((Double.parseDouble(array[1])),(Double.parseDouble(array[2]))));
    }
}
