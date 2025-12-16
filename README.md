# Tasca S1.01 - Herencia y Polimorfismo

## Objetivo del Proyecto

Esta tarea tiene como objetivo trabajar con la programación orientada a objetos: la herencia y el polimorfismo aplicada en Java

## Clonar el repositorio

## Instalación

Ejecución abra el proyecto en IntelliJ IDEA o Eclipse, compile y ejecute el método main() de cada ejercicio.

## Tecnología utilizada

IntelliJ IDEA (imported and modified projects) Java 25 Git & GitHub

### Ejercicio 1

Se trata de diseñar un programa para manejar instrumentos musicales de un grupo de música. En este grupo, existen tres tipos de instrumentos:
* Instrumentos de viento
* Instrumentos de cuerda
* Instrumentos de percusión
Todos estos instrumentos tienen dos características en común: un nombre y un precio . Además, todos pueden tocarse , pero lo hacen de formas diferentes

### Ejercicio 2

Crear una clase que represente un coche con algunas particularidades que te permitirán entender cómo funciona la memoria y la inicialización en Java.

Preguntas para razonar:

¿Cuál de estos atributos puede inicializarse desde el constructor?
El atributo power, porque es no estático y es final. Los atributos final deben inicializarse en el constructor si no se inicializan al declararse.

¿Cuál no puede modificarse nunca?
El atributo brand no puede modificarse nunca, porque es static final, es una constante de clase que una vez asignado su valor no puede cambiar

¿Cuál afecta a todas las instancias de la clase?
El atributo model, es static, pertenece a la clase no a cada objeto, el cambio se refleja en todas las instancias.


Algunas conclusiones:

- Los atributos static representan información compartida.
- Los atributos final garantizan inmutabilidad.
- La combinación de static y final se usa para constantes.
- Los atributos no estáticos pertenecen a cada instancia

