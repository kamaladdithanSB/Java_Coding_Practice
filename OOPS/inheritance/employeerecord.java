package OOPS.inheritance;

class employee{
    String name;
    double salary;

    employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    void displayemployee(){
        System.out.println("name: " +name+ "salary: "+salary);
    }
}

class manager extends employee{
    String department;
    manager(String name,double salary,String department){
        super(name,salary);
        this.department = department;
    }
    void displaymanager(){
        displayemployee();
        System.out.println("department: "+department);
    }
}

class developer extends employee{
    String programminglanguage;
    developer(String name,double salary,String programminglanguage){
        super(name,salary);
        this.programminglanguage=programminglanguage;
    }
    void displaydeveloper(){
        System.out.println("programming language: "+programminglanguage);
    }
}

public class employeerecord{
    public static void main(String[] args) {
        manager m = new manager("kamal",100000,"cse");
        m.displaymanager();
        
    }
    
}
