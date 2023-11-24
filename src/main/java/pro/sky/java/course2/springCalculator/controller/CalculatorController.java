package pro.sky.java.course2.springCalculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.springCalculator.service.CalculatorService;
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService numberService = new CalculatorService();
    @GetMapping()
    public String greeting() {
        return numberService.greeting();
    }
    @GetMapping(path = "plus")
    public String plusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
         return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
         return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}