import java.lang.reflect.Field;

public class ReflexctionExercise {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessError {
        Student student = Student.builder().age(23).build();
        Field age = Student.class.getDeclaredField("age");
        age.setAccessible(true);
        age.set(student, 14);
        System.out.println(student.getAge());

        Student.class.
    }
}
