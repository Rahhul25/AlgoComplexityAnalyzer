package com.complexity.analyzer.controller;

import com.complexity.analyzer.model.AnalysisResult;
import com.complexity.analyzer.service.AnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnalyzerController {

    @Autowired
    private AnalyzerService analyzerService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/analyze")
    public String analyze(@RequestParam("code") String code, Model model) {
        AnalysisResult result = analyzerService.analyzeCode(code);
        model.addAttribute("result", result);
        model.addAttribute("code", code);
        return "index";
    }
}
