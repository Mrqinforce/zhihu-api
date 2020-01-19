package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Column;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ColumnMapperTest
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnMapperTest {
    @Resource
    private ColumnMapper columnMapper;
    @Test
    void selectHot() {
        List<Column> columns = columnMapper.selectHot();
        columns.forEach(System.out::println);
    }

    @Test
    void selectAllColumn() {
        List<Map> column = columnMapper.selectAllColumn();
        column.forEach(System.out::println);
    }
}
