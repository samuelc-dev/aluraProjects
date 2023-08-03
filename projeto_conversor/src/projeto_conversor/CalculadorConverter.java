package projeto_conversor;

import javax.swing.JOptionPane;

public class CalculadorConverter {
	
	
	//Real para outra moeda;
	public void calculeRealParaOutraMoeda(double valor1, double valor2, String nomeMoeda) {
		double realMoeda = valor1/valor2;
		realMoeda = (double) Math.round(realMoeda * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " +
				realMoeda + " " + nomeMoeda);
	}
	
	//Outra moeda para o real;
	
	public void calculeOutraMoedaParaReal(double valor1, double valor2, String nomeMoeda) {
		double realMoeda = valor1*valor2;
		realMoeda = (double) Math.round(realMoeda * 100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " +
				realMoeda + " " + nomeMoeda);
	}

}
