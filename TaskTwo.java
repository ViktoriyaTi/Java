
/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class TaskTwo {

    Logger logger;

    void initLog() {
        try {
            logger = Logger.getLogger(TaskTwo.class.getName());
            FileHandler fh = new FileHandler("log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter simpleFormat = new SimpleFormatter();
            fh.setFormatter(simpleFormat);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void testMsg() {
        logger.log(Level.INFO, "Итерация выполнена!");
    }

    public static void main(String[] args) throws IOException {

        TaskTwo l = new TaskTwo();
        l.initLog();

        int[] newArray = { 2, 1, 3, 5, 7, 6 };
        int temp = 0;

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }

            }
            l.logger.setLevel(Level.INFO);
            l.testMsg();

        }
        // вывод всего массива на экран,через приведение к строке(можно выводить
        // поэлементно через цикл for)
        System.out.println(Arrays.toString(newArray));

    }

}
