package client;

public class Proxy {

    TCPClient cliente = new TCPClient();

    public double calcular(String message){
        String array[] = message.split(" ");
        double op1 = Double.parseDouble(array[0]);
        double op2 = Double.parseDouble(array[2]);
        String operacao = array[1];

        if (operacao.equals("+")) return add(op1,op2);
        else if (operacao.equals("-")) return sub(op1,op2);
        else if (operacao.equals("*")) return mult(op1,op2);
        return div(op1,op2);
    }

    public double add(double op1, double op2){
        String message = "add " + Double.toString(op1) + Double.toString(op2);
        cliente.sendRequest(message);
        return Double.parseDouble(cliente.getResponse());
    }

    public double sub (double op1, double op2){
        String message = "sub " + Double.toString(op1) + Double.toString(op2);
        cliente.sendRequest(message);
        return Double.parseDouble(cliente.getResponse());
    }

    public double mult (double op1, double op2){
        String message = "mult " + Double.toString(op1) + Double.toString(op2);
        cliente.sendRequest(message);
        return Double.parseDouble(cliente.getResponse());
    }

    public double div (double op1, double op2){
        String message = "div " + Double.toString(op1) + Double.toString(op2);
        cliente.sendRequest(message);
        return Double.parseDouble(cliente.getResponse());
    }

    public void close (){
        if(cliente!=null) {
            cliente.close();
        }
    }
}
