package com.lessons.multilang.repository;

import com.lessons.multilang.models.StatusCodesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StatusCodeRepository extends JpaRepository <StatusCodesEntity, Long>{
    Optional<StatusCodesEntity> findByStatusCode(int statCode);

}


