/*This is a superclass teacher for both subclass lecturer and tutor*/
public class teacher{
    //Instance variable for teacher class
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    /*Constructor method that accepts parameters,
       such as: teacherId, teacherNamme, address, workingType,
       employmentStatusm, workingHours*/
    public teacher(int teacherId, String teacherName, String address, 
    String workingType, String employmentStatus,int workingHours){
        //intializing the attributes of teacher class
        this.teacherId=teacherId;
        this.teacherName=teacherName;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
        this.workingHours=workingHours;
    }
    //accessor method
    public int getTeacher_id(){
        return this.teacherId;
    }
    public String getTeacher_name(){
        return this.teacherName;    
    }
    public String getAddress(){
        return this.address;
    }
    public String getWorking_type(){
        return this.workingType;
    }
    public String getEmployment_status(){
        return this.employmentStatus;
    }
    public int getWorking_hours(){
        return this.workingHours;
    }
    //Mutator method that accepts a parameter to set working hours
    public void setWorking_hours(int newWorkingHours){
        this.workingHours=newWorkingHours;
    }
    //display method to display details of teacher
    public void display(){
        System.out.println("Teacher ID :" + teacherId);
        System.out.println("Teacher name :" + teacherName);
        System.out.println("Address :" + address);
        System.out.println("Working Type :" + workingType);
        System.out.println("Employment Status:" + employmentStatus);
        if(workingHours >0){
            System.out.println("Working Hours :" + workingHours);
        }
        else{
            System.out.println("Required working hours not reached,WORK MOREEEE!!");
        }
    }
}