package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @ClassName ColumnController
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "api/column")
public class ColumnController {
    @Resource
    private ColumnService columnService;

    @GetMapping
    public Result getHot(){
        return Result.success(columnService.selectHot());
    }

    @GetMapping(value = "/all")
    public Result getAllColumn(){
        return Result.success(columnService.selectAllColumn());
    }
    @PostMapping(value = "page")
    public Result getByPage(int currentPage,int count){
        return Result.success(columnService.selectColumnsByPage(currentPage,count));
    }
}