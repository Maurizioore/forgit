package uniroma2.eu;

import Kom.Altri;
import Kom.Saluti;
import Kom.Stpumeggiante;
import privato.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Password eccola=new Password();
        System.out.println("digita la password:");
        Scanner input=new Scanner(System.in);
        String poi= input.next();
        //ti hanno cambiato prova con piu_spumeggiante;
        eccola.proviamo(poi);


    }
}
