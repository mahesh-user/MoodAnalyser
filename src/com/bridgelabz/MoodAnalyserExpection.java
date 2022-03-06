package com.bridgelabz;

public class MoodAnalyserExpection {
    public static class MoodAnalyserException extends Throwable {
        public MoodAnalyserException(String str) {
            super(str);
        }
    }
}