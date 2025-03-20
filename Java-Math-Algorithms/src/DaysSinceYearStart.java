import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysSinceYearStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        LocalDate today = LocalDate.of(LocalDate.now().getYear(), month, day);
        LocalDate startOfYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);

        long days = ChronoUnit.DAYS.between(startOfYear, today);

        System.out.println("Days since the beginning of the year: " + days);

        scanner.close();
    }
}
