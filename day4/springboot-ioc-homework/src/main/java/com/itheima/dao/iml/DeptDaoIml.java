package com.itheima.dao.iml;

import cn.hutool.core.io.IoUtil;
import com.itheima.dao.DeptDao;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptDaoIml implements DeptDao {

    @Override
    public List<String> findAll() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> lines = IoUtil.readUtf8Lines(in, new ArrayList<String>());
        return lines;
    }
}
