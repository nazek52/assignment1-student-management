public class Student {

    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String _name,String _id, String _major){
        name=_name;
        id=_id;
        major=_major;
        gpa=0.0;
        credits=0;

    }
    public double getGPA(){
        return gpa;
    }
    public void updateGPA(double _gpa){
        gpa=_gpa;
    }
    public void addCredits(int _credits){
        credits+=_credits;
    }
    public int getCredits(){
        return credits;
    }
    public boolean isHonors(){
        return gpa>=3.5;
    }
    public String toString(){
        return name+"|GPA : "+gpa+"| Credits:"+credits;
    }
}
