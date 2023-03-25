# CursorSpringBootPractice
1. Generate a Spring Boot application using Spring Initializr, add the spring web and thymeleaf dependency. Create a view that will greet the user by typing "good morning" " , and the username colored to the specific color specified by request param.


1. Створити спрінг бут проект використавши Spring Initializr. Додати залежності веб та thymeleaf. Створити вю, яке буде містити насутпну фразу "Доброго дня, температура сьогодні x градусів, де х буде параметр переданий в контролер, слово градусів має бути підфарбоване у колі який теж є параметром.

2. Опційно 

2.Create your own auto-configuration. It should work by the following rules:

a.Auto-configuration will be enabled if class ConfigurationEnabler is in the classpath;

b.Auto-configuration has bean than will be created if ‘application.properties’ file contains property “custom.configuration.enabled” with the value true.
