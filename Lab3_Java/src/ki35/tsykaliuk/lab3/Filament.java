package ki35.tsykaliuk.lab3;

/**
 * Клас {@code Filament} представляє нитку лампочки, включаючи матеріал і товщину.
 */
public class Filament {
    private String material;
    private double thickness;

    /**
     * Створює новий об'єкт {@code Filament} з за замовчуванням матеріалом і товщиною.
     */
    public Filament() {
        this("Tungsten", 0.1);
    }

    /**
     * Створює новий об'єкт {@code Filament} з вказаними матеріалом і товщиною.
     *
     * @param material матеріал нитки
     * @param thickness товщина нитки
     */
    public Filament(String material, double thickness) {
        this.material = material;
        this.thickness = thickness;
    }

    /**
     * Повертає матеріал нитки.
     *
     * @return матеріал нитки
     */
    public String getMaterial() { return material; }

    /**
     * Встановлює матеріал нитки.
     *
     * @param material новий матеріал нитки
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Повертає товщину нитки.
     *
     * @return товщина нитки
     */
    public double getThickness() { return thickness; }

    /**
     * Встановлює товщину нитки.
     *
     * @param thickness нова товщина нитки
     */
    public void setThickness(double thickness) { this.thickness = thickness; }

    /**
     * Повертає рядкове представлення об'єкта {@code Filament}.
     *
     * @return рядкове представлення
     */
    @Override
    public String toString() {
        return "Filament{material='" + material + "', thickness=" + thickness + "}";
    }
}
