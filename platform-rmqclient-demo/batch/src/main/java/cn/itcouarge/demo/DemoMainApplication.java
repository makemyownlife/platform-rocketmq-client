package cn.itcouarge.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMainApplication {

    private final static Logger logger = LoggerFactory.getLogger(DemoMainApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoMainApplication.class);
        application.run(args);
    }

}
