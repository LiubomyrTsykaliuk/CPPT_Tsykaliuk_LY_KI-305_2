class LightBulb:
    def __init__(self, brand, power_watts):
        """
        Базовий клас для лампочки.
        :param brand: Виробник
        :param power_watts: Потужність у Ватах
        """
        self._brand = brand  # Захищений член (protected) [cite: 413]
        self._power = power_watts
        self._is_on = False

    def turn_on(self):
        self._is_on = True
        print(f"Лампочка {self._brand} увімкнена.")

    def turn_off(self):
        self._is_on = False
        print(f"Лампочка {self._brand} вимкнена.")

    def get_info(self):
        status = "світить" if self._is_on else "не світить"
        return f"Лампочка {self._brand}, Потужність: {self._power}W, Стан: {status}"