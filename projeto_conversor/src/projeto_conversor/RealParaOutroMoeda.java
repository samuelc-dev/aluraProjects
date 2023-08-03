package projeto_conversor;

import javax.swing.JOptionPane;

public class RealParaOutroMoeda {
	
	CalculadorConverter cc = new CalculadorConverter();
	
	public void converterRealParaOutraMoeda() {
		
		String opcao = JOptionPane.showInputDialog(null,"Escolha uma opção",
				"Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Real para Dólar",
						"Real para Euro",
						"Real para Libras Estrerlina",
						"Real para Pesos Argentinos",
						"Real para Pesos Chilenos"
				}, "Escolha").toString();
		
		String input = JOptionPane.showInputDialog("Insira um valor: ");
		Double valor = Double.parseDouble(input);
		
		switch (opcao) {
		case "Real para Dólar": {
			cc.calculeRealParaOutraMoeda(valor, 4.81, "Dólares");
			break;
		}
		case "Real para Euro": {
			cc.calculeRealParaOutraMoeda(valor, 5.27, "Euros");
			break;
		}
		case "Real para Libras Estrerlina": {
			cc.calculeRealParaOutraMoeda(valor, 6.12, "Libras Esterlinas");
			break;
		}
		case "Real para Pesos Argentinos": {
			cc.calculeRealParaOutraMoeda(valor, 0.017, "Pesos Argentinos");
			break;
		}
		case "Real para Pesos Chilenos": {
			cc.calculeRealParaOutraMoeda(valor, 0.0057, "Pesos Chilenos");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
	}

}
