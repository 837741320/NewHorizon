package com.qfedu.newhorizon.mapper.news;

import com.qfedu.newhorizon.common.result.PageVo;
import com.qfedu.newhorizon.domain.news.New;
import com.qfedu.newhorizon.domain.news.NewESVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewMapper {


    List<New> selectByType(Integer type);

    PageVo selectByPage(@Param("page")Integer page,@Param("limit")Integer limit,@Param("type")Integer type);

    New selectById(Integer nid);

    New selectNewDetail(Integer nid);
    ////查询十条点击量最高的新闻
    //List<NewESVO> selectByHotTen();

}