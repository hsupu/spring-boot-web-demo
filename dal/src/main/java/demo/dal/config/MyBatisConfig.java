package demo.dal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import demo.common.Config;

@Configuration
@Import(Config.class)

@MapperScan(basePackages = "demo.dal.dao.mapper")
public class MyBatisConfig {

}
