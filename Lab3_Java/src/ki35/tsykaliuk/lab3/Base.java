package ki35.tsykaliuk.lab3;

/**
 * Клас {@code Base} представляє основу лампочки, включаючи тип і метод монтажу.
 */
public class Base {
    private String type;
    private String mountingMethod;

    /**
     * Створює новий об'єкт {@code Base} з за замовчуванням типом і методом монтажу.
     */
    public Base() {
        this("E27", "Screw");
    }

    /**
     * Створює новий об'єкт {@code Base} з вказаними типом і методом монтажу.
     *
     * @param type тип основи лампочки
     * @param mountingMethod метод монтажу
     */
    public Base(String type, String mountingMethod) {
        this.type = type;
        this.mountingMethod = mountingMethod;
    }

    /**
     * Повертає тип основи.
     *
     * @return тип основи
     */
    public String getType() { return type; }

    /**
     * Встановлює тип основи.
     *
     * @param type новий тип основи
     */
    public void setType(String type) { this.type = type; }

    /**
     * Повертає метод монтажу основи.
     *
     * @return метод монтажу
     */
    public String getMountingMethod() { return mountingMethod; }

    /**
     * Встановлює метод монтажу основи.
     *
     * @param mountingMethod новий метод монтажу
     */
    public void setMountingMethod(String mountingMethod) { this.mountingMethod = mountingMethod; }

    /**
     * Повертає рядкове представлення об'єкта {@code Base}.
     *
     * @return рядкове представлення
     */
    @Override
    public String toString() {
        return "Base{type='" + type + "', mountingMethod='" + mountingMethod + "'}";
    }
}
