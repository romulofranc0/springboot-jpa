package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("How many employees will be registered?");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("Employee #"+(i+1)+":");
            System.out.println("Whats your id: ");
            Integer id=sc.nextInt();
            sc.nextLine();
            System.out.println("Whats your name: ");
            String name=sc.nextLine();
            System.out.println("Whats your salary: ");
            Double salary=sc.nextDouble();

            Employee emp=new Employee(id, salary, name);
            list.add(emp);
        }

        System.out.println("ID of employee to increse salary: ");
        int idsalary=sc.nextInt();
        
        Employee emp = list.stream().filter(x->x.getId()==idsalary).findFirst().orElse(null);
        //Integer pos=position(list,idsalary);
        if (emp==null){
            System.out.println("Invalid ID");
        }
        else{
            System.out.println("By what percentage you want to increase your salary: ");
            double percentage=sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for(Employee e:list){
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for(int i=0;i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
