import javax.swing.*;
import java.util.ArrayList;

public class procesoDos {

    ArrayList<Double>listaDatos;
    ArrayList<String>msj=new ArrayList<>();
    public void iniciar(){
            registroMes();
            msj.add("Promedio de los meses"+"\nCantidad de meses calculados "+listaDatos.size()+"\nPromedio de los meses calculados "+ProcesoSalario(listaDatos));
            System.out.println(msj.get(0));
    }

    private void registroMes() {
        listaDatos=new ArrayList<>();

        Integer canMes=Integer.parseInt(JOptionPane.showInputDialog("A cuantos meses le hara el calculo"));
        for (int i =0; i<canMes;i++){
            Double mes=Double.parseDouble(JOptionPane.showInputDialog("Digite el ingreso del mes "+(i+1)));
            listaDatos.add(mes);
        }


    }

    private Double ProcesoSalario(ArrayList<Double> mes) {
        Double suma=0.0;
        for (int j=0;j<mes.size();j++){
            suma=(suma+mes.get(j))/mes.size();
        }
        return suma;
    }

}
