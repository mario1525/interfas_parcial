
package main;

import clases.armario;
import clases.mesa;
import clases_abstractas.muebles;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<muebles> muebles = new ArrayList();
        mesa mes = new mesa();        
        mes.setComensales(1);
        System.out.println(mes);
       armario arm=new armario();
       arm.setVolumenalmacenaje(10);
        System.out.println(arm);
    }
}
