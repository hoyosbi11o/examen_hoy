import javax.swing.*;

public class Constructor {

    procesoUno miUno=new procesoUno();
    procesoDos miDOs=new procesoDos();
    procesoTres misTres=new procesoTres();
    public Constructor(){
        Object desplegable= JOptionPane.showInputDialog(null,"Desea","MENU",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"Seleccione","Ejercicio #1","Ejercicio #2","Ejercicio #3"},"Seleccione");
        String desplegables=String.valueOf(desplegable);
        switch (desplegables){
            case "Ejercicio #1":
                miUno.iniciar();
                break;
            case "Ejercicio #2":
        miDOs.iniciar();
                break;
            case "Ejercicio #3":
                misTres.iniciar();
                break;
        }

    }
}
