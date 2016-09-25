package demo.bal;

import demo.dal.DalConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DalConfig.class})
@ComponentScan(basePackages = {"demo.bal.service"})
public class BalConfig {

    // 第三方服务

}
