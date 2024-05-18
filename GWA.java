public class GWA {
    private String[] subs;
    private int[] unit;
    private double[] grade;
    private int numsub;

    public GWA(String[] subs, int[] unit, double[] grade, int numsub){
        this.subs = subs;
        this.unit = unit;
        this.grade = grade;
        this.numsub = numsub;
    }

    public void displayGWA(){
        int totalUnits = 0;
        double[] gradexunits = new double[numsub];
        double totalgradexunits = 0;
        double finalGWA;

        for(int i= 0; i < unit.length; i++){
            totalUnits += unit[i];
        }

        for(int i = 0; i < numsub; i++){
            gradexunits[i] = grade[i] * unit[i];
        }

        for(int i = 0; i < numsub; i++){
            totalgradexunits += gradexunits[i];
        }

        finalGWA = totalgradexunits / totalUnits;

        for(int i = 0; i < numsub; i++){
            System.out.println(subs[i] + " || " + unit[i] + " || " + grade[i] + " || " + gradexunits[i]);
        }
        System.out.println("TOTAL     || " + totalUnits);
        System.out.printf("FINAL GWA || %.2f", finalGWA);
    }
}
