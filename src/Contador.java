import java.util.ArrayList;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro paramentro");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo paramentro");
        int parametro2 = sc.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametro1, parametro2);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
           System.out.println(exception.getMessage());

           }
		
	    }
	    static void contar(int parametro1, int parametro2 ) throws ParametrosInvalidosException {
		//validar se paramentro1 é MAIOR que parametro2 e lançar a exceção
            if(parametro1 > parametro2){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int contagem = parametro2 - parametro1;

            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }   
        }
}   