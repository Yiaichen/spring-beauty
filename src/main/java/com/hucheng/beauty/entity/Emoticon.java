package com.hucheng.beauty.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 表情包
 *
 * @author vayi
 * @date 2019/3/28
 * @since 0.0.1
 */
@Data
@Entity
@Table(name = "emoticon")
public class Emoticon {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 图片名称
     */
    private String name;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 类别
     */
    private String type;

    /**
     * 点赞数
     */
    private Integer likeNum;

    /**
     * 收藏数
     */
    private Integer collectNum;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 创建人 (即作者)
     */
    private String author;

}