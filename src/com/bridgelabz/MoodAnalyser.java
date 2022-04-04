package com.bridgelabz;
//purpose: This class is to analyse the mood of the user

//Auther:mahesh babu
public class MoodAnalyser {
    enum msg{
        NULL,EMPTY;
    }

    String message;

    /**
     * Default constructor
     */

    public MoodAnalyser(){

    }

    /**Parameterized constructor to assign value for the string message
     *
     * @param message
     */

    public MoodAnalyser(String message){
        this.message = message;
    }

    /**
     * this method is to analyse the mood
     * @return sad or happy
     */

    public String analyseMood() {

        msg m1 = msg.NULL;
        msg m2 = msg.EMPTY;
        try {
            if (message == m1.name())
                throw new NullPointerException("Null mood");
            if (message == m2.name())
                throw new MoodAnalyserExpection.MoodAnalyserException("Empty Mood");
            if (message.contains("Sad")) {
                return "Sad";
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (MoodAnalyserExpection.MoodAnalyserException me){
            System.out.println("me");
        }
        return "Happy";
    }

}
