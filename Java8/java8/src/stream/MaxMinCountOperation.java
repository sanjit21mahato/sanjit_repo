package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return name +","+ salary;
	}
}

public class MaxMinCountOperation {

	public static void main(String[] args) {

     List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
     Optional<Integer>max = list.stream().max((e1,e2)->e1.compareTo(e2));
     System.out.println(max.get());
     
     List<Employee> employeeList = new ArrayList<>();
     employeeList.add(new Employee("Akash", 42));
     employeeList.add(new Employee("Rakesh", 35));
     employeeList.add(new Employee("Raju", 45));
     employeeList.add(new Employee("Ritesh", 54));
     
     Optional<Integer> maxSalary = employeeList.stream().
    		                         map(e->e.salary).max((e1,e2)->e1.compareTo(e2));
     System.out.println(maxSalary.get());
     
     Optional<Integer> minSalary = employeeList.stream().
    		                            map(e->e.salary).min((e1,e2)->e1.compareTo(e2));
     System.out.println(minSalary.get());
     
     //Another way to get emplyee with max salary
     Optional<Employee> employee = employeeList.stream().max((e1,e2)->e1.salary>e2.salary?1:-1);
     System.out.println(employee.get().toString());
     
     long count = employeeList.stream().filter(e->e.salary>40).count();
     System.out.println(count);
   
     //Collecting in map
     Map<String, Employee> map = employeeList.stream().filter(e->e.salary<40).
    		                               collect(Collectors.toMap(e->e.name,e->e));
     System.out.println(map);
     

	}

}
