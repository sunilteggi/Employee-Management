public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeId("EMP101");
        e1.setName("Sunil");
        e1.setAge(25);
        e1.setDepartment("Engineering");

        Manager manager = new Manager();
        manager.displayDetails(e1);
    }
}
