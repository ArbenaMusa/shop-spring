package com.ucx.training.demo.repository;

import com.ucx.training.demo.entity.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<T extends BaseModel<U>,U> extends JpaRepository<T, U> {
}
