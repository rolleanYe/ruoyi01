package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.JobsPerformance;
import com.ruoyi.system.mapper.JobsPerformanceMapper;
import com.ruoyi.system.service.IJobsPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsPerformanceServiceImpl implements IJobsPerformanceService {

    @Autowired
    private JobsPerformanceMapper jobsPerformanceMapper;

    @Override
    public List<JobsPerformance> selectJobsPerformanceAll() {
        return jobsPerformanceMapper.selectJobsPerformanceAll();
    }
}
