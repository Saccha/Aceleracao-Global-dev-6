/*Desafio
Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de 
combustível consumido (em litros).

Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

Saída
Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

 
Exemplo de Entrada	
500
35.0
Saída
14.286 km/l
Entrada
2254
124.4
Saída
18.119 km/l
Entrada
4554
464.6
Saída
9.802 km/l
*/

/*Resposta*/

import java.util.Scanner;

public class Uri1014{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int distancia = teclado.nextInt();
		double litro = teclado.nextDouble();

		double consumo = distancia/litro;


		 System.out.printf("%.3f km/l\n", consumo);
	}

}
