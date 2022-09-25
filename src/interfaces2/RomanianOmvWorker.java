package interfaces2;

public class RomanianOmvWorker implements Employee{
    private int age;
    private String name;
    private long id;
    private String homeCountry;
    private long salay;

    public RomanianOmvWorker(int age, String name, long id, String homeCountry, long salay) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.homeCountry = homeCountry;
        this.salay = salay;
    }

    @Override
    public long getIdentifier() {
        return id;
    }

    @Override
    public String getCountry() {
        return homeCountry;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public long getSalary() {
        return salay;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
