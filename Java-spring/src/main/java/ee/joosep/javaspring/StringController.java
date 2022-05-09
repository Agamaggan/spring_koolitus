package ee.joosep.javaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // annoteerimine --import
public class StringController {
    @GetMapping("hello") //localhost:8080/hello
    public String getString() {
        return "Hello World!";
    }
    // pathvariable -- urlmuutuja
    @GetMapping("string/{returnString}") //localhost:8080/hello
    public String returnString(@PathVariable String returnString) {
        return returnString;
    }
}
