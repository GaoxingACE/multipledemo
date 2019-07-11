package  cn.edu.usst.gaoxing;
/*
 *@ClassName ServiceImplApplication
 *@Author GaoXilong
 *@Date 2019/7/10 12:52
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
@MapperScan("cn.edu.usst.gaoxing.dao")
public class ServiceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceImplApplication.class, args);
    }

}