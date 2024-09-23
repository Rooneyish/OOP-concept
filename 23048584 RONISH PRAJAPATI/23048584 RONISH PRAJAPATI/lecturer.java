/*This is subclass lecturer that is a subclass for superclass teacher*/
public class lecturer extends teacher{
    //Instance variable for lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //constructor method
    public lecturer(int teacherId, String teacherName, String address, 
    String workingType, String employmentStatus, String department, int yearsOfExperience,int workingHours){
        // calling instance variable from superclass teacher
        super(teacherId, teacherName, address, workingType, employmentStatus,workingHours);
        //initializing attributes of lecturer
        this.department= department;
        this.yearsOfExperience=yearsOfExperience;
        this.gradedScore=0;
        this.hasGraded=false;
        //calling setter method from the superclass teacher
        super.setWorking_hours(workingHours);
    }
    //accessor method for attributes
    public String getDepartment(){
        return this.department;
    }
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    public int getGradedScore(){
        return this.gradedScore;
    }
    public boolean getHasGraded(){
        return this.hasGraded;
    }
    //mutator method for gradedScore
    public void setGradedScore(int gradedScore){
        this.gradedScore=gradedScore;
    }
    //gradeAssignment to grade assignment of the students
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience){
        if(hasGraded==false)//to ensure that the assignment is not graded{
            if(yearsOfExperience>=5 && this.department==department)/*to ensure the lecturer's 
            experience is more than 4 years and to match the department of student and lecturer*/{
                //lecturer will assign the grade according to the students grade score
                if(gradedScore >= 70){
                    System.out.println("Your Grade is A");
                    this.gradedScore=gradedScore;
                }
                else if(gradedScore >=60 && gradedScore <70){
                    System.out.println("Your Grade is B");
                    this.gradedScore=gradedScore;
                }
                else if(gradedScore >=50 && gradedScore <60){
                    System.out.println("Your Grade is C");
                    this.gradedScore=gradedScore;
                }
                else if(gradedScore >= 40 && gradedScore <50){
                    System.out.println("Your Grade is D");
                    this.gradedScore=gradedScore;
                }
                else{
                    System.out.println("Your grade is E");
                    this.gradedScore=gradedScore;
                }
                // after the assignment is graded, assigning that the assignment is graded
                hasGraded=true;
            }
            else{
                System.out.println("The lecturer is not eligible to grade");
            }
        
        else{
            System.out.println("already Graded");
        }
    }
    //overridding the display method
    @Override
    public void display(){
        //calling display method from parent class (teacher)
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        //if the assignment is not graded yet
        if (hasGraded==false) {
            System.out.println("Not graded yet");
        } else {
            System.out.println("Graded Score: " + gradedScore);
        }
    }
}