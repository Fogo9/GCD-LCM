# **GREATEST COMMON DIVISOR - LEAST COMMON MULTIPLE**

# Information

* **Program to find greatest common divisor and least common multiple.**

# Technologies Used

* **JAVA**

# Contents

* The variables **n1**, **n2**, **i**, **a**, **b**, **k**, **gcd** and **lcm** are defined with int.

* Scanner class created for user to enter numbers.

* Using the while loop, first the greatest common divisor is calculated, then the least common multiple is calculated.

<br />

# Codes

```Java

        import java.util.Scanner;

        public class GCDLCM{

            public static void main(String[] args) {

                int n1, n2, i = 1, a, b, gcd = 1, k = 1, lcm;

                Scanner value = new Scanner(System.in);

                System.out.print("Enter The Number N1 : ");

                n1 = value.nextInt();

                System.out.print("Enter The Number N2 : ");

                n2 = value.nextInt();


```

```Java

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

```

```bash

    Enter The Number N1 : 18
    Enter The Number N2 : 24
    Greatest Common Divisor : 6
    Enter The Number A : 6
    Enter The Number B : 8
    Least Common Multiple : 24

```

<br />

# LINK

* Click here https://github.com/Fogo9/GCD-LCM.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
