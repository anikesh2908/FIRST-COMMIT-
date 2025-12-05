class student{ //class define
    String name;
    String branch;
    //function declare
    public void printstudent(){
        System.out.println("the name of student is  " +this.name);
        System.out.println("the branch of student is  " +this.branch);

    }
      
}

public class java2 {
    public static void main(String[] args){
        student s1=new student();
        s1.name="anikesh";
        s1.branch="aiml";
        student s2=new student();
        s2.name="alisha";
        s2.branch="data science";
        student s3=new student();
        s3.name="hello";
        s3.branch="cybersecurity";
        s1.printstudent();
        s2.printstudent();
        s3.printstudent();


        
    }
}
