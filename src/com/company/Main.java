package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner S = new Scanner(System.in);

	    System.out.print("Enter the Number = ");
	    int input = S.nextInt();
        ArrayList result = new PrimeFactor().getPrimeFactor(input);

        result.forEach((itr) -> System.out.print(itr + "  "));
    }
}
