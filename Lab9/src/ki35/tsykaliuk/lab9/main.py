from energy_saving_bulb import EnergySavingBulb

def main():
    # Створення об'єкта похідного класу [cite: 477]
    my_bulb = EnergySavingBulb("Philips", 12, 4100)
    
    # Вивід початкової інформації
    print(my_bulb.get_info())
    
    # Демонстрація методів
    my_bulb.turn_on()
    print(my_bulb.get_info())
    
    my_bulb.turn_off()
    
    # Видалення об'єкта [cite: 437]
    del my_bulb

if __name__ == "__main__":
    main()