package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @ClassName FavoriteController
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController{
    @Resource
    private FavoriteService favoriteService;

    @GetMapping
    public  Result getRecent() {return Result.success(favoriteService.selectRecent()); }

    @GetMapping(value = "/all")
    public  Result getAllFavorite(){
        return Result.success(favoriteService.selectAllFavorite());
    }
}
