package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Favorite
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/1/19
 * @Version 1.0
 **/
@Data
@Builder
public class Favorite {
    private String favoriteId;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteUpCount;
    private Integer commentCount;
}
