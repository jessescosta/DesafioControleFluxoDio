import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            //throw new RuntimeException(e);
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2){
            throw  new ParametrosInvalidosException();
        }else {
         int cont = num2 - num1;
         num1++;
            for (int i = 0; i < cont; i++) {
                System.out.println("Imprimindo o número: "+ num1++);
            }
        }

    }

}
