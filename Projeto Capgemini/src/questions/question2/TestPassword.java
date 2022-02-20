package questions.question2;

import java.util.Scanner;

public class TestPassword {

	static String psw = "";
	static int min = 6;
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Informe a senha: ");
		psw = inp.next();
		
		//Teste do tamanho mínimo da senha
		if(psw.length() < min) {
			System.out.print(min-psw.length());
			return;
		}
		
		Boolean hasNumber = false, 
				hasUpperLetter = false, 
				hasLowerLetter = false, 
				hasSpecCarac = false;
		
		for(int i = 0; i < psw.length(); i++) {
			if(String.valueOf(psw.charAt(i)).matches("\\d") == true) {
				hasNumber = true;
			}
			if(String.valueOf(psw.charAt(i)).matches("[a-z]") == true) {
				hasLowerLetter = true;
			}
			if(String.valueOf(psw.charAt(i)).matches("[A-Z]") == true) {
				hasUpperLetter = true;
			}
			if(String.valueOf(psw.charAt(i)).matches("[! | @ | # | $ | % | ^ | & | * | ( | ) | - | + ]") == true) {
				hasSpecCarac = true;
			}
		}
		
		if (hasNumber && hasUpperLetter && hasLowerLetter && hasSpecCarac) {
			System.out.print("Senha forte");
		}else {
			System.out.print("Senha fraca");
		}
		
		
		
	}

	
}


