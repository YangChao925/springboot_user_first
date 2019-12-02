package com.qf.service;

import com.qf.pojo.Items;
import com.qf.response.ItemsResponse;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ItemsService {

    public ItemsResponse findAll(Integer size, Integer page);

    public Items findOne(Integer id);

    public Items  updateItems(Items items);

    public Items deleteOne(Items items);

    public Items save(Items items);
}
