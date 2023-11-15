package Avengers;
import java.lang.Math;
import java.util.Scanner;


public class Exercicio_JogoAdivinha {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		System.out.println("=======================ADIVINHE=O=NÚMERO=======================");
		double aleatorio = Math.random();
		int numSorteio = (int) (1 + aleatorio * (5 - 1));
		int numero = 0;
		System.out.println("Você terá 3 tentativas para adivinhar o número.");

		for (int chance = 1; chance <= 3; chance++) {

			chance = 0 + chance;
			System.out.print(chance + "° tentativa digite um número de 1 até 5: ");
			numero = S.nextInt();
			if (numero < 1 || numero > 5){
				System.out.println("\nNúmero invalido!! digite um número de 1 até 5 ");

			}else if (numero != numSorteio && chance < 3){
				System.out.println("Tente novamente!");
			}
		}
		if (numero == numSorteio) {
			System.out.println("\nParabéns!!\nO número escolhido por você foi: " + numero+ " e o número sorteado foi: " + numSorteio);

		}
        else{
			System.out.println("\nNão foi dessa vez!!\nSuas tentativas acabaram e o número sorteado foi: "+ numSorteio);

        }
		
		S.close();
	}

}



