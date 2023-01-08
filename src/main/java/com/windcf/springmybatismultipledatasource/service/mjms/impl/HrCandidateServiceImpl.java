package com.windcf.springmybatismultipledatasource.service.mjms.impl;

import com.windcf.springmybatismultipledatasource.config.MjmsDataSourceConfig;
import com.windcf.springmybatismultipledatasource.mapper.mjms.HrCandidateMapper;
import com.windcf.springmybatismultipledatasource.model.mjms.HrCandidate;
import com.windcf.springmybatismultipledatasource.service.mjms.HrCandidateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : chunf
 */
@Service
public class HrCandidateServiceImpl implements HrCandidateService {
    private final HrCandidateMapper hrCandidateMapper;

    public HrCandidateServiceImpl(HrCandidateMapper hrCandidateMapper) {
        this.hrCandidateMapper = hrCandidateMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = MjmsDataSourceConfig.TRANSACTION_MANAGER)
    public HrCandidate getCandidate(long candId) {
        return hrCandidateMapper.selectByPrimaryKey(candId);
    }
}
