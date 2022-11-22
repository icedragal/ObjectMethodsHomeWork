public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author dmitryGlukhovsky = new Author("Dmitry", "Glukhovsky");
        System.out.println("stephenKing.getName() = " + stephenKing.getName());
        System.out.println("stephenKing.getSurname() = " + stephenKing.getSurname());
        System.out.println("dmitryGlukhovsky.getName() = " + dmitryGlukhovsky.getName());
        System.out.println("dmitryGlukhovsky.getSurname() = " + dmitryGlukhovsky.getSurname());

        Book post = new Book("Пост", dmitryGlukhovsky, 2019);
        System.out.println("post.getName() = " + post.getName());
        System.out.println("post.getAuthor() = " + post.getAuthor());
        System.out.println("post.getYear() = " + post.getYear());

        Book kristine = new Book("Christine", stephenKing, 2222);
        System.out.println("kristine.getName() = " + kristine.getName());
        System.out.println("kristine.getAuthor() = " + kristine.getAuthor());
        System.out.println("kristine.getYear() = " + kristine.getYear());
        kristine.setYear(1983);
        System.out.println("kristine.getYear() = " + kristine.getYear());

    }
}