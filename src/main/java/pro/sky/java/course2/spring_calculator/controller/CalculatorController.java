package pro.sky.java.course2.spring_calculator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.spring_calculator.service.CalculatorService;
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String greeting() {
        return calculatorService.greeting();
    }
    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
         return num1 + " + " + num2 + " = " + calculatorService.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
         return num1 + " - " + num2 + " = " + calculatorService.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1,num2);
    }
}