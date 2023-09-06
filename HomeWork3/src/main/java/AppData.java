import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AppData {
    private final int dataStrCount = 6;
    private String firstName;
    private String lastName;
    private String surname;
    private long phoneNumber;
    private String dateOfBirth;
    private String sex;
    private String[] checkStrCount() throws LowStrCountException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Ф И О дата рождения (dd.mm.yyyy) номер телефона (8...), пол (m/f)");
        String[] res = scanner.nextLine().split(" ");
        if (res.length != dataStrCount) {
            throw new LowStrCountException(String.format("Вы ввели только %d из %d необходимых данных", res.length, dataStrCount));
            }
        return res;
    }

    public boolean parseData() throws LowStrCountException, ErrorInputException {
        String[] current = checkStrCount();
        firstName = current[0];
        lastName = current[1];
        surname = current[2];
        try {
            dateOfBirth = LocalDate.parse(current[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")).toString();
        } catch (DateTimeParseException e) {
            throw new ErrorInputException("Wrong data format (dd.mm.yyyy)" + current[3]);
        }
        try {
            phoneNumber = Long.parseLong(current[4]);
        } catch (NumberFormatException e) {
            throw new ErrorInputException("Phone number is undefined " + current[4]);
        }
        if (current[5].equals("f") || current[5].equals("m")) {
            sex = String.valueOf(current[5].charAt(0));
        } else {
            throw new ErrorInputException("Wrong gender format choice m (male) or f (female)" + current[5]);
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ");
        sb.append(lastName).append(" ");
        sb.append(surname).append(" ");
        sb.append(dateOfBirth).append(" ");
        sb.append(phoneNumber).append(" ");
        sb.append(sex).append(" ");;
        return sb.toString();
    }
    public String getFirstName() {
        return firstName;
    }
}

