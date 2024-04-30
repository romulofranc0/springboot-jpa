package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many employees do you want to register: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("");
        List<Employee> empList=new ArrayList<>();

        for(int i=0;i<n;i++){
            System.out.println("Outsorced?");
            char out=sc.next().charAt(0);
            sc.nextLine();


            System.out.println("name of employee: ");
            String name=sc.nextLine();
            System.out.println("Hours worked: ");
            Integer hours=sc.nextInt();
            sc.nextLine();
            System.out.println("Value per hour: ");
            Double valuePerHour=sc.nextDouble();
            
            if(out=='n'){
                Employee emp=new Employee(name, hours, valuePerHour);
                empList.add(emp);
            }
            else if(out=='y'){
                Employee emp=new OutsourcedEmployee(name, hours, valuePerHour);
                empList.add(emp);
            }
        }
        
        for(Employee e : empList){
            System.out.println("name:"+e.getName());
            System.out.println("Hours"+e.getHours());
            System.out.println("Value per hour:"+e.getValuePerHour());
            System.out.println("Payment: "+e.payment());
            
        }
        sc.close();
    }
}
