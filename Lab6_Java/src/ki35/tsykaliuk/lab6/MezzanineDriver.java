package ki35.tsykaliuk.lab6;

/**
 * Клас-драйвер для демонстрації роІботи класу Mezzanine.
 * Виконує тестування зберігання об'єктів у вигляді книг та коробок в антресолі.
 * Клас дозволяє додавати елементи, відображати всі елементи, знаходити елементи
 * з мінімальними характеристиками та видаляти їх.
 */
public class MezzanineDriver {
    public static void main(String[] args) {
        // Тестування з книгами
        Mezzanine<Book> bookMezzanine = new Mezzanine<>(5);

        // Додаємо книги
        bookMezzanine.addItem(new Book("Java Programming", 500));
        bookMezzanine.addItem(new Book("Python Basics", 300));
        bookMezzanine.addItem(new Book("Algorithms", 800));

        // Виводимо книги
        System.out.println("Книги в антресолі:");
        bookMezzanine.displayItems();

        // Знаходимо найтоншу книгу
        System.out.println("\nНайтонша книга:");
        System.out.println(bookMezzanine.findMinimum());

        // Тестування з коробками
        Mezzanine<Box> boxMezzanine = new Mezzanine<>(3);

        // Додаємо коробки
        boxMezzanine.addItem(new Box(10.5, "Інструменти"));
        boxMezzanine.addItem(new Box(5.2, "Канцелярія"));
        boxMezzanine.addItem(new Box(15.7, "Іграшки"));

        // Виводимо коробки
        System.out.println("\nКоробки в антресолі:");
        boxMezzanine.displayItems();

        // Знаходимо найменшу коробку
        System.out.println("\nНайменша коробка:");
        System.out.println(boxMezzanine.findMinimum());

        // Демонстрація видалення
        System.out.println("\nВидаляємо коробку:");
        System.out.println(boxMezzanine.removeItem(1));

        // Виводимо коробки після видалення
        System.out.println("\nКоробки після видалення:");
        boxMezzanine.displayItems();
    }
}
