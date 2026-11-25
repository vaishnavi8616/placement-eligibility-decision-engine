public class Candidate {
    // attributes or fields 
    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;

    // constructor: to initialize the object's state
    public Candidate(
        String name,
        double percentage,
        int backlogs,
        int graduationYear
    ){
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
    }
    
    //getters: to access the object's state
    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }


}
