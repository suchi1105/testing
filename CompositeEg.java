import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


interface Employee {

   public void add(Employee employee) throws Exception;
   public void remove(Employee employee);
   public Employee getChild(int i);
   public String getName();
   public double getSalary();
   public String getDesignation();
   public void print();
   public double getcost();
   public double totalcost();
}


class Director implements Employee{

	 @Override
	public String toString() {
		return "Director [name=" + name + ", salary=" + salary + ", employees=" + employees + "]";
	}

	private String name;
	 private double salary;
	 private double totalmanagerdev ;

	 public Director(String name,double salary){
	  this.name = name;
	  this.salary = salary;
	 }

	 List<Employee> employees = new ArrayList<Employee>();
	 public void add(Employee obj) throws Exception{
		 String c_name = obj.getClass().getName();
		 double totalcost = 0 ;
		  

		 if(c_name.equalsIgnoreCase("Manager"))
		 {
			  employees.add(obj);
			 
		 }
		 else
		 {
			 throw new Exception("non Manager not allowed to add");
		 }
	    
	 }

	 public Employee getChild(int i) {
	  return employees.get(i);
	 }

	 public String getName() {
	  return name;
	 }

	 public double getSalary() {
	  return salary;
	 }
	 
	 public double getcost()
	 {
		        
		 return getSalary();
		 
	 }

	 public String getDesignation(){
		 return "Director";
	 }
	 
	 public double totalcost()
	 {
		 return totalmanagerdev ;
	 }
	 
	 public void print() {
	  System.out.println("----directoor---------");
	  System.out.println("Name ="+getName());
	  System.out.println("Salary ="+getSalary());
	  System.out.println("-------------");
	   double totalmanager =0;
	   double toatldev= 0 ;
	  Iterator<Employee> employeeIterator = employees.iterator();
	  
	    while(employeeIterator.hasNext()){
	     Employee employee = employeeIterator.next();
	     {
	    	  employee.print();
	    	  totalmanager =  employee.getcost();
	    	  toatldev=employee.totalcost() ;
	    	  System.out.println("toatldevcost::"+toatldev) ;	    	  
	     }
	     System.out.println("totalmanagercost::"+totalmanager) ;
	     totalmanagerdev+=toatldev+totalmanager ;
	    
	    }

	    totalmanagerdev+=getSalary() ;
	    
	    System.out.println("totalCost::"+totalmanagerdev) ;
	 }

	 public void remove(Employee employee) {
	  employees.remove(employee);
	 }

	}


class Manager implements Employee{

 private String name;
 private double salary;
 private static double totalcosting ;


 public Manager(String name,double salary){
  this.name = name;
  this.salary = salary;
 }

 double totaldeveloper =0;
 List<Employee> employees = new ArrayList<Employee>();
 double totalcost1 = 0  ;
 public void add(Employee employee) {
    employees.add(employee);
    
    
 }

 public Employee getChild(int i) {
  return employees.get(i);
 }

 public String getName() {
  return name;
 }

 public double getSalary() {
  return salary;
 }

 public String getDesignation(){
	 return "Manager";
 }
 
 public double totalcost()
 {
	 return totaldeveloper ;
 }
 
 public void print() {
  System.out.println("-----Manager--------");
  System.out.println("Name ="+getName());
  System.out.println("Salary ="+getSalary());
  System.out.println("-------------");
  
  

  Iterator<Employee> employeeIterator = employees.iterator();
 
    while(employeeIterator.hasNext()){
     Employee employee = employeeIterator.next();
     employee.print();
     totaldeveloper+=employee.getcost();
     totalcost();
     System.out.print("total of developer:::"+totaldeveloper);
    }
 }

 public void remove(Employee employee) {
  employees.remove(employee);
 }
 
 

@Override
public double getcost()
{
	 totalcosting= getSalary();
	return totalcosting ;
}
}


class Developer implements Employee{

	  private String name;
	  private double salary;
	  private double totalcosting ;

	  public Developer(String name,double salary){
	    this.name = name;
	    this.salary = salary;
	  }
	  public void add(Employee employee) {
	    //this is leaf node so this method is not applicable to this class.
	  }

	  public Employee getChild(int i) {
	    //this is leaf node so this method is not applicable to this class.
	    return null;
	  }

	  public String getName() {
	    return name;
	  }

	  public double getSalary() {
	    return salary;
	  }

	  public String getDesignation(){
		return "Developer";  
	  }
	  
	  public double totalcost()
		 {
			 return 0 ;
		 }
		 
	  public void print() {
	    System.out.println("-------------");
	    System.out.println("Name ="+getName());
	    System.out.println("Salary ="+getSalary());
	    System.out.println("-------------");
	  }

	  public void remove(Employee employee) {
	    //this is leaf node so this method is not applicable to this class.
	  }
	@Override
	 public double getcost()
	 {
		totalcosting +=getSalary();
		 return  totalcosting ;
	 }

	}
 

public class CompositeEg {
	 public static void main(String[] args) {
		 try
		 {
			/* Employee dir1 = new Director("dir1",10);
			 Employee dir2 = new Director("dir2",100);
			 Employee dir2manager1=new Manager("dir2mgr1",200);
		 Employee manager1=new Manager("mgr1",20);
		 
		  Employee emp1=new Developer("dev1",30);
		  Employee emp2=new Developer("dev2",40);
		  
		  manager1.add(emp1);
		  manager1.add(emp2);
		  
		  dir1.add(manager1);
		  
		  
		  Employee gManager=new Manager("mgr2", 20);
		  Employee emp3=new Developer("dev3", 20);
		  
		  gManager.add(emp3);
	     
		 dir1.add(gManager);
		 dir2.add(dir2manager1);
		 dir1.print();
		 dir2.print();*/
		 System.out.print("hello second project");
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 }
}
