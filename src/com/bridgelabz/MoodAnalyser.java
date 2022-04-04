package com.bridgelabz;
//purpose:This class is to analyse the mood of the user

//auther:mahesh
public class MoodAnalyser {

    public String analyseMood(String str) {
        /**
         * this method is to analyse the mood
         * @param str
         */
        if (str.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}
