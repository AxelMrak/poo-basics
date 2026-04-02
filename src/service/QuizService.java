package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.MultipleChoiceQuestion;
import model.Question;
import model.Util;

public class QuizService {

  private final ArrayList<Question> questionsList;
  private int score;
  private final Scanner scanner;

  public QuizService() {
    this.questionsList = new ArrayList<>();
    this.score = 0;
    this.scanner = new Scanner(System.in);
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

    for (int i = 0; i < questionsList.size(); i++) {
      Question question = questionsList.get(i);

      System.out.println("-----------------------------");
      System.out.println("Pregunta " + (i + 1) + " de " + questionsList.size());
      System.out.println("Puntuación actual: " + score);
      System.out.println("-----------------------------");
      System.out.println(question.getQuestionText());

      if (question instanceof MultipleChoiceQuestion) {
        ((MultipleChoiceQuestion) question).showOptions();
      }

      boolean answered = false;
      while (!answered) {
        System.out.print("Tu respuesta: ");
        String userAnswer = scanner.nextLine();

        try {
          if (question.checkAnswer(userAnswer)) {
            score++;
            System.out.println("¡Respuesta correcta!");
          } else {
            System.out.println("Respuesta incorrecta!");
          }
          answered = true;
        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
          System.out.println("Intenta nuevamente.");
        }
      }

      Util.sleepSeconds(2);
      Util.clearConsole();
    }

    System.out.println("Tu puntuación final es: " + score + "/" + questionsList.size());
    Util.sleepSeconds(5);
  }
}
