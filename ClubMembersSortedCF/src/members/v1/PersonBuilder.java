package members.v1;

import java.time.LocalDate;

public class PersonBuilder {
    private final Person person = new Person();

    public PersonBuilder firstName(String firstName){
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder surName(String surName){
        person.setSurName(surName);
        return this;
    }

    public PersonBuilder dateOfBirth(LocalDate dateOfBirth){
        person.setDateOfBirth(dateOfBirth);
        return this;
    }

    public PersonBuilder residence(Residence residence){
        person.setResidence(residence);
        return this;
    }

    public PersonBuilder dateOfEntry(LocalDate dateOfEntry){
        person.setDateOfEntry(dateOfEntry);
        return this;
    }

    public PersonBuilder grade (Grade grade){
        person.setGrade(grade);
        return this;
    }

    public Person build(){
        return person;
    }
}
