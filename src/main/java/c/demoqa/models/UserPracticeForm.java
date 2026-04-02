package c.demoqa.models;

import c.demoqa.pages.BasePage;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
//@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserPracticeForm extends BasePage {
    String firsName;
    String lastName;
    String userEmail;
    String mobileNumber;
    String gender;
    String subject;
    String userCurrentAddress;
    }
