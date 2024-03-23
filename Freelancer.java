

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    private Freelancer(String surName, String name, double salary, double age) {
        super(surName, name, salary, age);
    }

    public static Freelancer create(String surName, String name, double salary, double age){
        return new Freelancer(surName, name, salary, age);
    }

    @Override
    public double getAge() {
        // TODO Auto-generated method stub
        return age;
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8f * 8;
    }

    @Override
    public String toString() {
        return String.format("Freelancer: %s %s; Возраст: %.0f ставка: %.2f руб.; заработная плата: %.2f руб.",
            surName, name, age, salary, calculateSalary());
    }
}
