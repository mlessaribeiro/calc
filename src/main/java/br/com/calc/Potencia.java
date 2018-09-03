package br.com.calc;

public class Potencia {

	public Double potenciar(double firstNumber, double secondNumber) {
		if (secondNumber == 0)
			return new Double(1);
		Double resultado = firstNumber;
		for (int i = 1; i < secondNumber; i++) {
			resultado = resultado * firstNumber;

		}
		return resultado;
	}
}
