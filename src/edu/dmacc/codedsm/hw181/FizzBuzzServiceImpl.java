package edu.dmacc.codedsm.hw181;

public class FizzBuzzServiceImpl<message> implements FizzBuzzService{


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

        return result;
    }
}