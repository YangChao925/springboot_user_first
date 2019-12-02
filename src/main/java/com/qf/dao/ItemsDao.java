package com.qf.dao;

import com.qf.pojo.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsDao extends JpaRepository<Items,Integer> {
}
