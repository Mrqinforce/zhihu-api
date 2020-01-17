package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


/**
 * @ClassName RoundTableMapper
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/17
 * @Version 1.0
 **/
public interface RoundTableMapper {
    /**
     * 查询最新圆桌
     *
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY include_count DESC LIMIT 0,4")
    List<RoundTable> selectRecent();
    /**
     * 查询所有圆桌
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_round_table")
    @Results({
            @Result(id = true,property = "roundTableId", column = "id",javaType = String.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "UrlToken",column = "UrlToken",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "visitsCount",column = "visitsCount",javaType = Integer.class),
            @Result(property = "includeCount",column = "includeCount",javaType = Integer.class),
    })
    List<Map> selectAllRoundTable();
}
