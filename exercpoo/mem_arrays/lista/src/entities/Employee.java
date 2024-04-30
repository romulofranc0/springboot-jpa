package entities;

public class Employee {
        private String name;
        private Integer id;
        private double salary;
        private double percentage;

    public Employee(int value1, double value2, String value3){
        this.name=value3;
        this.salary=value2;
        this.id=value1;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        salary+=salary*percentage/100;
    }

    public String toString(){
        return id + ", "+ name + ", " + String.format("%.2f", salary);
    }

}
