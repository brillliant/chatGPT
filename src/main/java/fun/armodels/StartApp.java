package fun.armodels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}


//@EnableAsync
//@EnableSseEventBus
/*@SpringBootApplication(scanBasePackageClasses = {
        TomcatConfig.class,
        AiDataServicesIntegrationConfigContainer.class,
        CustomTokenGranter.class,
        UserController.class,
        UserDataGateway.class,
        CustomerServiceImpl.class,
        AwsSecretComp.class
}
        //,exclude = ElasticsearchAutoConfiguration.class
)
public class BackendApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BackendApplication.class);
        springApplication.addListeners(new AwsSecretComp());
        springApplication.run(args);
    }
}*/
