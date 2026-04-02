package Model;

public class TrueFalseQuestion extends Question {

  public TrueFalseQuestion(String questionText, String correctAnswer) {
    super(questionText, correctAnswer);
  }

  /**
   * Application of POLYMORPHISM principle: This method overrides the abstract
   * method from the Question class to provide specific logic for true/false
   * questions. It checks if the user's answer matches the correct answer,
   * ignoring case sensitivity.
   */
  @Override
  public boolean checkAnswer(String userAnswer) {

    String cleanedUserAnswer = userAnswer.trim().toLowerCase();
    boolean trueUserAnswer = cleanedUserAnswer.equals("verdadero") || cleanedUserAnswer.equals("v")
        || cleanedUserAnswer.equals("true");
    boolean falseUserAnswer = cleanedUserAnswer.equals("falso") || cleanedUserAnswer.equals("f")
        || cleanedUserAnswer.equals("false");

    String cleanedCorrectAnswer = getCorrectAnswer().trim().toLowerCase();
    boolean correctAnswerIsTrue = cleanedCorrectAnswer.equals("verdadero") || cleanedCorrectAnswer.equals("v")
        || cleanedCorrectAnswer.equals("true");
    boolean correctAnswerIsFalse = cleanedCorrectAnswer.equals("falso") || cleanedCorrectAnswer.equals("f")
        || cleanedCorrectAnswer.equals("false");

    if (!trueUserAnswer && !falseUserAnswer) {
      throw new IllegalArgumentException(
          "Respuesta inválida. Por favor, ingrese 'verdadero', 'v', 'true', 'falso', 'f' o 'false'.");
    }

    return (trueUserAnswer && correctAnswerIsTrue) || (falseUserAnswer && correctAnswerIsFalse);
  }
}
