package Advanced.DefiningClasses.Excersises.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employeeList = new ArrayList<>();


        List<Department> departmentList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split("\\s+");
            // name, salary, position, department, email, and age.
            String name = personData[0];
            double salary = Double.parseDouble(personData[1]);
            String position = personData[2];
            String department = personData[3];


            Employee employee = new Employee(name,salary,position,department);

            if (personData.length >= 5){
                if (personData[4].contains("@")){
                    String email = personData[4];
                    employee.setEmail(email);
                } else {
                    int age = Integer.parseInt(personData[4]);
                    employee.setAge(age);
                }
            }

            if (personData.length == 6){
                int age = Integer.parseInt(personData[5]);
                employee.setAge(age);
            }

            employeeList.add(employee);


            if (departmentList.stream().noneMatch(d -> d.getName().equals(department))) {
                Department departmentClass = new Department(department);
                departmentList.add(departmentClass);
            }

            for (Department dep : departmentList) {
                if (dep.getName().equals(department)){
                    dep.addEmployeeToList(employee);
  //                  dep.getEmployeeList().add(employee);
                }
            }



        }

        Department highestAveragePaid = departmentList.stream().max((left, right) -> Double.compare(left.averageSalary(), right.averageSalary())).get();


        System.out.printf("Highest Average Salary: %s%n",highestAveragePaid.getName());

        Comparator<Employee> comparator = (e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary());

        highestAveragePaid.getEmployeeList().stream().sorted(comparator).forEach(e -> System.out.println(e.employeeData()));

    }
}
