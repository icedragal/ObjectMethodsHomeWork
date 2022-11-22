public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return getName() +" " + getSurname();
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author man = (Author) other;
        return (name.equals(man.name) && surname.equals(man.surname));

    }
    public int hashCode() {
        return java.util.Objects.hash(name + surname);
    }
}
