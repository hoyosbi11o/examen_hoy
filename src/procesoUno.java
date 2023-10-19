import javax.swing.*;
import java.util.ArrayList;

public class procesoUno {
    ModeladoDatos misDatos;
    ArrayList<String>listaDatos;
    public void iniciar(){
        String Sino;
        misDatos=new ModeladoDatos();
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
        String telefono=JOptionPane.showInputDialog("Ingrese su telefono "+nombre);
        String codigoViaje=JOptionPane.showInputDialog("Ingrese el codigo del viaje "+nombre);
        listaDatos.add("Nombre: "+nombre);
        listaDatos.add("\nDocumento: "+documento);
        listaDatos.add("\nTelefono: "+telefono);
        listaDatos.add(ProcesoSalario(codigoViaje));
        misDatos.GUardarDatos(documento,listaDatos);
        System.out.println("\nNombre: "+nombre+"\nDocumento: "+documento+"\nTelefono: "+telefono+ProcesoSalario(codigoViaje));

    }

    private String ProcesoSalario(String codigo) {
        Integer cod=Integer.valueOf(codigo);
        String msj=null;
        if (cod==1){
             msj="\nCiudad: Medellin\nFecha y Hora: 6 de octubre - 8 am";

        }else  if (cod==2){
             msj="\nCiudad: Bogota\nFecha y Hora: 10 de noviembre - 6 pm";

        }else  if (cod==3){
             msj="\nCiudad: Cartagena\nFecha y Hora: 5 de abril - 2 pm";

        }else  if (cod==2){
             msj="\nCiudad: Barranquilla\nFecha y Hora: 4 de mayo - 4 am";

        }

        return msj;

    }

}
