package com.it.dao;



import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 电影名字
     */
    private String username;

    /**
     * 图片
     */
    private String imgs;

    /**
     * 年代
     */
    private String era;

    /**
     * 产地
     */
    private String place;

    /**
     * 电影语言
     */
    private String language;

    /**
     * 上映时间
     */
    private Date releaseDate;

    /**
     * 片长
     */
    private String min;

    /**
     * 导演
     */
    private String director;

    /**
     * 简介
     */
    private String brief;

    /**
     * 磁力连接
     */
    private String link;


}
