# 01 - Java Fundamentals

Este módulo contiene ejercicios básicos para practicar sintaxis, variables, tipos de datos, operadores, entrada por consola y conversiones de tipos en Java.

## Temas estudiados

- Estructura de una clase Java.
- Método `main`.
- Variables.
- Tipos primitivos.
- `String`.
- Operadores aritméticos.
- Operadores lógicos.
- Entrada por consola con `Scanner`.
- Conversión de tipos.
- Comparación entre `==` y `.equals()`.

## ¿Qué es una variable?

Una variable es un espacio con nombre donde se almacena un valor.

Ejemplo:

```java
int age = 25;
String name = "Daniel";
double salary = 1500.50;
```

En Java cada variable debe tener un tipo definido

## Qué diferencia hay entre `int`, `long`, `float` y `double`?

`int` se usa para números enteros comunes.

```java
int age = 30;
``` 

`long` se usa para números enteros más grandes.

```java
long population = 8000000000L;
```

`float` se usa para números decimales de menor precisión.

```java
float price = 19.99f;
```

`double` se usa para números decimales de mayor precisión y es el más común para cálculos con decimales.

```java
double salary = 2500.75;
```

## ¿Qué diferencia hay entre == y .equals()?

Con tipos primitivos, `==` compara valores.

```java
int a = 10;
int b = 10;

System.out.println(a == b); // true
```

Con objetos como `String`, `==` compara referencias en memoria, no el contenido.

Para comparar el contenido de dos textos se usa `.equals().`

```java
String language = "Java";

System.out.println(language.equals("Java")); // true
```

Forma recomendada:

```java
if ("Java".equals(language)) {
    System.out.println("El lenguaje es Java");
}
```

## ¿Qué errores cometí al principio?
- Olvidar declarar el `package` en las clases.
- Escribir código fuera del método `main`.
- Usar `==` para comparar textos.
- No compilar desde la carpeta raíz del paquete.
- Olvidar importar `Scanner`.
- Mezclar `nextInt()` con `nextLine()` sin limpiar el salto de línea.