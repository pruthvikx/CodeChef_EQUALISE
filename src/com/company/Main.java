package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            if(A == B){
                System.out.println("Yes");
            }else {
                boolean c = true;
                while (c == true) {
                    while (A < B) {
                        A *= 2;
                        if (A == B) {
                            System.out.println("Yes");
                            c = false;
                            break;
                        }
                    }
                    while (B < A) {
                        B *= 2;
                        if (B == A) {
                            System.out.println("Yes");
                            c = false;
                            break;
                        }
                    }
                    if (c == true){
                        System.out.println("No");
                        break;
                    }
                }
            }
        }
    }
}
