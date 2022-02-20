package questions.question1;

import java.util.Scanner;

public class Chair {

	int altura;
	
	public Chair(int altura) {
		super();
	
		String dots = new String();
		StringBuilder rev = new StringBuilder();
		rev.setLength(altura);
		int controle = altura;
		for (int i = 0; i < altura; i++) {
			controle--;
			for(int j = 0; j < altura; j++) {
				if(i < 1) {
					dots += " ";
				}
				if(j == controle) {
					dots = dots.replaceFirst(" ", "*");
				}
				
			}
			rev.append(dots);
			System.out.println(rev.reverse());
			rev.delete(0, rev.length());
			}
			
			}
			
			


	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Informe a altura da cadeira: ");
		int altura = Integer.parseInt(inp.next());
		
		new Chair(altura);

	}

}
