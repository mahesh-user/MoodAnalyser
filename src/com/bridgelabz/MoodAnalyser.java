package com.bridgelabz;
//purpose:This class is to analyse the mood of the user by using expetions

//auther:mahesh

public class MoodAnalyser {

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
     * this method is to analyse the mood by using expetions
     * @return sad or happy
     */


    public String analyseMood() {

        try {
            if (message == "")
                throw new NullPointerException("Null mood");
            if (message.contains("Sad")) {
                return "Sad";
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }
        return "Happy";
    }
}
