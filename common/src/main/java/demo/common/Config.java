package demo.common;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class Config {

    public static final class Profile {
        public static final String TEST = "test";
        public static final String DEBUG = "debug";
        public static final String STAGING = "staging";
        public static final String PRODUCTION = "production";

        private Profile() {}
    }

}
