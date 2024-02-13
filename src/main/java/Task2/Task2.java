package Task2;

/*
Работники в организации:
Создайте базовый класс Employee с общими характеристиками (например, name, salary).
Затем создайте несколько подклассов (например, Manager, Developer, SalesPerson),
унаследованных от базового класса. Каждый подкласс должен иметь уникальные свойства и методы.
 */
public class Task2 {
    public static void main (String[] args){
        Manager manager = new Manager("Bob", 2000, 13);
        manager.work();
        manager.work();

        SalesPerson salesPerson = new SalesPerson("Kate", 1500, 500);
        salesPerson.sale();
        salesPerson.getInfo();

        Developer developer = new Developer("Tomas", 2000, "middle");
        developer.develop();
        developer.getInfo();
    }
}
