package gorest.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@Setter
@Getter
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserResponse extends BaseModel{
    Integer id;
    String name;
    String email;
    String gender;
    String status;
}
