public class Main {
    public static void main(String[] args) {
        Author chekhov = new Author("Антон", "Чехов");
        Author tolstoy = new Author("Лев", "Толстой");
        Book firstBook = new Book("Чайка", chekhov, 1974);
        Book secondBook = new Book("Война и мир", tolstoy, 1998);

        firstBook.setYear(1995);

        if (firstBook.equals(secondBook)) {
            System.out.println(firstBook);
        } else {
            System.out.println(secondBook);
        }
    }
}
