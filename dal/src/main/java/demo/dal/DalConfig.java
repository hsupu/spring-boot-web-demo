package demo.dal;

import demo.common.Config;
import demo.common.config.ProfileConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Config.class, ProfileConfig.class})
@ComponentScan(basePackages = {"demo.dal.dao"})
public class DalConfig {
}
