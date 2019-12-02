package com.qf.service.impl;

import com.qf.dao.ItemsDao;
import com.qf.pojo.Items;
import com.qf.response.ItemsResponse;
import com.qf.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public ItemsResponse findAll(Integer size, Integer page) {

        if(page<0){
            page=0;
        }else{
            page=page-1;
        }
        Pageable p = PageRequest.of(page, size);
        Page<Items> all = itemsDao.findAll(p);
        List<Items> content = all.getContent();

        ItemsResponse itemsResponse=new ItemsResponse();
        itemsResponse.setList(content);
        itemsResponse.setTotal(all.getTotalElements());
        itemsResponse.setPage(all.getTotalPages());
        return itemsResponse;
    }
/*
修改
 */
    @Override
    public Items findOne(Integer id) {
        Optional<Items> byId = itemsDao.findById(id);
       if(byId!=null) {
           Items items = byId.get();
           return items;
       }else{
           return null;
       }

    }
    @Override
    public Items updateItems(Items items) {
        Items save = itemsDao.save(items);
        return save;
    }
    /*

    删除
     */

    @Override
    public Items deleteOne(Items items) {
        return itemsDao.save(items);
    }
/*
新增
 */
    @Override
    public Items save(Items items) {
        return itemsDao.save(items);
    }
}
