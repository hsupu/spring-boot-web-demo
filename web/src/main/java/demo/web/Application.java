package demo.web;

import demo.bal.BalConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(BalConfig.class)
@ComponentScan(basePackages = "demo.web")
public class Application {

    private static final Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        log.info("LOG server on.");

        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }

}
