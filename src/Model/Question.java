package Model;

public abstract class Question {

  /**
   * Application of ENCAPSULATION principle: Both properties can only be accessed
   * through getter methods, and the correct answer is protected to prevent
   * unauthorized access from outside the class hierarchy.
   */
  private String questionText;
  private String correctAnswer;

  public Question(String questionText, String correctAnswer) {
    this.questionText = questionText;
    this.correctAnswer = correctAnswer;
  }

  public String getQuestionText() {
    return questionText;
  }

  protected String getCorrectAnswer() {
    return correctAnswer;
  }

  /**
   * Application of ABSTRACTION principle: The checkAnswer method is abstract,
   * allowing different types of questions (e.g., multiple choice, true/false) to
   * implement their own logic.
   */
  abstract boolean checkAnswer(String userAnswer);
}
