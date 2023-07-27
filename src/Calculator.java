import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        validateDigital(data[0],data[2]);
        validateOperation(data[1]);
        Integer first = Integer.valueOf(data[0]);
        String operation = data[1];
        Integer second = Integer.valueOf(data[2]);

        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
        }
    }

    public static void validateDigital(String first, String second) throws Exception {
        String regex = "([1-9]|10)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(first);
        Matcher matcher2 = pattern.matcher(second);
        if (!matcher1.matches() || !matcher2.matches()) {
            throw new Exception();
        }
    }
    public static void validateOperation(String operation) throws Exception {
        String regex="[+\\-*/]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(operation);
        if(!matcher1.find()){
            throw new Exception();
        }
    }
}
