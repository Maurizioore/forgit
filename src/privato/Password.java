package privato;

import java.util.Scanner;

public class Password {
    private String pass="spumeggianteee";
    private void showpass(){
        System.out.println("si la password e' corretta");
    }
    public void proviamo(String prova){
        if (prova.compareTo(pass)==0){
            showpass();
        }else{
            System.out.println("gne fregato;");
        }
    }

}
