package OOP.InterfacesAndAbstraction.Excersise.Telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        //NO DIGITS
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (hasDigits(url)) {
                sb.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sb.append(String.format("Browsing: %s!%n", url));
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder calls = new StringBuilder();

        for (String number : numbers) {
            if (number.matches("[0-9]+")){
                calls.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                calls.append("Invalid number!").append(System.lineSeparator());
            }
        }

        return calls.toString().trim();
    }

    private boolean hasDigits(String url) {
        for (char singleChar : url.toCharArray()) {
            if (Character.isDigit(singleChar)) {
                return true;
            }
        }
        return false;
    }




}
