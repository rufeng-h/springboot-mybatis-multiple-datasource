package com.windcf.springmybatismultipledatasource.service.ams.impl;

import com.windcf.springmybatismultipledatasource.mapper.ams.PtStudentMapper;
import com.windcf.springmybatismultipledatasource.model.ams.PtStudent;
import com.windcf.springmybatismultipledatasource.service.ams.PtStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : chunf
 */
@Service
public class PtStudentServiceImpl implements PtStudentService {
    private final PtStudentMapper ptStudentMapper;

    public PtStudentServiceImpl(PtStudentMapper ptStudentMapper) {
        this.ptStudentMapper = ptStudentMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public PtStudent getStudent(String stuId) {
        return ptStudentMapper.selectByPrimaryKey(stuId);
    }
}
