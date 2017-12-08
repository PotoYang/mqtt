import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 服务启动类
 */
@Configuration
@ImportResource("classpath:spring.xml")
public class Runner {

    private static final Logger log = LoggerFactory.getLogger(Runner.class);

    private static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        log.info("Mina Server开始加载...");
        applicationContext = SpringApplication.run(Runner.class, args);

        log.info("Spring注入完毕");

        log.info("开始启动服务...");


    }
}
