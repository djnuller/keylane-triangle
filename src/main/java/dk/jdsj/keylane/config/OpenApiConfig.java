package dk.jdsj.keylane.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
public class OpenApiConfig {
    @Controller
    class SwaggerWelcome {

        @GetMapping("/")
        public String redirectToUi() {
            return "redirect:/swagger-ui.html";
        }
    }

}
