package demo.dal;

import demo.common.Config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Config.class})
@ComponentScan(basePackages = {"demo.dal.dao"})
public class DalConfig {
}
