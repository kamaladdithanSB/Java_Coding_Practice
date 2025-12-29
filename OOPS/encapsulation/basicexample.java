package OOPS.encapsulation;

class employee{
    private String name;//private instance variable
    private double salary;

    ///to initialse these varaible,we are not using CONSTRUCTORS...
    /// Instead we are using  getter and setter methods
    /// getter and setter does the same work like constructor...so no need constructor

    //getter and setter method for name
    public String getname(){//getter method
        return name;
    }

    public void setname(String name){//setter method
        this.name = name;
    }

    //getter and setter methods for salary
    public double getsalary(){
        return salary;
    }

    public void setsalary(double salary){
        this.salary = salary;
    }
}

public class basicexample {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setname("kamal");
        emp.setsalary(100000);

        String nm=emp.getname();
        double sl=emp.getsalary();
        System.out.println("the name of the employee is: "+nm+"with salary "+sl);
    }
    
}

///note:
/// this approach of declaring instance variables as private and methods as public is called encapsulation
