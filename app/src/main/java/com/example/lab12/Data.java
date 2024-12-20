package com.example.lab12;

public class Data {
    public Result result;

    public static class Result {
        public TrainInfo[] results;
    }

    public static class TrainInfo {
        public String Station;
        public String Destination;
    }
}
