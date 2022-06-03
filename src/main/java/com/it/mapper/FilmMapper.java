package com.it.mapper;


import com.it.dao.Film;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
@Mapper
public interface FilmMapper  {
        //获取所有电影数据
        List<Film> selectFil();


}
