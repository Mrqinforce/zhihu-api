package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Column;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
/**
 * @ClassName ColumnMapper
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
public interface ColumnMapper {
    /**
     * 查询热门专栏
     *
     * @return List<Column>
     */
    @Select("SELECT * FROM t_columns ORDER BY followers DESC LIMIT 0,4")
    List<Column> selectHot();
    /**
     * 查询所有专栏
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_columns")
    @Results({
            @Result(id = true,property = "columnId",column = "id",javaType = String.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class),
    })
    List<Map> selectAllColumn();
}
