package org.example.functions;

import org.example.functions.runners.LambdaRunner;

import java.util.Scanner;

public class Runner {
    public static void startRunner() {

        do {

            Scanner reader = new Scanner(System.in);

            System.out.println("Runner started: Please select function for test");
            System.out.println("Please select from 1-5 what runner you want to start");
            System.out.println("1: Start lambda tester");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("5: Exit");


            int input = Integer.parseInt(reader.nextLine());

            switch (input) {
                case 1:
                    System.out.println("Starting the lambda runner");
                    LambdaRunner.lambdaRunner();
                    break;

                case 2:
                    System.out.println();

                case 3:
                    System.out.println();

                case 4:
                    System.out.println();

                case 5:
                    System.out.println("Exiting");
                    System.exit(0);

                default:
                    System.out.println("Please select a number from the below selection");
                    for (int i = 0; i < 50; i++) {
                        System.out.println();
                    }
                    continue;
            }
        } while(true);
    }
}
