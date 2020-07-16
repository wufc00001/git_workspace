package com.chngc.personScore;



import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.chngc.personScore.dao")
@EnableSwagger2
@Slf4j
public class PersonScoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonScoreApplication.class, args);
        log.info("PersonScoreApplication 服务已启动");
    }

}
