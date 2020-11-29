package com.ruoyi.web.controller.jobs;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.JobsPerformance;
import com.ruoyi.system.service.IJobsPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs/performance")
public class PerformanceController extends BaseController {

    @Autowired
    private IJobsPerformanceService performanceService;

    @GetMapping("/list")
    public TableDataInfo list()
    {
        startPage();
        List<JobsPerformance> list = performanceService.selectJobsPerformanceAll();
        return getDataTable(list);
    }

}
