package ki35.tsykaliuk.lab3;

import java.io.IOException;

/**
 * Інтерфейс {@code EnergyEfficient} визначає методи, які мають реалізовувати енергоефективні пристрої.
 * <p>
 * Він містить методи для перевірки енергоефективності, оцінки терміну служби та розрахунку річного споживання енергії.
 */
public interface EnergyEfficient {

    /**
     * Перевіряє, чи є пристрій енергоефективним.
     *
     * @return true, якщо пристрій енергоефективний
     * @throws IOException якщо виникає помилка під час логування
     */
    boolean isEnergyEfficient() throws IOException;

    /**
     * Оцінює термін служби пристрою в годинах.
     *
     * @return термін служби в годинах
     * @throws IOException якщо виникає помилка під час логування
     */
    int estimateLifespan() throws IOException;

    /**
     * Розраховує річне споживання енергії пристроєм.
     *
     * @param hoursPerDay кількість годин роботи на день
     * @return річне споживання енергії в кВт*год
     * @throws IOException якщо виникає помилка під час логування
     */
    double calculateAnnualEnergyConsumption(int hoursPerDay) throws IOException;
}
