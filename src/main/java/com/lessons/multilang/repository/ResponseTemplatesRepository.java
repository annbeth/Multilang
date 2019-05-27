package com.lessons.multilang.repository;

import com.lessons.multilang.models.ResponseTemplatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResponseTemplatesRepository extends JpaRepository<ResponseTemplatesEntity,Long> {

      Optional<ResponseTemplatesEntity> findByStatusCodeIdAndLanguageIdAAndChannelId(int statCodeID, int langId, int channelId);
}


