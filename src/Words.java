import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Words {
    /*создали массив и выбрали из него слово*/
    public static String findWord() throws FileNotFoundException {
        File file = new File("russian_nouns.txt");
        Scanner scanner = new Scanner(file);
        List<String> massiveOfWords = new ArrayList<>();
        while (scanner.hasNextLine()) {
            massiveOfWords.add(scanner.nextLine());
        }
        scanner.close();
        return massiveOfWords.get(new Random().nextInt(massiveOfWords.size()));
    }

    /*слово разбили на буквы и сделали звездочками*/
    public static char[] lettersOfTheWord(char[] chars) {
        Arrays.fill(chars, '*');
        return chars;
    }
    public static void checkEngLetter(char answerChar) {
        char[] stopWord = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for(int i = 0; i < stopWord.length; i++){
            stopWord[i] = Character.toLowerCase(stopWord[i]);
            if(answerChar == stopWord[i]) {
                System.out.println("Вы ввели английскую букву");
                break;
            }
        }
    }
}

