// java/com/test_automation/calculator/CalculatorController.java

package com.test_automation.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calculator.sum(a, b);
    }

    @RequestMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calculator.sub(a, b);
    }

    @RequestMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return calculator.mul(a, b);
    }

    @RequestMapping("/div")
    public int div(@RequestParam int a, @RequestParam int b) {
        return calculator.div(a, b);
    }
}
