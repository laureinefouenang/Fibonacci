import java.util.Scanner;

/**
 * Created by Stella on 20/12/2016.
 */
public class Fibonacci {



    /*************************** First Method of FIBONACCI : ITERATIVE ********************************/

    public static int calc_fibonacci (int input){

        int index;
        int current_fibonacci = 0;
        int previous_n_1 = 1;
        int previous_n_2 = 0;


        System.out.println("Les"+" "+ input +" premiers elements de la suite de Fibonacci sont:");

        for (index = 0 ; index <= input; index ++){

            if (index == 1){
                current_fibonacci = 1;
            }

            if(index > 1) {
                current_fibonacci = previous_n_1 + previous_n_2;
                previous_n_2 = previous_n_1;
                previous_n_1 = current_fibonacci;
            }

            System.out.println(current_fibonacci+"-");
        }
        return current_fibonacci;


    }

    /*************************** Second Method of FIBONACCI : RECURSIVE ********************************/

    public static int calc_fibonacci2(int input){

        int param_fibonacci;

        if(input <= 1){
            return input;
        }
        else
            return calc_fibonacci2(input-1) + calc_fibonacci2(input - 2);

    }


 //               public static void main(String[] args){
//
//        int index;
//        int input_number;
//
//        int current_fibonacci = 0;
//        int previous_n_1 = 1;
//        int previous_n_2 = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Donne moi le nombre de nombres de Fibonacci à calculer");
//        input_number = sc.nextInt();
//
//        System.out.println("Les"+" "+ input_number +" premiers elements de la suite de Fibonacci sont:");
//
//        for (index = 0 ; index <= input_number; index ++){
//
//            if (index == 1){
//                current_fibonacci = 1;
//            }
//
//            if(index > 1) {
//                current_fibonacci = previous_n_1 + previous_n_2;
//                previous_n_2 = previous_n_1;
//                previous_n_1 = current_fibonacci;
//            }
//
//            System.out.println(current_fibonacci+"-");
//        }
//
//
//    }

}
