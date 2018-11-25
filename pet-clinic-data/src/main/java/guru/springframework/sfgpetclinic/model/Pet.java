package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by Xinjie on 2018/11/19 8:47 PM.
 */
@Data
public class Pet extends BaseEntity {

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
