public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name,  Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Книга: " + name + ", автор: " + author.toString() + ", год публикации: " + year;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return (name.equals(book.name) && author.equals(book.author));

    }

    public int hashCode() {
        return java.util.Objects.hash(name + author);
    }
}
