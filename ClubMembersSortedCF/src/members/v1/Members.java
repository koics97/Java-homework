package members.v1;

import java.util.*;

public class Members {
    private final SortedSet<Person> clubMembers;

    public Members() {
        clubMembers = new TreeSet<>();
    }

    public boolean add(Person p) {
        return clubMembers.add(p);
    }

    public boolean remove(Person p) {
        return clubMembers.remove(p);
    }

    public boolean contains(Person p) {
        return clubMembers.contains(p);
    }

    public int size(){
        return clubMembers.size();
    }

    public boolean isEmpty(){
        return clubMembers.isEmpty();
    }

    public void clear(){
        clubMembers.clear();
    }

    @Override
    public String toString() {
        return clubMembers.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return Objects.equals(clubMembers, members.clubMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubMembers);
    }
}
