package members.v1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Members members = new Members();
        members.add(new PersonBuilder()
                .firstName("Jack")
                .surName("Hunter")
                .dateOfBirth(LocalDate.of(1997,12,27))
                .residence(new Residence(3516, "Miskolc", "Csermák Antal utca 20."))
                .dateOfEntry(LocalDate.of(2014, 2,8))
                .grade(Grade.INTERMEDIATE)
                .build());
        members.add(new PersonBuilder()
                .firstName("Bill")
                .surName("Hunter")
                .dateOfBirth(LocalDate.of(1990,11,20))
                .residence(new Residence(3516,"Miskolc","Szabó Ervin utca 11."))
                .dateOfEntry(LocalDate.of(2005, 9,1))
                .grade(Grade.PROFICIENT)
                .build());
        members.add(new PersonBuilder()
                .firstName("Lola")
                .surName("Hunter")
                .dateOfBirth(LocalDate.of(1995,10,31))
                .residence(new Residence(3532,"Miskolc","Testvériség utca 32."))
                .dateOfEntry(LocalDate.of(2010, 1,11))
                .grade(Grade.MASTER)
                .build());
        members.add(new PersonBuilder()
                .firstName("Jennifer")
                .surName("Lakatos")
                .dateOfBirth(LocalDate.of(1999,3,28))
                .residence(new Residence(1085,"Budapest","Thököly út 37."))
                .dateOfEntry(LocalDate.of(2013, 6,15))
                .grade(Grade.PROFICIENT)
                .build());
        members.add(new PersonBuilder()
                .firstName("Reed")
                .surName("Richards")
                .dateOfBirth(LocalDate.of(1980,10,11))
                .residence(new Residence(1072,"Budapest", "Halas utca 2."))
                .dateOfEntry(LocalDate.of(2000, 8,5))
                .grade(Grade.MASTER)
                .build());
        members.add(new PersonBuilder()
                .firstName("Keith")
                .surName("Richards")
                .dateOfBirth(LocalDate.of(1972,3,16))
                .residence(new Residence(1225,"Budapest","Haller utca 23."))
                .dateOfEntry(LocalDate.of(1995,4,22))
                .grade(Grade.PROFICIENT)
                .build());
        members.add(new PersonBuilder()
                .firstName("Marcell")
                .surName("Kovács")
                .dateOfBirth(LocalDate.of(2000,8,15))
                .residence(new Residence(6933,"Eger","Dobó István tér 2."))
                .dateOfEntry(LocalDate.of(2018,5,18))
                .grade(Grade.NOVICE)
                .build());
        members.add(new PersonBuilder()
                .firstName("Joseph")
                .surName("Kovács")
                .dateOfBirth(LocalDate.of(2005,4,5))
                .residence(new Residence(3532,"Miskolc","Tátra utca 12."))
                .dateOfEntry(LocalDate.of(2018,5,18))
                .grade(Grade.NOVICE)
                .build());
        members.add(new PersonBuilder()
                .firstName("Laci")
                .surName("Kovács")
                .dateOfBirth(LocalDate.of(2002,9,15))
                .residence(new Residence(1122,"Budapest","Váci út 98."))
                .dateOfEntry(LocalDate.of(2017,6,22))
                .grade(Grade.INTERMEDIATE)
                .build());
        members.add(new PersonBuilder()
                .firstName("John")
                .surName("Carter")
                .dateOfBirth(LocalDate.of(1999,11,2))
                .residence(new Residence(3516,"Miskolc", "Kovács utca 2."))
                .dateOfEntry(LocalDate.of(2015,1,12))
                .grade(Grade.PROFICIENT)
                .build());
        System.out.println(members);
    }
}
