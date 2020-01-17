package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
/**
 * @ClassName $(Name)
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/17
 * @Version 1.0
 **/
public class RoundTableMapperTest {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Test
    void selectRecent() {
        List<RoundTable> roundTables = roundTableMapper.selectRecent();
        roundTables.forEach(System.out::println);
    }

    @Test
    void selectAllRoundTable() {
        List<Map> roundTables = roundTableMapper.selectAllRoundTable();
        roundTables.forEach(System.out::println);
    }
}
