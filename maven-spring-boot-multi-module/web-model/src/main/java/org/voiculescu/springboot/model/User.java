package org.voiculescu.springboot.model;


import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {

    private String firstName;
    private String lastName;
    private String email;

}
