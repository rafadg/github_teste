import java.util.*;

class Principal{
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		int n = 1 + new Random().nextInt(20);
		int c = 0;
		int t = 0;
		boolean naoEncontrou = true;
		System.out.println("--Iniciando novo jogo--");	
		while(naoEncontrou){
			t++;
			System.out.println("Chute um numero: ");
			c = tec.nextInt();
			if(c == n){
				naoEncontrou = false;
			}else if(c > n){
				System.out.println("Chute um numero menor");
			}else{
				System.out.println("Chute um numero maior");
			}
		}
		System.out.println("Parab�ns voc� ganhou com " + t + " tentativas");		
	}
}