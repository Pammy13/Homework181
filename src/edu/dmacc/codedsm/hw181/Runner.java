package edu.dmacc.codedsm.hw181;

import java.util.Scanner;

public class Runner{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.println("userName");
        String userName = in.next();
        System.out.println("number");
        Integer inputNumber = in.nextInt();

        FizzBuzzService service = new FizzBuzzServiceImpl();
        SubmissionController controller = new SubmissionControllerImpl(service);

          controller.submit(inputNumber, userName);
            }
        }

