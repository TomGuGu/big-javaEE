package com.fruit.entity;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Contract {

  private String contractId;

  private String barCode;

  private Retailer retailer;

  private List<CommoditiesVo> commoditiesList;

  private int type;

  private String createTime;

}
