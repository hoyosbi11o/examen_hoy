import javax.swing.*;
import java.util.ArrayList;

public class procesoTres {
    modeladoTres misDatos;
    ArrayList<String>listaDatos;
    public void iniciar(){
        String Sino;
        misDatos=new modeladoTres();
        do {
            registrarUsuario();
            Sino=JOptionPane.showInputDialog("Desea registrar otro usuario?");
        }while (Sino.equalsIgnoreCase("si"));
        misDatos.imprimirDatos();

    }

    private void registrarUsuario() {
        listaDatos=new ArrayList<>();
        String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        String documento=JOptionPane.showInputDialog("Ingrese su documento usuario "+nombre);
        String Horas=JOptionPane.showInputDialog("Ingrese las horas trabajadas de  "+nombre);
        String msj=JOptionPane.showInputDialog("EL trabajador lleva mas de 4 anios en la empresa");
        listaDatos.add("Nombre: "+nombre);
        listaDatos.add("\nDocumento: "+documento);
        listaDatos.add("\nHoras trabajadas: "+Horas);
        listaDatos.add(ProcesoSalario(msj,Horas));
        misDatos.GUardarDatos(documento,listaDatos);
        System.out.println("\nNombre: "+nombre+"\nDocumento: "+documento+"\nHoras trabajadas: "+Horas+ProcesoSalario(msj,Horas));

    }

    private String ProcesoSalario(String resp,String horas) {
        Integer hor=Integer.valueOf(horas);
        Double valorHora=2000.00;
        String msjDo=null;
        if (resp.equalsIgnoreCase("si")){
            Double procesoUno=hor*valorHora;
            Double procesoDos=(procesoUno*0.1);
            Double procesoTres=procesoDos-procesoUno;
           msjDo="\nSu salario total es de "+procesoUno+" usted lleva mas de 4 anios en la empresa\n se le realizara un descuento del 10%\n y ese descuento seria de "+procesoDos+" y su sueldo\n quedaria de "+procesoTres;

        }else{
            Double procesoUno=hor*valorHora;
            msjDo="\nSu salario total es de "+procesoUno;


        }
        return msjDo;

    }

}
