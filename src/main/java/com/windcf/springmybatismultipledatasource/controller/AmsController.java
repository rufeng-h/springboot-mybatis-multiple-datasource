package com.windcf.springmybatismultipledatasource.controller;

import com.windcf.springmybatismultipledatasource.model.ams.PtStudent;
import com.windcf.springmybatismultipledatasource.service.ams.PtStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chunf
 */
@RestController
public class AmsController {
    private final PtStudentService ptStudentService;

    public AmsController(PtStudentService ptStudentService) {
        this.ptStudentService = ptStudentService;
    }

    @GetMapping("/stu/{stuId}")
    public PtStudent getStudent(@PathVariable String stuId) {
        return ptStudentService.getStudent(stuId);
    }
}
