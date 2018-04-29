public class TrackCoach implements Coach{
    //define a private field for the depenedency
    private FortuneService fortuneService;

    //define a constructor for depenedcy injection
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Porzucaj troche do tego kosza stary.";
    }
    @Override
    public String getDailyFortune(){
        //use my fortuneService to get a fortune
        return "Fucking hell, " + fortuneService.getFortune();
    }
}
