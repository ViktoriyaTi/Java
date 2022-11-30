
/*Распарсить файл с логами из заданий, выполненных на семинаре,найти записи уровня INFO*/

import java.util.ArrayList;
import java.io.*;

public class TaskOne {
    public static void main(String[] args) throws IOException {

        OutputFile(readFile());
    }

    public static ArrayList<String> readFile() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("LogFile.txt"));
        ArrayList<String> newArrayList = new ArrayList<>();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            if (str.contains("INFO")) {
                newArrayList.add(str);
            }
        }
        bufferedReader.close();
        return newArrayList;
    }

    public static void OutputFile(ArrayList<String> Array) {
        System.out.println(Array);

    }
}