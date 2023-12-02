package pro.sky.java.course2.spring_calculator.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDividerException extends IllegalArgumentException {
    public ZeroDividerException(String s) {
        super("Ошибка! Делить на ноль нельзя.");
    }
}