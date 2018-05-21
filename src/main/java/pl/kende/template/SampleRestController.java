package pl.kende.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/sample")
public class SampleRestController {

    @GetMapping
    String getSample() {
        return "Sample!";
    }
}
