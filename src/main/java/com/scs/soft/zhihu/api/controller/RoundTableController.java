package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @ClassName RoundTableController
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/17
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/roundTable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getRecent() {return Result.success(roundTableService.selectRecent());  }

    @GetMapping(value = "/all")
    public  Result getAllRoundTable(){
        return Result.success(roundTableService.selectAllRoundTable());
    }
}