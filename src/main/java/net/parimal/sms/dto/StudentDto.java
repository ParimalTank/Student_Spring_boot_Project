package net.parimal.sms.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class StudentDto {

    private String first_name;
    private String last_name;
    private String email;
}
