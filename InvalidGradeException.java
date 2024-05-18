public class InvalidGradeException extends Exception {
     public InvalidGradeException(){
        super("Invalid Input. Grade must not be less than 1 or greater than 5. Try again");
    }
}
