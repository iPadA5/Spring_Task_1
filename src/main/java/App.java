import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());
        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println((bean == helloWorldBean) + "\n" + (catBean == catBean1));
    }
}