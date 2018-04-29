import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNauka {
    public static void main(String [] args){
        //Pobieram config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pobieram bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //
        context.close();
    }
}
