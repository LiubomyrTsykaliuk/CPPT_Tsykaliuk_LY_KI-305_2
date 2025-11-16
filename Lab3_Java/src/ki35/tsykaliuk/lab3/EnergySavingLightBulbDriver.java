package ki35.tsykaliuk.lab3;

import java.io.IOException;
/**
 * Клас {@code LightBulbDriver} є точкою входу для програми, яка демонструє використання класу {@code LightBulb}.
 */
public class EnergySavingLightBulbDriver {
    /**
     * Головний метод.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            EnergySavingLightBulb bulb = new EnergySavingLightBulb(10, "Білий", "LED");

            bulb.turnOn();
            System.out.println("Лампочка увімкнена: " + bulb.isOn());

            bulb.changeWattage(8);
            bulb.changeColor("Теплий білий");

            System.out.println("Енергоефективна: " + bulb.isEnergyEfficient());
            System.out.println("Очікуваний термін служби: " + bulb.estimateLifespan() + " годин");
            System.out.println("Річне споживання енергії: " +
                    bulb.calculateAnnualEnergyConsumption(5) + " кВт*год");

            System.out.println("Технологія: " + bulb.getTechnology());

            bulb.turnOff();
            System.out.println("Лампочка вимкнена: " + !bulb.isOn());

            bulb.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}
