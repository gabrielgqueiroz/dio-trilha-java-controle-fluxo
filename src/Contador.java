import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception);
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if (contagem < 0) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i+1));
		}
	}
	//Coloquei static para conseguir usar dentro do metódo static
	static class ParametrosInvalidosException extends Exception{
		public ParametrosInvalidosException(String err){
			super(err);
		}
	}
}