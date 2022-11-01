package com.example.myfit;

enum FitnessType {
    Run, Walk, Bicycle
}

public class FitnessData {
    String date;            // When
    FitnessType type;       // What type? Run, Walk, Bicycle
    int min;                // How long?

    public FitnessData(String date, FitnessType type, int min) {
        this.date = date;
        this.type = type;
        this.min = min;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public FitnessType getType() {
        return type;
    }

    public void setType(FitnessType type) {
        this.type = type;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
