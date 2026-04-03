package gorest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class UserResponse extends BaseModel{
    Integer id;
    String name;
    String email;
    String gender;
    String status;
}
