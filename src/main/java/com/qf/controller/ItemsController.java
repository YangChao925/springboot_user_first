package com.qf.controller;

import com.qf.pojo.Items;
import com.qf.response.ItemsResponse;
import com.qf.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {

    @Autowired
    private ItemsService itemsService;
/*
全查
 */
    @RequestMapping("/findAll/{size}/{page}")
    public ItemsResponse findAll(@PathVariable("size")Integer size,@PathVariable("page")Integer page){
        ItemsResponse all = itemsService.findAll(size, page);
    System.out.println("这是8082的访问！");
        return all;
    }
    /*
    修改
     */
    @RequestMapping("/findOne")
    public Items findOne(@RequestBody Items items){
        Items one = itemsService.findOne(items.getId());
        return one;
    }
    @RequestMapping("/updateItems")
    public Items updateitems(@RequestBody Items items){
        Items items1 = itemsService.updateItems(items);
        return items1;
    }
    /*
    删除
     */
    @RequestMapping("/deleteOne")
    public Items deleteOne(@RequestBody Items items){
        items.setStatus("2");
        Items items1 = itemsService.deleteOne(items);
        return items1;
    }
    /*
    新增
     */
    @RequestMapping("/save")
    public Items saveOne(@RequestBody Items items){

        Items save = itemsService.save(items);
        return save;
    }


}
