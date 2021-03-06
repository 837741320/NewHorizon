package com.qfedu.newhorizon.service.news;


import com.qfedu.newhorizon.common.result.PageVo;
import com.qfedu.newhorizon.common.result.R;
import com.qfedu.newhorizon.common.result.RO;
import com.qfedu.newhorizon.domain.news.New;
import com.qfedu.newhorizon.domain.newtype.NewType;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 　　　Create   By   Mr.Han
 * 　                 　　　　　------   On   2018/9/18  16:58
 */
public interface NewsService {
    R selectByType(Integer type);

    PageVo selectByPage(@Param("page")Integer page, @Param("limit")Integer limit, @Param("type")Integer type);

    R selectById(Integer nid);

    R selectAll();

    R selectFather();

    R selectNewDetail(Integer nid);

    R myspider();

    RO insertClick(Integer nid);

}
