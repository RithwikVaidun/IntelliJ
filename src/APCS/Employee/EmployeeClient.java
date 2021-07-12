package APCS.Employee;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee 		edna = new Employee();
        Secretary 		stan = new Secretary();
        LegalSecretary	leo  = new LegalSecretary();
        Marketer		mary = new Marketer();
        Lawyer			lucy = new Lawyer();

        printInfo(edna);
        printInfo(stan);
        printInfo(leo);
        printInfo(mary);
        printInfo(lucy);

        Employee 		jane = new Secretary();
        // Secretary 		john = new Employee();

        // System.out.println(jane.takeDictation("Hello!"));
        // System.out.println( ((Secretary) jane).takeDictation("Hello!")); // should work??
    }

    // Prints information about any kind of employee.
    // Polymorphism, aka "late bonding" and "dynamic dispatch"
    public static void printInfo(Employee e) {
        System.out.print(e.getHours() + ", ");
        System.out.printf("$%.2f, ", e.getSalary());
        System.out.print(e.getVacationDays() + ", ");
        System.out.print(e.getVacationForm() + ", ");
        System.out.println(e); // toString representation of employee
    }

}
