# POO Basics - Quiz en consola (Java)

- Autor: Axel Sarmiento Mrak
- Legajo: 114759
- Fecha: 02-04-2026
- Asignatura: Programación Avanzada

Para la demostración de conceptos básicos de Programación Orientada a Objetos (POO) en Java.

## Tema elegido

Aplicación tipo **quiz** con preguntas de opción múltiple y verdadero/falso.

## Estructura del proyecto

He elegido una arquitectura limpia pero sencilla, la misma separa la lógica de negocio (modelo) de la interacción con el usuario (servicio). La clase `Main` se encarga de iniciar la aplicación y manejar el flujo general.

```text
src/
├── Main.java
├── model/
│   ├── Question.java
│   ├── MultipleChoiceQuestion.java
│   ├── TrueFalseQuestion.java
│   └── Util.java
└── service/
    └── QuizService.java
```

## Conceptos POO aplicados

- **Clases y objetos**: `Question`, `MultipleChoiceQuestion`, `TrueFalseQuestion`, `QuizService`.
- **Encapsulación**: atributos privados y acceso controlado.
- **Abstracción**: clase abstracta `Question` con método abstracto `checkAnswer`.
- **Herencia**: `MultipleChoiceQuestion` y `TrueFalseQuestion` heredan de `Question`.
- **Polimorfismo**: redefinición de `checkAnswer` en cada subtipo.
- **Relación entre objetos**: `QuizService` administra una colección de `Question`.
- **Protección de miembros**: `getCorrectAnswer()` protegido para uso en jerarquía.

## Compilar y ejecutar

Desde la carpeta `src`:

```bash
javac Main.java
java Main
```

o su versión concatenada:

```bash
javac Main.java && java Main
```

## Entorno utilizado

- Nvim para edición de código.
- Terminal para compilación y ejecución.
- Git para control de versiones.

Por ello la simplicidad en la complejidad del proyecto, enfocándome en la demostración de conceptos básicos de POO sin utilizar Maven o Gradle.
