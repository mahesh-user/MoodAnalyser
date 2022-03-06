package com.bridgelabz;

public class MoodAnalyser {

    String message;



    public MoodAnalyser(){

    }



    public MoodAnalyser(String message){
        this.message = message;
    }



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
