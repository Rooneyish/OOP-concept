/*This is a subclass tutor that is a subclass for super class teacher*/
public class tutor extends teacher{
    //Instance varaible for tutor
    private double salary;
    private String specialization;
    private String academic_qualification;
    private int performanceIndex;
    private boolean isCertified;
    /*Constructor method that accepts parameters, 
       such as teacherId, teacherName, address, workingType,
       employmentStatus, workingHours, salary, specialization,
       academic_qualification, performanceIndex*/
    public tutor(int teacherId, String teacherName, String address,
    String workingType, String employmentStatus, int workingHours,
    double salary, String specialization, String academic_qualification,
    int performanceIndex){
        //calling instance varibales from super class teacher
        super(teacherId, teacherName, address, workingType, employmentStatus,workingHours);
        //calling setter method from super class teacher
        super.setWorking_hours(workingHours);
        //initailizing the attributes of tutor
        this.salary=salary;
        this.specialization=specialization;
        this.academic_qualification=academic_qualification;
        this.performanceIndex=performanceIndex;
        this.isCertified=false;
    }
    //Accessor methods
    public double getSalary(){
        return this.salary;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public String getAcademic_qualification(){
        return this.academic_qualification;
    }
    public int getPerformanceIndex(){
        return this.performanceIndex;
    }
    public boolean getIsCertified(){
        return this.isCertified;
    }
    //Mutator method that accepts two parameters and sets salary for tutor
    public void setSalary(double newSalary, int newPerformanceIndex){
        if(isCertified==false){
            if(performanceIndex>5 && getWorking_hours()>20){
                double appraisal=0;
                if(newPerformanceIndex >= 5 && newPerformanceIndex<=7){
                    appraisal = 5.0/100.0;
                    this.salary= newSalary + (newSalary* appraisal);
                    this.performanceIndex=newPerformanceIndex;
                }
                else if(newPerformanceIndex>=8 && newPerformanceIndex<=9){
                    appraisal = 10.0/100.0;
                    this.salary= newSalary + (newSalary* appraisal);
                    this.performanceIndex=newPerformanceIndex;
                }
                else if (newPerformanceIndex==10){
                    appraisal = 20.0/100.0;
                    this.salary= newSalary + (newSalary* appraisal);
                    this.performanceIndex=newPerformanceIndex;
                }
                this.isCertified=true;
                System.out.println(this.salary);
            }
            else{
                System.out.println("the tutor doesn't meet any of the criteria");
            }
        }
        else{
            System.out.println("already certified");
        }
    }
    //removeTutor method to remove the tutor if the tutor is not certified
    public void removeTutor(){
        if(isCertified == false){
            this.salary=0;
            this.specialization="";
            this.academic_qualification="";
            this.performanceIndex=0;
            this.isCertified=false;
        }
    }
    //overriding display method to display details
    @Override
    public void display(){
        if(isCertified==false){
            super.display();
        }
        else{
            System.out.println("Salary: "+ this.salary);
            System.out.println("Specialization: "+ specialization);
            System.out.println("Academic Qualification: "+ academic_qualification);
            System.out.println("Performance Index: "+ performanceIndex);
            super.display();
        }
    }
}