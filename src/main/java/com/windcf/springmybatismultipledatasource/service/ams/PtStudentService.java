package com.windcf.springmybatismultipledatasource.service.ams;

import com.windcf.springmybatismultipledatasource.model.ams.PtStudent;

/**
 * @author : chunf
 */
public interface PtStudentService {
    /**
     * get by id
     * @param stuId id
     * @return stu
     */
    PtStudent getStudent(String stuId);
}
