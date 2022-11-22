public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author dmitryGlukhovsky = new Author("Dmitry", "Glukhovsky");
        Author dmitry = new Author("Dmitry", "Glukhovsky");

        System.out.println(dmitry.equals(dmitryGlukhovsky));
        System.out.println(dmitryGlukhovsky.equals(stephenKing));
        System.out.println(dmitryGlukhovsky);
        System.out.println(dmitryGlukhovsky.hashCode());
        System.out.println(dmitry.hashCode());
        System.out.println(stephenKing.hashCode());

        System.out.println();

        Book post = new Book("Пост", dmitryGlukhovsky, 2019);
        Book kristine = new Book("Christine", stephenKing, 1983);
        Book krist = new Book("Christine", stephenKing, 1983);

        System.out.println(post);
        System.out.println(kristine);
        System.out.println(kristine.equals(krist));
        System.out.println(post.equals(krist));
        System.out.println(kristine.hashCode());
        System.out.println(krist.hashCode());
        System.out.println(post.hashCode());
    }
}