public class Main{
    public static void main(String[] args){
        Student s1= new Student("max","1","journalism");
        Student s2= new Student("bob","2","SE");
        Student s3= new Student("stiv","3","doctor");
        Student s4= new Student("peter","4","architector");
        Student s5= new Student("leclear","5","engineer");

        s1.updateGPA(4.0);
        s1.addCredits(5);
        s2.updateGPA(2.0);
        s2.addCredits(3);
        s3.updateGPA(2.8);
        s3.addCredits(2);
        s4.updateGPA(3.6);
        s4.addCredits(7);
        s5.updateGPA(1.5);
        s5.addCredits(9);

        Student[] students={s1,s2,s3,s4,s5};
        System.out.println("Top student:"+getTopStudent(students));
        System.out.println("Honors student:"+countHonors(students));
        System.out.println("Total credits:"+totalCredits(students));

        Course course=new Course("OOP in Java","Dr.Johnson",5);
        for(int i=0;i<students.length;i++){
            course.addStudent(students[i],i);
        }
        System.out.println(course);
        System.out.println("Average GPA:"+course.courseAverageGPA());
        System.out.println("Highest credit student:"+course.highestCreditStudent());
    }
    public static Student getTopStudent(Student[] arr){
        Student top=arr[0];
        for(Student s: arr){
            if(s.getGPA()>top.getGPA()){
                top=s;
            }
        }
        return top;
    }
    public static int countHonors(Student[] arr){
        int count=0;
        for(Student s:arr){
            if(s.isHonors()){
                count++;
            }
        }
        return count;
    }
    public static int totalCredits(Student[] arr){
        int sum=0;
        for(Student s:arr){
            sum+=s.getCredits();
        }
        return sum;
    }
}
