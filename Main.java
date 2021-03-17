package Staff;

import java.util.Scanner;

//1. Создать класс "Сотрудник" -Employee.

class Employee {

    String Name;
    String Profession;
    String email;
    long Telephone;
    long Salary;
    int Age;

    //ввод данных о сотруднике
    void GetData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tEnter Employee Name : ");
        Name = sc.nextLine();

        System.out.print("\n\tEnter Employee Profession : ");
        Profession = sc.nextLine();

        System.out.print("\n\tEnter Employee email : ");
        email = sc.nextLine();

        System.out.print("\n\tEnter Employee Telephone : ");
        Telephone = Long.parseLong(sc.nextLine());

        System.out.print("\n\tEnter Employee Salary : ");
        Salary = Long.parseLong(sc.nextLine());

        System.out.print("\n\tEnter Employee Age : ");
        Age = Integer.parseInt(sc.nextLine());
    }

    //выводим информацию об объекте в консоль
    void PutData()

    {
        System.out.print("\n\tEmployee Name : " + Name);
        System.out.print("\n\tEmployee Profession : " + Profession);
        System.out.print("\n\tEmployee email : " + email);
        System.out.print("\n\tEmployee Telephone : " + Telephone);
        System.out.print("\n\tEmployee Salary : " + Salary);
        System.out.print("\n\tEmployee Age : " + Age);
    }


   //2. Этот конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age){
        this.Name = Name;
        this.Age = Age;
        this.Profession = Profession;
        this.email = email;

    }

    public int getAge() {
    return Age;
}

    public void printInfo() {
        System.out.printf("Employee: Name - %s, Profession - %s, email - %s, Age - %s%n", Name, Profession, email, Age);
    }
}

public class Main {
    public static void main(String args[]) {

            // Создаем массив из 5 сотрудников. С помощью цикла выводим информацию только о сотрудниках старше 40 лет.
        Employee[] employees = {

        new Employee("ivan ivanov", "Assassin", "ivanov@mailbox.com", "89213562636", 120000, 36),
        new Employee("Andrey Petrov", "Actor", "ap@mail.ru", "89203562154", 100000, 25),
        new Employee("Selena Gomez", "Singer", "selenaG@yandex.ru", "89602365698", 2000000, 28),
        new Employee("Vasilii Sergeev", "Manager", "vasSer@gmail.com", "89052154152", 1000000, 58),
        new Employee("Anna Mikhailova", "Doctor", "AnnA@dmx.de", "89114589568", 2500000, 50),
};
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40) {
                employees[i].printInfo();
            }
        }
    }
}