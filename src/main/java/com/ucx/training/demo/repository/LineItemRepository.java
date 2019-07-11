package com.ucx.training.demo.repository;

import com.ucx.training.demo.entity.LineItem;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemRepository extends BaseRepository<LineItem,Integer> {
}
