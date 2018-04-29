public class CricketCoach implements Coach {
    private String email;
    private String team;
    //define a private field for the depenedency
    private FortuneService fortuneService;

    //define a constructor for depenedcy injection
    public CricketCoach(){
        System.out.println("Cricket making in process.");
    }
    //Setter methhod
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("We are setting our fortune ;>");
        this.fortuneService = fortuneService;
    }
    public void setEmail(String email){
        this.email = email;
        System.out.println("We are setting our email ;>");

    }
    public void setTeam(String team){
        System.out.println("We are setting our team ;>");
        this.team = team;
    }
    public String getEmail(){
        return email;
    }
    public String getTeam(){
        return team;
    }
    @Override
    public String getDailyWorkout(){
        return "Graj w krykieta.";
    }
    @Override
    public String getDailyFortune(){
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
