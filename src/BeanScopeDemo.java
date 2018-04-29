import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        //Load the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        //Sprawdzamy czy to sa te same
        boolean result = (theCoach == alphaCoach);
        System.out.println(result);
        System.out.println(theCoach);
        System.out.println(alphaCoach);
    }
}
