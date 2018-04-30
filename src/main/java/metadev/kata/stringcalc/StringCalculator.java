package metadev.kata.stringcalc;

public class StringCalculator {
    public int calculate(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        char customDelimiter = getCustomDelimiter(text.split("\n")[0]);

        String[] chuncks = (customDelimiter == ',') ? 
                                text.split(",|\n") : text.split("\n|" + customDelimiter);
        int total = 0;
        int skipFirstLines = (customDelimiter == ',') ? 0 : 2;
        for (String item : chuncks) {
            if (skipFirstLines > 0) {
                --skipFirstLines;
            } else {
                int num = Integer.parseInt(item);
                total += num;
            }
        }
        return total;
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private char getCustomDelimiter(String line) {
        if (line == null || line.isEmpty()) {
            return ',';
        }
        if (isNumeric(line)) {
            return ',';
        }
        if (line.length() == 1) {
            return line.charAt(0);
        }
        return ',';
    }
}
