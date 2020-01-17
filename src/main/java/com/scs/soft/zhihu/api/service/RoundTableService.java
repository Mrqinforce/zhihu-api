package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;
/**
 * @ClassName RoundTableService
 * @Description TODO
 * @Author qin jian
 * @Date 2020/1/17
 * @Version 1.0
 **/
public interface RoundTableService {
    /**
     * 查询所有圆桌
     *
     * @return List<Map>
     */
    List<Map> selectAllRoundTable();

    /**
     * 查询最新圆桌
     *
     * @return List<RoundTable>
     */
    List<RoundTable> selectRecent();
}
