import java.time.LocalDate;
import java.time.Period;

public class Person{
      String name;
      String  dob;
    public Person(String name, String dob){
        this.name = name;
        this.dob = dob;
    }
    public void displayPersonName(){
    System.out.println("The name of the person is: " + this.name);
    }
    public void calculateAge(){
        LocalDate date = LocalDate.parse(dob);
        LocalDate currDate= LocalDate.now();
        Period age=Period.between(currDate, date);
        
      //  if((date==null||date>)  || age==null)
         System.out.println("The Employee age is"+age.getYears()+"years");

        
    }
}