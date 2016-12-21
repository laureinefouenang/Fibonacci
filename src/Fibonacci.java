import java.util.Scanner;

/**
 * Created by Stella on 20/12/2016.
 */
public class Fibonacci {

//    public static void main(String[] args){
//
//        int indice;
//        int nombre_element;
//
//        int fibonacci_courant = 1;
//        int precedent1 = 2;
//        int precedent2 = 1;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Donne moi le nombre de nombres de Fibonacci à calculer");
//        nombre_element = sc.nextInt();
//
//        System.out.println("Les"+" "+ nombre_element +" premiers elements de la suite de Fibonacci sont:");
//
//        for (indice = 1 ; indice <= nombre_element; indice ++){
//
//            if (indice == 2){
//                fibonacci_courant = 2;
//            }
//
//            if(indice > 2) {
//                fibonacci_courant = precedent1 + precedent2;
//                precedent2 = precedent1;
//                precedent1 = fibonacci_courant;
//            }
//
//            System.out.println(fibonacci_courant+"-");
//        }
//
//
//    }

    public static int calc_fibonacci (int input){

        int indice;

        int fibonacci_courant = 1;
        int precedent1 = 2;
        int precedent2 = 1;


        System.out.println("Les"+" "+ input+" premiers elements de la suite de Fibonacci sont:");

        for (indice = 1 ; indice <= input; indice ++){

            if (indice == 2){
                fibonacci_courant = 2;
            }

            if(indice > 2) {
                fibonacci_courant = precedent1 + precedent2;
                precedent2 = precedent1;
                precedent1 = fibonacci_courant;
            }

            System.out.println(fibonacci_courant+"-");
        }
        return fibonacci_courant;


    }

}
