package edu.dmacc.codedsm.hw181;

        import java.util.Scanner;

public class Runner{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.println("userName");
        String userName = in.next();
        System.out.println("number");
        Integer inputNumber = in.nextInt();

        FizzBuzzMapRepositoryImpl repository = new FizzBuzzMapRepositoryImpl();
        FizzBuzzMapRepositoryFileImpl repositoryFile = new FizzBuzzMapRepositoryFileImpl();
        FizzBuzzService service = new FizzBuzzService35Impl(repository);
        FizzBuzzService47Impl service47 = new FizzBuzzService47Impl(repositoryFile);
        SubmissionController controller = new SubmissionControllerImpl(service);
        SubmissionController controller47 = new SubmissionControllerImpl(service47);


        InputView view = controller.submit(inputNumber, userName);
        view.render();
        InputView view47 = controller47.submit(inputNumber, userName);
        view47.render();
    }
}

