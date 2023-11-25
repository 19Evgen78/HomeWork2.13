package pro.sky.java.course2.spring_calculator.service;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.spring_calculator.exceptions.ZeroDividerException;

@Service
public class CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }
    public Integer plus(int num1, int num2) {
        return num1 + num2;
    }
    public Integer minus(int num1, int num2) {
        return num1 - num2;
    }
    public Integer multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(int num1, int num2) throws ZeroDividerException {
        if (num2 == 0) {
            throw new ZeroDividerException("Ошибка! Делить на ноль нельзя.");
        }
        return num1 / num2;
    }
}