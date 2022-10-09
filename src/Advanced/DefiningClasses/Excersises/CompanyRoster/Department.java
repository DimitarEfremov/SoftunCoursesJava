package Advanced.DefiningClasses.Excersises.CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Department {
    private String name;
    private List<Employee> employeeList;



    public Department(String name) {
        this.name = name;
        employeeList = new ArrayList<>();
    }



    public void addEmployeeToList (Employee name) {
        this.employeeList.add(name);
    }

    public  double averageSalary(){
        double totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employeeList.size();
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {this.employeeList = employeeList;
    }
}
