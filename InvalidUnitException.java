public class InvalidUnitException extends Exception {
    public InvalidUnitException(){
        super("Invalid Input. Unit must not be less than 1 or greater than 5. Try again");
    }
}
