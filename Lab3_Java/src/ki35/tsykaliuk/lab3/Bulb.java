package ki35.tsykaliuk.lab3;

/**
 * Клас {@code Bulb} представляє корпус лампочки, включаючи матеріал і форму.
 */
public class Bulb {
    private String material;
    private String shape;

    /**
     * Створює новий об'єкт {@code Bulb} з за замовчуванням матеріалом і формою.
     */
    public Bulb() {
        this("Glass", "Standard");
    }

    /**
     * Створює новий об'єкт {@code Bulb} з вказаними матеріалом і формою.
     *
     * @param material матеріал корпусу лампочки
     * @param shape форма лампочки
     */
    public Bulb(String material, String shape) {
        this.material = material;
        this.shape = shape;
    }

    /**
     * Повертає матеріал корпусу лампочки.
     *
     * @return матеріал корпусу
     */
    public String getMaterial() { return material; }

    /**
     * Встановлює матеріал корпусу лампочки.
     *
     * @param material новий матеріал корпусу
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Повертає форму лампочки.
     *
     * @return форма лампочки
     */
    public String getShape() { return shape; }

    /**
     * Встановлює форму лампочки.
     *
     * @param shape нова форма лампочки
     */
    public void setShape(String shape) { this.shape = shape; }

    /**
     * Повертає рядкове представлення об'єкта {@code Bulb}.
     *
     * @return рядкове представлення
     */
    @Override
    public String toString() {
        return "Bulb{material='" + material + "', shape='" + shape + "'}";
    }
}