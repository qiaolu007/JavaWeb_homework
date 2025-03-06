package com.itheima.controller;

import cn.hutool.core.io.IoUtil;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @RequestMapping("/depts")
    public Result list2(){
        // 调用业务层查询部门数据
        List<Dept> deptList = deptService.getContent();

        // 返回数据
        return Result.success(deptList);
    }

}
