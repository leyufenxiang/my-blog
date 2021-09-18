/**
 * StaticCDN
 *
 * @author lcry
 * @date 2021/3/7
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //Discovery服务发现
public class StaticCDN {
    public static void main(String[] args) {
        SpringApplication.run(StaticCDN.class, args);
    }
}
