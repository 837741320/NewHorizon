package com.qfedu.newhorizon.controller.search;

import com.qfedu.newhorizon.common.result.RL;
import com.qfedu.newhorizon.service.search.NewsSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 　　　Create   By   Mr.Han
 * 　                 　　　　　------   On   2018/9/20  17:33
 */
@Controller
public class SearchController {

    @Autowired
    private NewsSearchService ss;

    @RequestMapping("/newSearch.do")
    public @ResponseBody RL queryName(String title){
        return RL.creat(1,null,ss.queryByName(title));
    }
}
