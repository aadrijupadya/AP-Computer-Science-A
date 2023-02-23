import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.*;

public class WordleMain {
    public static void main(String[] args) {
        Scanner pencil = new Scanner(System.in);
        // this part of code will take all the words from the list and store it all in
        // allWords
        ArrayList<String> allWords = new ArrayList<String>();
        try {
            File myObj = new File("/Users/aadrijupadya/Downloads/wordle.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                allWords.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String[] letters = new String[1];
        wordleObject wordle = new wordleObject(letters);
        String word = allWords.get(getWord(allWords));
        Boolean endgame = false;
        int cnt = 0;
        while (!endgame) {
            cnt++;
            wordle.displayAlphabet(wordle.getAlphabet());
            System.out.println("Enter your guess");
            String guess = pencil.nextLine();
            letters[0] = guess;
            wordle.removeLetters(letters, wordle.getAlphabet());
            wordle.process(word, guess);
            if (wordle.winCondition(word, letters)) {
                System.out.println("Congrats, you got the word in " + cnt + " guesses!");
                endgame = true;
            }
            if (cnt == 6) {
                System.out.println("The word was " + word);
                endgame = true;
            }


        }
        pencil.close();


    }

    public static int getWord(ArrayList<String> words) {
        int index = (int) (Math.random() * words.size());
        return index;
    
    }


}

