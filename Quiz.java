import java.util.Scanner;
public class Quiz
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score=0;

        Question[]questions={ new Question("What year was Taylor Swift born?", "", "1989", new String[]{"1987", "1988", "1989", "1990"}),
                new Question("Which album features the song 'All Too Well'?", "", "Red", new String[]{"Fearless", "Speak Now", "Red", "1989"}),
                new Question("What is the name of Taylor Swift's debut album?", "", "Taylor Swift", new String[]{"Fearless", "Taylor Swift", "Speak Now", "Lover"}),
                new Question("Which of these songs was NOT on the '1989' album?", "", "Enchanted", new String[]{"Shake It Off", "Blank Space", "Style", "Enchanted"}),
                new Question("What is Taylor Swift’s lucky number?", "", "13", new String[]{"7", "10", "13", "22"})
        };

        for(Question q : questions){
            System.out.println(q);
            System.out.println("Enter your answer (A,B,C,D,E)");
            String userAnswer = sc.nextLine().toUpperCase();

            String selectedAnswer;
            switch (userAnswer) {
                case "A": selectedAnswer = q.options[0]; break;
                case "B": selectedAnswer = q.options[1]; break;
                case "C": selectedAnswer = q.options[2]; break;
                case "D": selectedAnswer = q.options[3]; break;
                default:
                    System.out.println("Invalid choice! Skipping question...");
                    continue;
            }
            q.setUserAnswer(selectedAnswer);

            //check if correct
            if(q.isCorrect()){
                System.out.println("Correct! 🎉\n");
                score++;
            }
            else {
                System.out.println("Wrong! The correct answer was " + q.getCorrectAnswer() + "\n");
            }

        }

        // Display final score
        System.out.println("Quiz Over! You scored " + score + " out of " + questions.length + "!");

    }

}
