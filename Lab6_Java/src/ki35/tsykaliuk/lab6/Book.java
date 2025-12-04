package ki35.tsykaliuk.lab6;

/**
 * Клас, що представляє книгу
 */
class Book implements Comparable<Book> {
    private String title;
    private int pages;

    /**
     * Конструктор класу Book
     * @param title назва книги
     * @param pages кількість сторінок
     */
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', pages=" + pages + "}";
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);
    }
}
