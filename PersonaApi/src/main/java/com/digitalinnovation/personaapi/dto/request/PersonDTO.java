package com.digitalinnovation.personaapi.dto.request;

import com.digitalinnovation.personaapi.dto.mapper.PersonMapper;
import com.digitalinnovation.personaapi.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Component;


import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PersonDTO implements PersonMapper {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF
    private String cpf;

    @NotNull
    private String birthDate;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;

    @Override
    public Person toModel(PersonDTO personDTO) {
        return null;
    }

    @Override
    public PersonDTO toDTO(Person person) {
        return null;
    }
}