import java.util.Scanner;

public class GCDLCM{
    public static void main(String[] args) {

        int n1, n2, i = 1, a, b, gcd = 1, k = 1, lcm;

        Scanner value = new Scanner(System.in);

        System.out.print("Enter The Number N1 : ");

        n1 = value.nextInt();

        System.out.print("Enter The Number N2 : ");

        n2 = value.nextInt();


        while(i <= n1){

            i++;

            if(n1 % i == 0 && n2 % i == 0){

                gcd = i;

            }

        }
        System.out.println("Greatest Common Divisor : " + gcd);

        System.out.print("Enter The Number A : ");

        a = value.nextInt();

        System.out.print("Enter The Number B : ");

        b = value.nextInt();


        while(k <= (a * b)){

            k++;

            if(k % a == 0 && k % b == 0){

                lcm = k;

                System.out.println("Least Common Multiple : " + lcm);

                break;

            }


        }

    }
}
