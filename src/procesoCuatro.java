package examenHoy;

import javax.swing.JOptionPane;

public class Procesos4 {
	
	public Procesos4() {
		calcular();
		
	}

	private void calcular() {
		double area, base, altura;
		
		do {
			base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del triangulo rectangulo"));
			altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del triangulo rectangulo"));
			if (base>0 && altura >0) {
				area=(base*altura)/2;
				System.out.println("el area del triangulo es: "+ area);
			} else {
				System.out.println("ingreso un numero positivo");
			}
		} while (base<0 && altura<0);
		
	}
}
