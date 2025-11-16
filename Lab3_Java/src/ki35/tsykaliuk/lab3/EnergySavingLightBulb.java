package ki35.tsykaliuk.lab3;

import java.io.IOException;

/**
 * Клас {@code EnergySavingLightBulb} представляє енергозберігаючу лампочку.
 * <p>
 * Цей клас розширює базову лампочку {@code LightBulb} та реалізує інтерфейс {@code EnergyEfficient},
 * надаючи функціональність для перевірки енергоефективності і оцінки терміну служби.
 */
public class EnergySavingLightBulb extends LightBulb implements EnergyEfficient {
    private String technology;

    /**
     * Створює новий об'єкт {@code EnergySavingLightBulb} з вказаною потужністю, кольором та технологією.
     *
     * @param wattage потужність лампочки в ватах
     * @param color колір світла лампочки
     * @param technology технологія енергозбереження (наприклад, "LED", "CFL")
     * @throws IOException якщо виникає помилка під час створення логера
     */
    public EnergySavingLightBulb(int wattage, String color, String technology) throws IOException {
        super(wattage, color);
        this.technology = technology;
        logger.log(String.format("Створено енергозберігаючу лампочку: %s, %d Вт, %s", technology, wattage, color));
    }

    /**
     * Увімкнути лампочку.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public void turnOn() throws IOException {
        isOn = true;
        logger.log("Енергозберігаюча лампочка увімкнена");
    }

    /**
     * Вимкнути лампочку.
     *
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public void turnOff() throws IOException {
        isOn = false;
        logger.log("Енергозберігаюча лампочка вимкнена");
    }

    /**
     * Перевіряє, чи є лампочка енергоефективною.
     *
     * @return true, якщо потужність лампочки менше або дорівнює 15 Вт
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public boolean isEnergyEfficient() throws IOException {
        boolean efficient = wattage <= 15;
        logger.log(String.format("Перевірка енергоефективності: %s", (efficient ? "так" : "ні")));
        return efficient;
    }

    /**
     * Оцінює термін служби лампочки в годинах.
     *
     * @return термін служби в годинах
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public int estimateLifespan() throws IOException {
        int lifespan = technology.equalsIgnoreCase("LED") ? 25000 : 10000;
        logger.log(String.format("Оцінка терміну служби: %d годин", lifespan));
        return lifespan;
    }

    /**
     * Розраховує річне споживання енергії лампочкою.
     *
     * @param hoursPerDay кількість годин роботи на день
     * @return річне споживання енергії в кВт*год
     * @throws IOException якщо виникає помилка під час логування
     */
    @Override
    public double calculateAnnualEnergyConsumption(int hoursPerDay) throws IOException {
        double annualConsumption = (wattage * hoursPerDay * 365) / 1000.0;
        logger.log(String.format("Розрахунок річного споживання енергії: %.2f кВт*год", annualConsumption));
        return annualConsumption;
    }

    /**
     * Повертає технологію енергозбереження лампочки.
     *
     * @return технологія енергозбереження
     */
    public String getTechnology() {
        return technology;
    }
}
