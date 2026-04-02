package Service;

import java.util.ArrayList;

import Model.MultipleChoiceQuestion;
import Model.Question;

public class QuizService {

  private ArrayList<Question> questionsList;
  private int score;

  public QuizService() {
    this.questionsList = new ArrayList<>();
    this.score = 0;
  }

  public void addQuestion(Question question) {
    questionsList.add(question);
  }

  public ArrayList<Question> getQuestionsList() {
    return questionsList;
  }

  public int getScore() {
    return score;
  }

  public void runQuiz() {
    for (Question question : questionsList) {
      System.out.println(question.getQuestionText());
      if (question instanceof MultipleChoiceQuestion) {
        ((MultipleChoiceQuestion) question).showOptions();
      }
      String userAnswer = System.console().readLine("Tu respuesta: ");
      if (question.checkAnswer(userAnswer)) {
        score++;
        System.out.println("¡Respuesta correcta!");
      } else {
        System.out.println("Respuesta incorrecta. La respuesta correcta es: " + question.getCorrectAnswer());
      }
    }
    System.out.println("Tu puntuación final es: " + score + "/" + questionsList.size());
  }
}
