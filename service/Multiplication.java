package service;

import java.util.logging.Logger;

import model.FirstNamber;
import model.SecondNumber;

public class Multiplication implements ExampleImpl {
    Logger logger = Logger.getAnonymousLogger();

    @Override
    public void exampl(FirstNamber firstNamber, SecondNumber secondNumber) {
        logger.info(String.valueOf("Input firstNamber " + "(" + firstNamber.getNamberX() + ")" + " + " + "("
                + firstNamber.getNamberY() + ")"));
        logger.info(String.valueOf("Input secondNamber " + "(" + secondNumber.getNamberX() + ")" + " + " + "("
                + secondNumber.getNamberY() + ")"));
        logger.info("Начал считать умножение");
        String markFirst;
        String markSecond;
        if (firstNamber.getNamberY() >= 0) {
            markFirst = "+";
        } else {
            markFirst = "";
        }
        if (secondNumber.getNamberY() >= 0) {
            markSecond = "+";
        } else {
            markSecond = "";
        }
        if (((firstNamber.getNamberX() * secondNumber.getNamberY())
                + (firstNamber.getNamberY() * secondNumber.getNamberX())) >= 0) {

            System.out.println("(" + firstNamber.getNamberX() +
                    markFirst +
                    firstNamber.getNamberY() + "i" + ")" +
                    "*" +
                    "(" + secondNumber.getNamberX() +
                    markSecond +
                    secondNumber.getNamberY() + "i" + ")" +
                    " = " +
                    "("
                    + ((firstNamber.getNamberX() * secondNumber.getNamberX())
                            - (firstNamber.getNamberY() * secondNumber.getNamberY()))
                    +
                    "+" +
                    ((firstNamber.getNamberX() * secondNumber.getNamberY())
                            + (firstNamber.getNamberY() * secondNumber.getNamberX()))
                    + "i" + ")");
        } else {
            System.out.println("(" + firstNamber.getNamberX() +
                    markFirst +
                    firstNamber.getNamberY() + "i" + ")" +
                    "*" +
                    "(" + secondNumber.getNamberX() +
                    markSecond +
                    secondNumber.getNamberY() + "i" + ")" +
                    " = " +
                    "("
                    + ((firstNamber.getNamberX() * secondNumber.getNamberX())
                            - (firstNamber.getNamberY() * secondNumber.getNamberY()))
                    +
                    ((firstNamber.getNamberX() * secondNumber.getNamberY())
                            + (firstNamber.getNamberY() * secondNumber.getNamberX()))
                    + "i" + ")");
        }
        logger.info("Я посчитал я молодец");

    }

}
