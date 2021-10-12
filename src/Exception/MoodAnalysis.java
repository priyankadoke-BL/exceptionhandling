package Exception;

public class MoodAnalysis {
    private String mood;

    public MoodAnalysis(String mood) {
        this.mood = mood;
    }
    public MoodAnalysis() {

    }

    public String analyseMood(){
        if(mood.equals("I am in sad Mood")){
            return "SAD";

        }
        else{
            return "HAPPY";
        }

    }

}
