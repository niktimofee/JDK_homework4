 /*
 Необходимо создать класс-справочник сотрудников, который содержит внутри коллекцию сотрудников,
 каждый сотрудник должен иметь следующие атрибуты:
 • Табельный номер
 • Номер телефона
 • Имя
 • Стаж

 1. Добавить метод, который ищет сотрудника по стажу (может быть список)
 2. Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
 3. Добавить метод, который ищет сотрудника по табельному номеру
 4. Добавить метод добавление нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory dir = new EmployeeDirectory();

        Employee employee1 = new Employee(1,5550110,"Alex",4);
        Employee employee2 = new Employee(2,5558080,"Judy",2);
        Employee employee3 = new Employee(3,5559696,"Alex",6);
        Employee employee4 = new Employee(4,5553322,"Carl",9);

        dir.addEmployee(employee1);
        dir.addEmployee(employee2);
        dir.addEmployee(employee3);
        dir.addEmployee(employee4);
        System.out.println(dir);
        System.out.println();

//      Метод, который ищет сотрудника по стажу (может быть список)
        System.out.println("1. Search for an employee by work experience. The result should be employee Judy: ");
        System.out.println(dir.searchByExperience(2));

//      Метод, который выводит номер телефона сотрудника по имени (может быть список)
        System.out.println();
        System.out.println("2. Search for an employee by phone number. The result should be employee Alex: ");
        System.out.println(dir.getPhoneByName("Alex"));

//      Метод, который ищет сотрудника по табельному номеру
        System.out.println();
        System.out.println("3. Search for an employee by personal number. The result should be employee Carl: ");
        System.out.println(dir.searchByServiceNumber(4));

//      Метод добавления нового сотрудника в справочник
        System.out.println();
        System.out.println("4. Add an employee with the name Nick: ");
        Employee employee5 = new Employee(5,5551313,"Nick",1);
        dir.addEmployee(employee5);

        System.out.println(dir);
    }
}