package projeto_conversor;

import javax.swing.JOptionPane;

public class OutraMoedaParaReal {
	
	CalculadorConverter cc = new CalculadorConverter();
	
	public void converterOutraMoedaParaReal() {
		 	
		String opcao = JOptionPane.showInputDialog(null,
				"Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {
						"Dólar para o real",
						"Euro para o real",
						"Libras Estrelinas para o real",
						"Pesos Argentinos para o real",
						"Pesos Chilenos para o real"
				}, "Escolha").toString();
		
		String input = JOptionPane.showInputDialog("Insira um valor: ");
		double valor = Double.parseDouble(input);
		
		switch (opcao) {
		case "Dólar para o real": {
			cc.calculeOutraMoedaParaReal(valor, 4.81, "Reais");
			break;
		}
		case "Euro para o real": {
			cc.calculeOutraMoedaParaReal(valor, 5.27, "Reais");
			break;
		}
		case "Libras Esterlinas para o real": {
			cc.calculeOutraMoedaParaReal(valor, 6.12, "Reais");
			break;
		}
		case "Pesos Argentinos para o real": {
			cc.calculeOutraMoedaParaReal(valor, 0.017, "Reais");
			break;
		}
		case "Pesos Chilenos para o real": {
			cc.calculeOutraMoedaParaReal(valor, 0.0057, "Reais");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}
	

}
