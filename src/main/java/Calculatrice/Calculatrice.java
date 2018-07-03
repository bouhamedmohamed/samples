package Calculatrice;

public class Calculatrice {

    public double calculate(String formule) {
        String[] split = formule.split(" ");

        String operator = split[1];
        int firstOperand = toInt(split[0]);
        int secondOperand = toInt(split[2]);
       return Operators.calculate(operator,firstOperand,secondOperand);

    }

    private int toInt(String StringNumber) {
        return Integer.parseInt(StringNumber);
    }
}
