package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String str) {

        if (str.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}
