package client;

import java.io.IOException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws IOException {
        Proxy proxy = new Proxy();
        String text;
        Scanner input = new Scanner(System.in);

        while (true) {
            text = input.nextLine();
            System.out.println(proxy.calcular(text));
        }
    }
}
