package com.lessons.multilang.controller;

import com.lessons.multilang.service.MultiLangService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiLangController {
    private final MultiLangService multiLangService;

    public MultiLangController(MultiLangService multiLangService) {
        this.multiLangService = multiLangService;
    }

    @GetMapping("/message/{code}")
    public String multiLangSupportMessage(@RequestHeader("langID") int langID, @RequestHeader("channelID") int channelId,@PathVariable int code){

        StringBuilder redisKeyBuilder = new StringBuilder();
        redisKeyBuilder.append(langID)
                .append(":")
                .append(channelId)
                .append(":")
                .append(code);

        return multiLangService.getTemplate(code, langID,channelId, redisKeyBuilder.toString());
    }
}

