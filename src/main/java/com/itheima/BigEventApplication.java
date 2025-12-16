package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class BigEventApplication
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = SpringApplication.run(BigEventApplication.class, args);

//        // 打印所有Bean，检查是否有UserService相关的Bean
//        System.out.println("=== 检查Spring容器中的Bean ===");
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            if (beanName.toLowerCase().contains("user") ||
//                    beanName.toLowerCase().contains("service")) {
//                System.out.println("Bean: " + beanName);
//            }
//        }
//        System.out.println("=== Bean检查结束 ===");
    }
}
