import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int successfulAttempts = 0;
        while (true) {
            System.out.println("Выберите нужный пункт:");
            System.out.println("1. Начать новую игру.");
            System.out.println("2. Закончить игру");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Начинаем игру!");
                int errorCounter = 0;

                List<Character> letters = new ArrayList<>();

                /*получили слово*/
                String word = Words.findWord();
                System.out.println(word);

                /*длина слова*/
                int x = word.length();
                System.out.println(x);

                /*переводим слово word в буквы*/
                List<Character> wordInLetters = new ArrayList<>();
                for (char c : word.toCharArray()) {
                    wordInLetters.add(c);
                }
//                char[] wordInLetters = word.toCharArray();

                /*переводим массив из букв в массив со звездочками */
                char[] chars = new char[wordInLetters.size()];
                Arrays.fill(chars, '*');

                /*цикл вывода с помощью for each*/
                for (var b : chars) {
                    System.out.print(b);
                }
                System.out.println();

                while (true) {
                    /*Вводим букву*/
                    System.out.println("Введите букву: ");
                    char answerChar = scanner.next().toLowerCase().charAt(0);

                    boolean checkLetter = false;
                    for (char letterInTheArrays : letters) {
                        if (answerChar == letterInTheArrays) {
                            checkLetter = true;
                            break;
                        }
                    }
                    if (checkLetter) {
                        System.out.println("Вы уже вводили эту букву");
                    }

                    Words.checkEngLetter(answerChar);

                    /*Проверяем, есть ли буква в слове*/
                    int letterInTheWord = word.indexOf(answerChar);

                    /*Если да, то добавляем в массив с использованными буквами,
                    открываем букву,  если нет, то пишем об ошибке и увеличиваем количество ошибок
                    на 1 */
                    if (letterInTheWord >= 0) {
                        letters.add(answerChar);
                        for (int i = 0; i < wordInLetters.size(); i++) {
                            if (answerChar == wordInLetters.get(i)) {
                                chars[i] = answerChar;
                            }
                        }
                        for (char y : chars) {
                            System.out.print(y);
                        }
                        System.out.println();
                    } else {
                        System.out.println("Такой буквы в загаданном слове нет.");
                        errorCounter++;
                        System.out.println("Количество ошибок: " + errorCounter);
                    }

                    DrawTheGallows.drawHangman(errorCounter);
                    System.out.println("На данный момент вы отгадали: ");
                    for (char y : chars) {
                        System.out.print(y);
                    }
                    System.out.println();

                    String guessedWord = new String(chars);
                    if (errorCounter == 6) {
                        System.out.println("Вы проиграли");
                        System.out.println();
                        break;
                    } else if (!guessedWord.contains("*")) {
                        successfulAttempts++;
                        System.out.println("Поздравляем! Вы выиграли " + successfulAttempts + " раз");
                        break;
                    }
                }
            } else {
                System.out.println("Конец игры.");
                break;
            }
        }
    }
}

