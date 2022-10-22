import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@MyFirstAnnotation(flag = true)
public class Student {
    @MyFirstAnnotation
    private String name;
    private int age;
    private String schoolName;
    private int maxGrade;

    @MyFirstAnnotation
    public void doSomething() {

    }
}
