package avd.itics.tesoem.edu.colores;

import java.util.ArrayList;

public class Var {
    public static ArrayList<String> colores = new ArrayList<String>();

    public static void  agregar(String coloress) { colores.add(coloress);}

    public static ArrayList<String> miscolores() {return colores;}
}
