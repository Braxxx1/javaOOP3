import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    
        int salary = ThreadLocalRandom.current().nextInt(60000, 120001);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                ThreadLocalRandom.current().nextInt(18, 100));
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Вадим", "Антон", "Андрей", "Сергей", "Борис", "Глеб", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Петров", "Иванов", "Васечкин", "Холопов", "Щукин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        
        int salary = ThreadLocalRandom.current().nextInt(1000, 4001);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                ThreadLocalRandom.current().nextInt(18, 100));
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++){
            if (i % 2 == 0) workers[i] = generateWorker();
            else workers[i] = generateFreelancer();
        }
        return workers;
    }



}
