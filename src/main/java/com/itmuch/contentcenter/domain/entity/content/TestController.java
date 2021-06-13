package com.itmuch.contentcenter.domain.entity.content;

import com.itmuch.contentcenter.dao.content.ShareMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.itmuch.contentcenter.domain.entity.content
 * @date 2021/6/13 15:31
 */

@RestController
public class TestController {

    @Resource
    private ShareMapper shareMapper;

    @GetMapping(value = "/test")
    public Share testInsert() {
        Share share = new Share();
        share.setTitle("这是标题");
        share.setCreateTime(new Date());
        share.setUpdateTime(new Date());
        share.setReason("测试原因");
        shareMapper.insertSelective(share);
        List<Share> shares = shareMapper.selectAll();
        shares.toString();
        return share;

    }
}