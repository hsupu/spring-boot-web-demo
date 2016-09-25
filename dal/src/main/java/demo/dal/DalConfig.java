package demo.dal;

import demo.common.Config;
import demo.dal.config.AspectConfig;
import demo.dal.config.MyBatisConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Config.class, AspectConfig.class, MyBatisConfig.class})
@ComponentScan(basePackages = {"demo.dal.dao"})
public class DalConfig {
}
