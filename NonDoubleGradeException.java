public class NonDoubleGradeException extends Exception {
    public NonDoubleGradeException(){
        super("Invalid Input. Grade must be an double. Try again");
    }
}
