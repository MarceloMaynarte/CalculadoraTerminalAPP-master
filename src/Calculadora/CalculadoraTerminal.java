package Calculadora;
import java.lang.Math;
import java.util.Scanner;

public class CalculadoraTerminal {

   public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       //Declaração de variáveis;
       Double number1;
       Double number2;
       Double Exponc;
       String operation;
       Boolean continuar;
       Double Contexp;


       //Estrutura de controle para entrada de dados e tomada de decisão;
       do {
           System.out.println("Informe o primeiro valor");
           number1 = input.nextDouble();
           System.out.println("Informe a operação desejada: +, -, *, /, **");
           operation = input.next();
           System.out.println("Informe o segundo valor");
           number2 = input.nextDouble();
           System.out.println("Resultado:" + RealizarOperacao(number1, number2, operation));
           System.out.println("Resultado expoenciação :"+ (Math.pow( number1,number2)));
           continuar = VerificarNewOperacao();

       } while (continuar);


   }

    public static boolean verificarExponc(){
       Scanner ler = new Scanner(System.in);
       System.out.println("Deseja saber o expoencial de algum número? (S ou N)");
       return !ler.nextLine().toUpperCase().equals("n");
   }

   //Metodo para tomada de decisão.
    public static boolean VerificarNewOperacao() {
        Scanner read = new Scanner(System.in);
        System.out.println("Deseja realizar uma nova operação (S ou N)");
        return !read.nextLine().toUpperCase().equals("N");


   }


   //Metodo criado para a realização dasoperações;
   public static Double RealizarOperacao( Double number1, Double number2, String operation){
       Double resultCalculo = 0.0;
       Double Contexp = 0.0;
       switch (operation){
           case "+":
               resultCalculo = number1 + number2;
               break;
           case "-":
               resultCalculo = number1 - number2;
               break;
           case "*":
               resultCalculo = number1 * number2;
               break;
           case "/":
               resultCalculo = number1 / number2;
               break;
           case"**":
               Contexp = ((number1*number1) * (number2 + number2) *5);

           default:
               System.out.println("Opção inválida");
       }
       return resultCalculo;
   }
}