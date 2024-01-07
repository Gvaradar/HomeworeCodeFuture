package module2;

public interface Philosopher {
    String provideWisdom();
}
class WisePerson implements Philosopher {
    private String name;

    public WisePerson(String name) {
        this.name = name;
    }

    @Override
    public String provideWisdom() {
        return "Человек, ищущий мудрость, всегда найдет ее в самом себе.";
    }

    public String getName() {
        return name;
    }
}

