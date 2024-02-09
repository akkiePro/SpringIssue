package com.test.IssueWithName.controller;

import com.test.IssueWithName.model.TestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public TestModel responseNamingIssue() {
        return new TestModel(1, "testingNameIssues");
    }

}
