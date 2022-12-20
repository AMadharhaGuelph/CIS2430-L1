public class SubmissionChoices{
    // Do not change
    private double A1;
    private double A2;
    private double A3;
    private String choices;

    private void setGrades(double a1, double a2, double a3) {
       this.A1 = a1;
       this.A2 = a2;
       this.A3 = a3;
    }
    
    private void setChoices() {
        if(this.A1 > 100) {
            choices = "A1"; // 200,200,200
        }
        else if(this.A2 > 100 && this.A3 > 100) {
            choices = "A1R A2"; // 90,200,200
        }
        else if(this.A2 <= 100 && this.A3 > 100) {
            choices = "A2R A3"; //90,90,200
        }
        else if(this.A2 <= 100 && this.A3 <= 100) {
            choices = "A3R"; // 90,90,90
        }
    }

    public String getChoices() {
        return choices;
    }


    public void parseInput(String inputLine) {
        String singles[] = inputLine.split(",");
        try {
            setGrades(Double.parseDouble(singles[0]), 
                      Double.parseDouble(singles[1]),
                      Double.parseDouble(singles[2]));
        }
        catch(Exception e) {
            System.out.println("invalid input");
            System.exit(0);
        }
        setChoices();
    }
}