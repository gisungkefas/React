package com.kefas.CrudBackendAndFrontend.studentDto;

import com.kefas.CrudBackendAndFrontend.Enum.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {

    @NotNull(message = "Firstname most not be Empty")
    private String firstName;

    @NotNull(message = "Lastname most not be Empty")
    private String lastName;

    @NotNull(message = "PhoneNumber most not be Empty")
    private String phoneNumber;

    @NotNull(message = "DOB most not be Empty")
    private LocalDate dob;

    @NotNull(message = "Gender most not be Empty")
    private Gender gender;

    @NotNull(message = "Address most not be Empty")
    private String address;
}
