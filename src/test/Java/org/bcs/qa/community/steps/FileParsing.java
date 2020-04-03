package org.bcs.qa.community.steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileParsing {
    public static void ParseFile(String input, String output, String myLine) throws IOException {
        try (PrintWriter writer = new PrintWriter(output);
             Scanner scanner = new Scanner(new FileInputStream(input))) {
            int myLineCount = 0;
            int allLinesCount = 0;
            int wordsCount = 0;
            int spacesCount = 0;

            String fullReversText = "";
            while (scanner.hasNextLine()) {

                String newLine = scanner.nextLine();

                if (fullReversText.isEmpty()) {
                    fullReversText = new StringBuffer(newLine).reverse().toString();
                } else {
                    fullReversText = new StringBuffer(newLine).reverse().toString() + System.lineSeparator() + fullReversText;
                }

                String[] linesArray = newLine.split(" ");

                for (int i = 0; i < linesArray.length; ++i) {
                    if (!linesArray[i].isEmpty()) {
                        ++wordsCount;
                    }
                }

                int myLineIndex = 0;
                for (; ; ) {
                    if (newLine.toLowerCase().indexOf(myLine.toLowerCase(), myLineIndex) == -1) {
                        break;
                    }
                    myLineIndex = newLine.toLowerCase().indexOf(myLine.toLowerCase(), myLineIndex) + 1;

                    ++myLineCount;
                }

                int spaceIndex = 0;
                for (; ; ) {
                    if (newLine.indexOf(" ", spaceIndex) == -1) {
                        break;
                    }
                    spaceIndex = newLine.indexOf(" ", spaceIndex) + 1;

                    ++spacesCount;
                }

                ++allLinesCount;
            }
            writer.println("1.Количество вхождений заданной строки = " + myLineCount);
            writer.println("2.Количество всех строк строки = " + allLinesCount);
            writer.println("Количество всех слов = " + wordsCount);
            writer.println("Количество всех пробелов = " + spacesCount);
            writer.print("3.Текст в обратном порядке" + System.lineSeparator() + fullReversText);
        }
    }
}
