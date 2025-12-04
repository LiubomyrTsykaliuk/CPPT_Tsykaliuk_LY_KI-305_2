package ki35.tsykaliuk.lab6;

/**
 * Клас, що представляє коробку
 */
class Box implements Comparable<Box> {
    private double volume;
    private String content;

    /**
     * Конструктор класу Box
     * @param volume об'єм коробки
     * @param content вміст коробки
     */
    public Box(double volume, String content) {
        this.volume = volume;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{volume=" + volume + ", content='" + content + "'}";
    }

    @Override
    public int compareTo(Box other) {
        return Double.compare(this.volume, other.volume);
    }
}
