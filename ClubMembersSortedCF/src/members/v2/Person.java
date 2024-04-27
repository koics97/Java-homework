package members.v1;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String surName;
    private LocalDate dateOfBirth;
    private Residence residence;
    private LocalDate dateOfEntry;
    private Grade grade;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(surName, person.surName) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(residence, person.residence) && Objects.equals(dateOfEntry, person.dateOfEntry) && grade == person.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName, dateOfBirth, residence, dateOfEntry, grade);
    }

    @Override
    public String toString() {
        return "Klubtag | " +
                "Név: " + firstName + ' ' + surName +
                ", Születési dátum: " + dateOfBirth +
                ", Lakcím: " + residence +
                ", Tagság kezdete: " + dateOfEntry +
                ", Fokozat: " + grade +
                " |\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Residence getResidence() {
        return residence;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        if (surName.equals(anotherPerson.getSurName())) {
            if (equals(anotherPerson)) {
                return 0;
            } else {
                return 1;
            }
        }
        return surName.compareTo(anotherPerson.getSurName());
    }
}
