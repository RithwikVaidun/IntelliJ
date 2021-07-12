package APCS.Employee;

public class Employee {
    int workHr;
    double salary;
    int vacationDay;
    String vacationColor;

    public Employee(){
        workHr = 40;
        salary = 40000;
        vacationDay = 10;
        vacationColor = "yellow";
    }

    public void setSalary(double s){
        salary = s;
    }

    public void setHours(int h){
        workHr = h;
    }

    public void setVacationDay(int d){
        vacationDay = d;
    }
    public void setVacationColor(String s){
        vacationColor = s;
    }

    public String getVacationForm() {
        return vacationColor;
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return workHr;
    }

    public int getVacationDays() {
        return vacationDay;
    }
}
