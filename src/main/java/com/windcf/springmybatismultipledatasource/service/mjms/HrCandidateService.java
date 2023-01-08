package com.windcf.springmybatismultipledatasource.service.mjms;

import com.windcf.springmybatismultipledatasource.model.mjms.HrCandidate;

/**
 * @author : chunf
 */
public interface HrCandidateService {
    /**
     * get by id
     * @param candId the id
     * @return cand
     */
    HrCandidate getCandidate(long candId);
}
