package collectionAssignment;

import java.util.*;


public class CollectionFramework_03 {
	
	public static void main(String[] args) {
		
		TreeSet<Employe> employee = new TreeSet<>(Comparator.comparing(Employe::getName));
	
		Scanner sc = new Scanner(System.in);
		char choice;
		
		do {
            System.out.println("Run Application:");
            System.out.println("a) ID");
            System.out.println("b) Name");
            System.out.println("c) Department");
            System.out.println("d) Salary");
            System.out.println("e) Exit");
            System.out.print("Your choice: ");
            choice = sc.next().charAt(0);
            
            switch(choice){
            	case 'a':
            		employee = new TreeSet<Employe>(new IdComparator());
            		break;
            	case 'b':
            		employee = new TreeSet<Employe>(new NameComparator());
            		break;
            	case 'c':
            		employee = new TreeSet<Employe>(new DepartmentComparator());
            		break;   
            	case 'd':
            		employee = new TreeSet<Employe>(new SalaryComparator());
            		break; 
            	case 'e':
            		System.out.println("Exit");
            		break;
            	default:
            		System.out.println("Invalid choice. Please try again.");
            		break;
            }
            employee.add(new Employe(1,"Trupti","IT",50000));
    		employee.add(new Employe(2,"Kirti","CSE",40000));
    		employee.add(new Employe(3,"Prachi","EE",30000));
    		employee.add(new Employe(4,"Sakshi","ETC",50000));
    		employee.add(new Employe(5,"Sonu","CIVIL",70000));
    		employee.add(new Employe(6,"Shiksha","CSE",50000));
    		employee.add(new Employe(7,"Dipti","IT",40000));
    		employee.add(new Employe(8,"Asha","EE",30000));
    		employee.add(new Employe(9,"Radha","MECH",20000));
    		employee.add(new Employe(10,"Monu","IT",10000));
		
            for (Employe empl : employee) {System.out.println(empl.getId()+" "
            +empl.getName()+" "+empl.getDepartment()+" "+empl.getSalary());}
             
        
		} while (choice != 'e');
		
	
	}
}
class Employe{
	int id;
	String name;
	String department;
	int salary;
	public Employe(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return ("Id: "+id+" Name: "+name+" Departemnt: "+department+" Salary: "+salary);
	}
}

 class IdComparator implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
 class NameComparator implements Comparator<Employe>{

		@Override
		public int compare(Employe o1, Employe o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	}
 class DepartmentComparator implements Comparator<Employe>{

		@Override
		public int compare(Employe o1, Employe o2) {
			// TODO Auto-generated method stub
			return o1.getDepartment().compareTo(o2.getDepartment());
		}
		
	}
 class SalaryComparator implements Comparator<Employe>{

		@Override
		public int compare(Employe o1, Employe o2) {
			// TODO Auto-generated method stub
			return o1.getSalary()-o2.getSalary();
		}
		
	}

