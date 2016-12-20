import java.util.Scanner;

/**
 * Created by Stella on 20/12/2016.
 */
public class Fibo {

    public static void main(String[] args){

        int indice;
        int nb_elt;

        int fib = 1;
        int prec1 = 2;
        int prec2 = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi le nombre de nombres de Fibo à calculer");
        nb_elt = sc.nextInt();

        System.out.println("Les"+" "+ nb_elt +" premiers elements de la suite de Fibo sont:");

        for (indice = 1 ; indice <= nb_elt; indice ++){

            if (indice == 2){
                fib = 2;
            }

            if(indice > 2) {
                fib = prec1 + prec2;
                prec2 = prec1;
                prec1 = fib;
            }

            System.out.println(fib+"-");
        }


    }

}
