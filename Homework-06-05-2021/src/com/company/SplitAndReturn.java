package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitAndReturn {

    public static void main(String[] args) {

        System.out.println("Enter String: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String uniqueText = splitRemoveDuplicateAndReturn(text);
        System.out.println(uniqueText);

    }

    public static String splitRemoveDuplicateAndReturn(String text) {

        String[] words = text.split("[\\s,.!?]+");
        String[] uniqueWords = removeDuplicateStrings(words);

        for (int i = 0; i < uniqueWords.length - 1; i++) {
            uniqueWords[i] += ",";
        }

        return stringArrayToString(uniqueWords);
    }

    public static String[] removeDuplicateStrings(String[] stringArray) {

        ArrayList<String> uniqueStringArrayList = new ArrayList<>();
        OUTER:
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i].equals(stringArray[j])) {
                    continue OUTER;
                }
            }
            uniqueStringArrayList.add(stringArray[i]);
        }

        return uniqueStringArrayList.toArray(new String[0]);
    }

    public static String stringArrayToString(String[] strings) {
        String string = new String();
        for (int i = 0; i < strings.length; i++) {
            string += strings[i];
        }
        return string;
    }


}
