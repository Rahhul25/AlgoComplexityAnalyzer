package com.complexity.analyzer.service;

import com.complexity.analyzer.model.AnalysisResult;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AnalyzerService {

    public AnalysisResult analyzeCode(String code) {
        int loopCount = StringUtils.countOccurrencesOf(code, "for") +
                        StringUtils.countOccurrencesOf(code, "while");
        int recursiveCount = StringUtils.countOccurrencesOf(code, "return");

        String timeComplexity;
        if (loopCount >= 2) timeComplexity = "O(n^2)";
        else if (loopCount == 1) timeComplexity = "O(n)";
        else if (recursiveCount > 0) timeComplexity = "O(2^n)";
        else timeComplexity = "O(1)";

        return new AnalysisResult(timeComplexity, "Space analysis not implemented");
    }
}
