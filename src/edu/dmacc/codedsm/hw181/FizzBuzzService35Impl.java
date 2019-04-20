package edu.dmacc.codedsm.hw181;

public class FizzBuzzService35Impl<message> implements FizzBuzzService{

    private MapRepository repository;

    public FizzBuzzService35Impl( MapRepository repository){
        this.repository = repository;
    }


    @Override
    public Result performFizzBuzzLogic( Submission submission ) {
        String message = "";
        if (submission.getInputNumber() % 3 == 0 && submission.getInputNumber() % 5 == 0) {
            message = "FizzBuss!";
        } else if (submission.getInputNumber() % 3 == 0) {
            message = "Fiss";
        } else if (submission.getInputNumber() % 3 == 0) {
            message = "Buzz";
        } else {
            message = "Input was not fizzy";
        }
        Result result = new Result();
        result.setMessage(message);
        result.setSubmission(submission);

        repository.save (result);

        return result;
    }
}