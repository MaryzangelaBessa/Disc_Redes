package server;

public class Despachante {

    Esqueleto esqueleto = new Esqueleto();

    public String invoke (String message){
        String array[] = message.split(" ");
        switch (array[0]){

            case "sum":
                return esqueleto.add(message);
            case "sub":
                return esqueleto.sub(message);
            case "mult":
                return esqueleto.sub(message);
            case "div":
                return esqueleto.div(message);
            default:
                return "Operação Inválida";
        }
    }
}
