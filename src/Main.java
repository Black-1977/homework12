public class Main {
    public static void main(String[] args) {
        Author chehov = new Author("Антон", "Чехов");
        Author tolstoy = new Author("Лев", "Толстой");
        Book firstBook = new Book("Чайка", chehov, 1974);
        Book secondBook = new Book("Война и мир", tolstoy, 1998);

        firstBook.setYear(1995);
    }
}
