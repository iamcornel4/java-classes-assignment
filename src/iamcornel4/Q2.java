package iamcornel4;
class Member{
	String name;
	int age;
	String number;
	String address;
	int salary;
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialization;
}
class Manager extends  Member{
	String department;
}
public class Q2 {
	public static void main(String []args) {
Employee e = new Employee();
e.name =  "Cornelius";
e.age = 24;
e.number = "Cimaf 124";
e.address = "House No: 2324/plot A - Lapaz Accra";
e.salary = 35000;
e.specialization  = " Mechanical Engineering";
System.out.println(e.name +" is  "+e.age +" staff no "+e.number +" with address "  + e.address +" receiving a basic salary of  "+ e.salary + " in  " +e.specialization);

Manager m = new Manager();
m.name =  "Adansi";
m.age = 39;
m.number = "Cimaf 14";
m.address = "House No: 16A/plot 98 - Sakumono Tema";
m.salary = 65000;
m.department = "Production department";
System.out.println(m.name +" is  "+m.age +" staff no "+m.number + " with address  "+  m.address + " recieving a basic salary of "+ m.salary + " and the Head  of " +m.department);
}
	
}