package com.qf.response;

import com.qf.pojo.Items;
import lombok.Data;

import java.util.List;

@Data
public class ItemsResponse {
    private List<Items> list;
    private Integer page;
    private Long total;
}
