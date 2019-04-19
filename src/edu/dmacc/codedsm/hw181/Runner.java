package edu.dmacc.codedsm.hw181;

import java.util.Scanner;

public class Runner{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.println("userName");
        String userName = in.next();
        System.out.println("number");
        Integer inputNumber = in.nextInt();

        FizzBuzzMapRepository repository = new FizzBuzzMapRepository();
        FizzBuzzService service = new FizzBuzzServiceImpl(repository);
        SubmissionController controller = new SubmissionControllerImpl(service);

          InputView view = controller.submit(inputNumber, userName);
          view.render();
            }
        }

