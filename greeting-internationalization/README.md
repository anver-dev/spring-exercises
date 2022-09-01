# Greeting Internationalization 

This project is based on guide [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/#initial) but adding some things.

Originally the project show one following greeting:
 ```
 {
    "id": 1,
    "content": "Hello, Karina!"
 }
```
The idea was to modify the project to be able to choose the response language. For this it was necessary to add the following classes (and following the [tutorial](https://ihorkosandiak.medium.com/spring-boot-rest-internationalization-9ab3fce2489)):
- **Custom Locale Resolver**: that will be responsible for defining user’s locale.
- **Translator**: that will be responsible for choosing right message according to specified locale.

At the same time properties files were added
 ```
 +- messages.properties
 +- messages_en.properties
 +- messages_fr.properties
```

These files have different greetings depending on each language.