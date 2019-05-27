package com.lessons.multilang.service;

import com.lessons.multilang.models.ResponseTemplatesEntity;
import com.lessons.multilang.models.StatusCodesEntity;
import com.lessons.multilang.repository.ResponseTemplatesRepository;
import com.lessons.multilang.repository.StatusCodeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MultiLangService {
    Logger logger = LoggerFactory.getLogger(MultiLangService.class);


    final ResponseTemplatesRepository responseTemplatesRepository;
    final StatusCodeRepository statusCodeRepository;

    public MultiLangService(ResponseTemplatesRepository responseTemplatesRepository, StatusCodeRepository statusCodeRepository) {
        this.responseTemplatesRepository = responseTemplatesRepository;
        this.statusCodeRepository = statusCodeRepository;
    }


    @Cacheable(value="responseTemplate", key= "#redisKey")
    public String getTemplate(Integer statCode, Integer langId, Integer channelId,String redisKey) {
        logger.info("Language ID "+langId+ "and Status Code"+statCode);
        Integer statusCodeId = statusCodeRepository.findByStatusCode(statCode).get().getStatusCodeId();
        Optional<ResponseTemplatesEntity> responseTemplatesEntity = responseTemplatesRepository.findByStatusCodeIdAndLanguageIdAAndChannelId(statusCodeId,langId, channelId);
        if(!responseTemplatesEntity.isPresent()){
            logger.error("Response Entity not found in datasource for status code " + statCode+ " and language ID "+langId );
        }
        logger.info("Response Entity found in datasource for Status Code" + statCode+ " and " +langId);
        return responseTemplatesEntity.get().getResponseMessage();
    }

}
