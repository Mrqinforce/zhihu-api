package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Column;
import java.util.List;
import java.util.Map;
/**
 * @ClassName ColumnService
 * @Description TODO
 * @Author qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
public interface ColumnService {
    /**
     * 查询所有专栏
     *
     * @return List<Map>
     */
    List<Map> selectAllColumn();

    /**
     * 查询最受欢迎专栏
     *
     * @return List<Column>
     */
    List<Column> selectHot();
    /**
     *
     * @param currentPage
     * @param count
     * @return
     */
    List<Column> selectColumnsByPage(int currentPage, int count);
}