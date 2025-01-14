package com.yc.api;

import com.yc.common.core.base.constant.ApplicationConst;
import com.yc.common.core.base.result.ResultBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: youcong
 * @time: 2021/10/4 9:28
 */
@FeignClient(contextId = "cnBlogsApi",name = ApplicationConst.PLUGINS)
public interface CnBlogsApi {
    @PostMapping("/cnblogs/getToken")
    ResultBody getToken();

    @PostMapping("/cnblogs/getPersonalBlogInfo")
    ResultBody getPersonalBlogInfo(@RequestParam("username") String username);

    @PostMapping("/cnblogs/getPersonalBlogPostList")
    ResultBody getPersonalBlogPostList(@RequestParam("userName") String userName, @RequestParam("pageIndex") Integer pageIndex);

    @PostMapping("/cnblogs/getEssenceAreaPostList")
    ResultBody getEssenceAreaPostList(@RequestParam("pageIndex") String pageIndex,@RequestParam("pageSize") String pageSize);

    @PostMapping("/cnblogs/getSiteHomePostList")
    ResultBody getSiteHomePostList(@RequestParam("pageIndex") String pageIndex,@RequestParam("pageSize") String pageSize);
}
