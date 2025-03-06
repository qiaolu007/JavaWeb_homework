package com.itheima.dao.iml;

import cn.hutool.core.io.IoUtil;
import com.itheima.dao.LogDao;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.ArrayList;

@Repository
public class LogDaoIml implements LogDao {
    @Override
    public ArrayList<String> getLog() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("log.txt");
        ArrayList<String> lines = IoUtil.readUtf8Lines(inputStream, new ArrayList<String>());
        return lines;
    }
}
