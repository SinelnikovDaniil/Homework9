import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пароль, состоящий из 8 символов (строчные буквы и символы): ");
        String password = input.nextLine();

        if (password.length() != 8) {
            System.out.println("Пароль должен состоять из 8 символов.");
        } else if (!password.matches("[a-z!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+")) {
            System.out.println("Пароль может состоять только из строчных букв и символов.");
        } else {
            System.out.println("Пароль принят.");
        }
    }
}