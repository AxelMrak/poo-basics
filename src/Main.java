import model.MultipleChoiceQuestion;
import model.TrueFalseQuestion;
import service.QuizService;

class Main {

  public static void main(String[] args) {
    QuizService quizService = new QuizService();

    quizService.addQuestion(new MultipleChoiceQuestion(
        "¿Cuál es la capital de Argentina?",
        "Buenos Aires",
        new String[] { "Buenos Aires", "Córdoba", "Rosario", "Mendoza" }));

    quizService.addQuestion(new TrueFalseQuestion(
        "Argentina es el país más grande de América del Sur.",
        "Falso"));

    quizService.addQuestion(new TrueFalseQuestion(
        "El tango es un género musical originario de Argentina.",
        "Verdadero"));

    quizService.addQuestion(new MultipleChoiceQuestion(
        "Si Argentina tiene 45 millones de habitantes y el 10% son menores de 18 años, ¿cuántos habitantes menores de 18 años hay?",
        "4.5 millones",
        new String[] { "4.5 millones", "5 millones", "3 millones", "6 millones" }));

    quizService.addQuestion(new MultipleChoiceQuestion(
        "¿En qué año se ganó la Copa Mundial de la FIFA por primera vez Argentina?",
        "1978",
        new String[] { "1978", "1986", "1990", "2022" }));

    quizService.addQuestion(new MultipleChoiceQuestion(
        "¿Cuál es el equipo de fútbol más grande de Argentina?",
        "River Plate",
        new String[] { "River Plate", "Boca Juniors", "Independiente", "Racing Club", "Barracas Central" }));

    quizService.runQuiz();

  }
}
