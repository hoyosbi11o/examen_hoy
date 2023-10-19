import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class modeladoTres {
    HashMap<String, ArrayList<String>>Datos;
    public modeladoTres(){
        Datos=new HashMap<>();
    }
    public void GUardarDatos(String doumento,ArrayList<String>listaDatos){
        Datos.put(doumento,listaDatos);
        JOptionPane.showMessageDialog(null,"Regristro Exitoso");
    }
    public void imprimirDatos(){
        Iterator<String>iterator=Datos.keySet().iterator();
        String llave;
        while (iterator.hasNext()){
            llave=iterator.next();
            System.out.println("\nUsuario: "+llave+"\n"+Datos.get(llave));
        }
    }
}
