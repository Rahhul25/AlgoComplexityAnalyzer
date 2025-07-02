package com.complexity.analyzer.model;

public class AnalysisResult {
    private String timeComplexity;
    private String spaceComplexity;

    public AnalysisResult(String timeComplexity, String spaceComplexity) {
        this.timeComplexity = timeComplexity;
        this.spaceComplexity = spaceComplexity;
    }

    public String getTimeComplexity() {
        return timeComplexity;
    }

    public void setTimeComplexity(String timeComplexity) {
        this.timeComplexity = timeComplexity;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }

    public void setSpaceComplexity(String spaceComplexity) {
        this.spaceComplexity = spaceComplexity;
    }
}
