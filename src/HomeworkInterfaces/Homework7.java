package HomeworkInterfaces;

public class Homework7 {
    public static void main(String[] args) {
        Company company1 = new Company(new FacedbookAdService());
        company1.releaseNewFeature();

        Company company2 = new Company(new EmailAdService());
        company2.releaseNewFeature();

        Company company3 = new Company(new PrintAdService());
        company3.releaseNewFeature();

        Person person1 = new Person(new ING());
        person1.depositAndWithdraw();
        Person person2 = new Person(new BT());
        person2.depositAndWithdraw();
        Person person3 = new Person(new BRD());
        person3.depositAndWithdraw();

    }
}

