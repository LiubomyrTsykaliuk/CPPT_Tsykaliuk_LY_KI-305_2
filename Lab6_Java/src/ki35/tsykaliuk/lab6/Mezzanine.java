package ki35.tsykaliuk.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований клас, що реалізує антресоль
 * @param <T> тип елементів, що зберігаються в антресолі
 */
public class Mezzanine<T extends Comparable<T>> {
    private List<T> items;
    private int capacity;

    /**
     * Конструктор класу Mezzanine
     * @param capacity максимальна місткість антресолі
     */
    public Mezzanine(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    /**
     * Додає елемент в антресоль
     * @param item елемент для додавання
     * @return true якщо елемент успішно додано, false якщо антресоль заповнена
     */
    public boolean addItem(T item) {
        if (items.size() < capacity) {
            items.add(item);
            return true;
        }
        return false;
    }

    /**
     * Виймає елемент з антресолі за вказаним індексом
     * @param index індекс елемента
     * @return вийнятий елемент
     * @throws IndexOutOfBoundsException якщо індекс невірний
     */
    public T removeItem(int index) {
        return items.remove(index);
    }

    /**
     * Знаходить мінімальний елемент в антресолі
     * @return мінімальний елемент або null якщо антресоль порожня
     */
    public T findMinimum() {
        if (items.isEmpty()) {
            return null;
        }

        T min = items.get(0);
        for (T item : items) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    /**
     * Повертає поточну кількість елементів в антресолі
     * @return кількість елементів
     */
    public int getCurrentSize() {
        return items.size();
    }

    /**
     * Виводить всі елементи антресолі
     */
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
