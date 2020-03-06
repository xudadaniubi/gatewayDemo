package com.xu.controller;

import com.xu.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2020/3/6.
 */
@RestController
public class FallbackController {

    @RequestMapping("/defaultfallback")
    public ResultUtils test()throws Exception{
        return ResultUtils.build(500,"连接超时");
    }
}
