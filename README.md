# Intellij IDEA Code inspections configuration #

`inspections_config.xml` - файл для настройки инспекции кода в Intellij IDEA.

Импорт файла настроек в IDEA: `File -> Settings -> Inspections -> Шестерёнка -> Import profile...`

### Настройки, дублирующие правила Checkstyle:

1. Проверяет, что поля и методы вызываются через this.
   <br>Настройки в IDEA:
   - `Instance field access not qualified with this`;
   - `Instance method call not qualified with this`.
2. Подсвечивает выход за пределы максимально длины строки.
   <br>Настройка в IDEA: `The line is longer than allowed by code style`.

### Настройки, дополняющие правила Checkstyle:

1. Проверяет, что статичные поля и методы вызываются через имя класса.
   <br>Настройка в IDEA: `Unqualified static access`.  
