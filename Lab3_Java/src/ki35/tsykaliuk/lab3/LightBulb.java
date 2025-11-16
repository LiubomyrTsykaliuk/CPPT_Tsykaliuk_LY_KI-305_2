package ki35.tsykaliuk.lab3;

import java.io.IOException;

/**
 * Клас {@code LightBulb} представляє лампочку з характеристиками, такими як потужність, колір, та стан (увімкнена/вимкнена).
 * Лампочка має елементи, такі як філамент, корпус і патрон.
 */
public abstract class LightBulb {
    protected  Filament filament;
    protected  Bulb bulb;
    protected  Base base;
    protected  Logger logger;
    protected  int wattage;
    protected  String color;
    protected  boolean isOn;

    /**
     * Створює новий об'єкт {@code LightBulb} з вказаною потужністю і кольором.
     *
     * @param wattage потужність лампочки в ватах
     * @param color колір світла лампочки
     * @throws IOException якщо виникає помилка під час створення логера
     */
    public LightBulb(int wattage, String color) throws IOException {
        this.wattage = wattage;
        this.color = color;
        this.filament = new Filament();
        this.bulb = new Bulb();
        this.base = new Base();
        this.isOn = false;

        this.logger = new Logger("light_bulb_log.txt");
        logger.log(String.format("Лампочка %s створена.", this.toString()));
    }

    /**
     * Створює новий об'єкт {@code LightBulb} з вказаними елементами, потужністю і кольором.
     *
     * @param filament філамент лампочки
     * @param bulb корпус лампочки
     * @param base патрон лампочки
     * @param wattage потужність лампочки в ватах
     * @param color колір світла лампочки
     * @throws IOException якщо виникає помилка під час створення логера
     */
    public LightBulb(Filament filament, Bulb bulb, Base base, int wattage, String color) throws IOException {
        this.filament = filament;
        this.bulb = bulb;
        this.base = base;
        this.wattage = wattage;
        this.color = color;
        this.isOn = false;

        this.logger = new Logger("light_bulb_log.txt");
        logger.log(String.format("Лампочка %s створена.", this.toString()));
    }

    /**
     * Абстрактний метод для вмикання лампочки.
     *
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public abstract void turnOn() throws IOException;

    /**
     * Абстрактний метод для вимикання лампочки.
     *
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public abstract void turnOff() throws IOException;

    /**
     * Перевіряє, чи лампочка увімкнена.
     *
     * @return true, якщо лампочка увімкнена, false - в іншому випадку
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public boolean isOn() throws IOException {
        logger.log(String.format("Перевірка стану лампочки: %s", (isOn ? "увімкнена" : "вимкнена")));
        System.out.printf("Перевірка стану лампочки: %s\n", (isOn ? "увімкнена" : "вимкнена"));
        return isOn;
    }

    /**
     * Змінює потужність лампочки.
     *
     * @param newWattage Нова потужність
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public void changeWattage(int newWattage) throws IOException {
        this.wattage = newWattage;

        logger.log(String.format("Змінено потужність на %s Вт", newWattage));
        System.out.printf("Змінено потужність на %s Вт\n", newWattage);
    }

    /**
     * Змінює колір світла лампочки.
     *
     * @param newColor Новий колір
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public void changeColor(String newColor) throws IOException {
        this.color = newColor;

        logger.log(String.format("Змінено колір на %s", newColor));
        System.out.printf("Змінено колір на %s\n", newColor);
    }

    /**
     * Перевіряє, чи лампочка енергоефективна.
     *
     * @return true, якщо лампочка енергоефективна, false - в іншому випадку
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public boolean isEnergyEfficient() throws IOException {
        boolean efficient = wattage <= 15;

        logger.log(String.format("Перевірка енергоефективності: %s", (efficient ? "так" : "ні")));
        System.out.printf("Перевірка енергоефективності: %s\n", (efficient ? "так" : "ні"));

        return efficient;
    }

    /**
     * Розраховує приблизний термін служби лампочки.
     *
     * @return Приблизний термін служби в годинах
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public int estimateLifespan() throws IOException {
        int lifespan = 1000 * (100 / wattage);

        logger.log(String.format("Оцінка терміну служби: %s годин", lifespan));
        System.out.printf("Оцінка терміну служби: %s годин\n", lifespan);
        return lifespan;
    }

    /**
     * Розраховує щорічне споживання енергії.
     *
     * @param hoursPerDay Середня кількість годин роботи на день
     * @return Річне споживання енергії в кВт*год
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public double calculateAnnualEnergyConsumption(int hoursPerDay) throws IOException {
        double annualConsumption = (wattage * hoursPerDay * 365) / 1000.0;

        logger.log(String.format("Розрахунок річного споживання енергії: %s кВт*год", annualConsumption));
        System.out.printf("Розрахунок річного споживання енергії: %s кВт*год\n", annualConsumption);

        return annualConsumption;
    }

    /**
     * Перевіряє сумісність лампочки з певним типом патрона.
     *
     * @param socketType Тип патрона
     * @return true, якщо лампочка сумісна, false - в іншому випадку
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public boolean isCompatibleWith(String socketType) throws IOException {
        boolean compatible = base.getType().equalsIgnoreCase(socketType);

        logger.log(String.format("Перевірка сумісності з патроном %s : %s", socketType, (compatible ? "так" : "ні")));
        System.out.printf("Перевірка сумісності з патроном %s : %s\n", socketType, (compatible ? "так" : "ні"));
        return compatible;
    }

    /**
     * Визначає тип лампочки на основі її характеристик.
     *
     * @return Тип лампочки (наприклад, "LED", "Incandescent", "CFL")
     * @throws IOException якщо виникає помилка під час запису в лог
     */
    public String determineBulbType() throws IOException {
        String type;
        if (wattage <= 15 && filament.getMaterial().equalsIgnoreCase("LED")) {
            type = "LED";
        } else if (filament.getMaterial().equalsIgnoreCase("Tungsten")) {
            type = "Incandescent";
        } else {
            type = "CFL";
        }

        logger.log(String.format("Визначено тип лампочки: %s", type));
        System.out.printf("Визначено тип лампочки: %s\n", type);

        return type;
    }

    /**
     * Закриває логер для збереження даних у файл.
     *
     * @throws IOException якщо виникає помилка під час закриття логера
     */
    public void closeLogger() throws IOException {
        logger.close();
    }
}
