package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName RoundTable
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/17
 * @Version 1.0
 **/
@Data
@Builder
public class RoundTable {
    private String roundTableId;
    private String name;
    private String urlToken;
    private String banner;
    private Integer visitsCount;
    private Integer includeCount;

}
