package Model;

public class MultipleChoiceQuestion extends Question {
  private String[] options;

  public MultipleChoiceQuestion(String questionText, String correctAnswer, String[] options) {
    super(questionText, correctAnswer);
    this.options = options;
  }

  public String[] getOptions() {
    return options;
  }

  public void showOptions() {
    for (int i = 0; i < options.length; i++) {
      System.out.println("--- OPCIONES ---");
      System.out.println((i + 1) + ". " + options[i]);
    }
  }

  /**
   * Application of POLYMORPHISM principle: This method overrides the abstract
   * method from the Question class to provide specific logic for multiple choice
   * questions. That logically is different from how other question types (like
   * true/false) might check answers, demonstrating polymorphic behavior.
   */
  @Override
  public boolean checkAnswer(String userAnswer) {
    String cleanedUserAnswer = userAnswer.trim().toLowerCase();
    String cleanedCorrectAnswer = getCorrectAnswer().trim().toLowerCase();

    if (isAValidOption(cleanedUserAnswer)) {
      return cleanedUserAnswer.equals(cleanedCorrectAnswer);
    } else {
      return checkAnswerByNumber(cleanedUserAnswer);
    }
  }

  private boolean isAValidOption(String userAnswer) {
    for (String option : options) {
      if (option.trim().toLowerCase().equals(userAnswer)) {
        return true;
      }
    }
    return false;
  }

  private boolean checkAnswerByNumber(String userAnswer) {
    try {
      int userAnswerIndex = Integer.parseInt(userAnswer.trim()) - 1;
      if (userAnswerIndex >= 0 && userAnswerIndex < options.length) {
        return options[userAnswerIndex].trim().toLowerCase().equals(getCorrectAnswer().trim().toLowerCase());
      } else {
        throw new IllegalArgumentException(
            "Número de opción inválido. Por favor, ingrese un número entre 1 y " + options.length + ".");
      }
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(
          "Respuesta inválida. Por favor, ingrese el texto de la respuesta o el número correspondiente a la opción.");
    }
  }

}
