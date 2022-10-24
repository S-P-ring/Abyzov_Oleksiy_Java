package DR4;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class EX4_2 {
    public static void main(String[] args) {
        long[] array = new long[688];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate x =  LocalDate.parse("2022-05-13", formatter);
        int e = 0;
        for (int i = 2022; i < 2422; i++) {
            for (int j = 1; j < 13; j++) {
                LocalDate date = LocalDate.of(i, j, 13);
                DayOfWeek dayOfWeek = date.getDayOfWeek();

                if (dayOfWeek == DayOfWeek.FRIDAY) {
                    Duration duration = Duration.between(x.atStartOfDay(), date.atStartOfDay());
                    x = LocalDate.of(i, j, 13);
                    array[e] = duration.toDays() - 1;
                    e += 1;
                }
            }
        }
        long max = (long)0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальна кількість днів поспіль, у які не буває п'ятниці 13-го: " + max);
    }
}
