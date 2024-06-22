package Aula01;

public class Funçao {
	public static boolean ehMaiorDeIdade(int idade) {
		if (idade>= 18) {
			System.out.print(idade +" é maior de idade \n");
			return true;
		}else {
		System.out.print(idade +" é menor de idade \n");
		return false;}
	}
	public static void main(String [] args) {
		System.out.println(ehMaiorDeIdade(20));
		}
	}

