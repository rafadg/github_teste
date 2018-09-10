import java.util.*;

class Principal{
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		int n = 1 + new Random().nextInt(20);
		int chute = 0;
		int te = 0;
		boolean naoEncontrou = true;
		System.out.println("--Iniciando novo jogo--");	
		while(naoEncontrou){
			tentativas++;
			System.out.println("Chute um numero: ");
			chute = tec.nextInt();
			if(chute == n){
				naoEncontrou = false;
			}else if(chute > n){
				System.out.println("Chute um numero menor");
			}else{
				System.out.println("Chute um numero maior");
			}
		}
		
		System.out.println("Parabéns você ganhou com " + te + " tentativas");		
	}
}