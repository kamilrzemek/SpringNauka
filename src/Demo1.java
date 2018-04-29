import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pobieram bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
