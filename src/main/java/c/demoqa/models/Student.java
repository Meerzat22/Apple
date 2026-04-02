package c.demoqa.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder //создавать сложные объекты
@Getter
@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    String firstName;
    String lastName;
    String city;
    int age;
    String gender;
    String subject;

    public static void main(String[] args) {
        Student student = Student.builder().firstName("Meerzat").build();
        System.out.println(student);
    }
}
