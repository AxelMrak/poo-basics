import Model.MultipleChoiceQuestion;
import Model.TrueFalseQuestion;
import Service.QuizService;

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

    quizService.runQuiz();

  }
}
