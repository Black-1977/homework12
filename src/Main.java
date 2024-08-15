public class Main {
    public static void main(String[] args) {
        Autor chehov = new Autor("Антон", "Чехов");
        Autor tolstoy = new Autor("Лев", "Толстой");
        Book firstBook = new Book("Чайка", chehov, 1974);
        Book secondBook = new Book("Война и мир", tolstoy, 1998);

        firstBook.setYear(1995);
    }
}



