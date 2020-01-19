package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;
/**
 * @ClassName FavoriteService
 * @Description TODO
 * @Author qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
public interface FavoriteService {
    /**
     * 查询所有收藏
     *
     * @return List<Map>
     */
    List<Map> selectAllFavorite();

    /**
     * 查询被关注最多收藏
     *
     * @return List<Favorite>
     */
    List<Favorite> selectMost();
}