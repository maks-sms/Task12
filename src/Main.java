import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ComparatorSalary comparatorSalary = new ComparatorSalary();
        ComparatorSalaryName comparatorSalaryName = new ComparatorSalaryName();

        Employee e1 = new Employee("Оля", "Петровна", 16000);
        Employee e2 = new Employee("Петя", "Васильевич", 16000);
        Employee e3 = new Employee("Боб", "Дмитриевич", 17000);

        List<Employee> employs = new ArrayList<>();
        employs.add(e3);
        employs.add(e2);
        employs.add(e1);

        System.out.println(employs);

        Collections.sort(employs);

        System.out.println(employs);

        System.out.println("сравнение сотрудников по зарплате \n");

        Collections.sort(employs, comparatorSalary);

        System.out.println(employs);

        System.out.println("сравнение сотрудников по зарплате, если она одинаковая - то по имени \n");

        Collections.sort(employs, comparatorSalaryName);

        System.out.println(employs);
    }
}
