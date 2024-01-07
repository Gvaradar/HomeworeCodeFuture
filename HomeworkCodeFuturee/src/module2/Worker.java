package module2;

public class Worker {
    protected String name;
    protected String profession;
    protected double salary;

    public Worker(String name, String profession, double salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    public abstract void myOccupation();
}
class Engineer extends Worker {
    public Engineer(String name, double salary) {
        // Предполагается, что у инженера профессия всегда "Инженер"
        super(name, "Инженер", salary);
    }

    @Override
    public void myOccupation() {
        System.out.println("Я инженер. Моя задача - проектирование и разработка технических решений.");
    }
}

