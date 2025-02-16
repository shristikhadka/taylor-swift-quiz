
public class Question
{

    private String question;
    private String userAnswer;
    private String correctAnswer;
    String []options;

    @Override
    public String toString() {
        return question + "\n" +
                "A) " + options[0] + "\n" +
                "B) " + options[1] + "\n" +
                "C) " + options[2] + "\n" +
                "D) " + options[3] + "\n";
    }


    public String getQuestion() {
        return question;
    }
    public String getUserAnswer() {
        return userAnswer;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
   public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
   }


    public Question(String question, String userAnswer, String correctAnswer, String[] options) {
        this.question = question;
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
        this.options = options;

    }
    public boolean isCorrect() {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }



}