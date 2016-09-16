package demo.dal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"demo.dal.config.profile"})
public class ProfileConfig {

    public static final String DEBUG = "debug";

    public static final String STAGING = "staging";

    public static final String PRODUCTION = "production";

}
