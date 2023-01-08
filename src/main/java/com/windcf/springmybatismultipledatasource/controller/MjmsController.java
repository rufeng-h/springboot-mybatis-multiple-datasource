package com.windcf.springmybatismultipledatasource.controller;

import com.windcf.springmybatismultipledatasource.model.mjms.HrCandidate;
import com.windcf.springmybatismultipledatasource.service.mjms.HrCandidateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chunf
 */
@RestController
public class MjmsController {
    private final HrCandidateService hrCandidateService;

    public MjmsController(HrCandidateService hrCandidateService) {
        this.hrCandidateService = hrCandidateService;
    }

    @GetMapping("/cand/{candId}")
    public HrCandidate getCandidate(@PathVariable Long candId) {
        return hrCandidateService.getCandidate(candId);
    }
}
