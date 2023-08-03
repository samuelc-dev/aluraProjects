package projeto_conversor;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		RealParaOutroMoeda realMoeda = new RealParaOutroMoeda();
		OutraMoedaParaReal moedaReal = new OutraMoedaParaReal();
		
		while (true) {
			
			String opcao = JOptionPane.showInputDialog(null, 
					"Escolha uma alternativa", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							"Converter do real para outra moeda",
							"Converter de outra moeda para o real"
			},"Escolha").toString();
			
			switch (opcao) {
			case "Converter do real para outra moeda":
				realMoeda.converterRealParaOutraMoeda();
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                if (JOptionPane.OK_OPTION == resposta) {
                    System.out.println("Escolha opção Afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    return;
                }
				break;
			case "Converter de outra moeda para o real":
				moedaReal.converterOutraMoedaParaReal();
				int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                if (JOptionPane.OK_OPTION == resp) {
                    System.out.println("Escolha opção Afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    return;
                }
				break;
			default:
				break;
			}
			
		}
		
				

	}

}
