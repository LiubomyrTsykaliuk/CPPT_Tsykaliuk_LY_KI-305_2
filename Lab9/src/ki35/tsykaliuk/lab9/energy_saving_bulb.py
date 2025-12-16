from light_bulb import LightBulb

class EnergySavingBulb(LightBulb):
    def __init__(self, brand, power_watts, color_temperature):
        """
        Похідний клас: Енергозберігаюча лампочка. [cite: 676]
        Використовує super() для виклику конструктора базового класу. [cite: 512, 515]
        :param color_temperature: Температура світла (напр. 4000K)
        """
        super().__init__(brand, power_watts)
        self.__color_temp = color_temperature # Приватний член (private) [cite: 413]

    def get_info(self):
        # Розширюємо метод базового класу
        base_info = super().get_info()
        return f"{base_info}, Температура світла: {self.__color_temp}K (Енергозберігаюча)"