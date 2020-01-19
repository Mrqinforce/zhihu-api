package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Column
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Data
@Builder
public class Column {
    private String columnId;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}