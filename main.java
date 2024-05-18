import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfSubjects;

        System.out.println("    GWA Calculator    ");
        System.out.println("----------------------");

        System.out.print("Input number of Subjets >> ");
        numberOfSubjects = input.nextInt();
        input.nextLine();

        String[] subjects = new String[numberOfSubjects];
        int[] units = new int[numberOfSubjects];
        double[] grades = new double[numberOfSubjects];
        GWA display = new GWA(subjects, units, grades, numberOfSubjects);

        for (int i = 0; i < numberOfSubjects; i++) {
            if(i == 0) {
                System.out.print("Input the " + (i+1) +"st subject: ");
                subjects[i] = input.nextLine();
            } else if( i == 1){
                System.out.print("Input the " + (i+1) +"nd subject: ");
                subjects[i] = input.nextLine();
            } else if( i == 2){
                System.out.print("Input the " + (i+1) +"rd subject: ");
                subjects[i] = input.nextLine();
            } else {
                System.out.print("Input the " + (i+1) +"th subject: ");
                subjects[i] = input.nextLine();
            }
        }

        System.out.println("----------------------");

        for (int i = 0; i < numberOfSubjects; i++){
            while(true){
                System.out.print("Input the units of " + subjects[i] + ": ");
                try{
                    units[i] = checkUnits(input);
                    break;
                } catch (InvalidUnitException e){
                    System.out.println(e.getMessage());
                } catch (NonIntegerUnitException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        
        System.out.println("----------------------");

        for(int i = 0; i < numberOfSubjects; i++){
            while(true){
                System.out.print("Input your grade in " + subjects[i] + ": ");
                try{
                    grades[i] = checkGrades(input);
                    break;
                } catch (InvalidGradeException e){
                    System.out.println(e.getMessage());
                } catch (NonDoubleGradeException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("----------------------");
        display.displayGWA();

    }

    public static int checkUnits(Scanner input) throws InvalidUnitException, NonIntegerUnitException{
       try{
        int unit = input.nextInt();
        if(unit < 1 || unit > 5){
            throw new InvalidUnitException();
        } 
        return unit;
       } catch (InputMismatchException e){
            input.nextLine();
            throw new NonIntegerUnitException();
        }
    }

    public static double checkGrades(Scanner input) throws InvalidGradeException, NonDoubleGradeException{
        try{
         double grade = input.nextDouble();
         if(grade < 1.0 || grade > 5.0){
             throw new InvalidGradeException();
         } 
         return grade;
        } catch (InputMismatchException e){
            input.nextLine();
            throw new NonDoubleGradeException();
         }
     }
}
