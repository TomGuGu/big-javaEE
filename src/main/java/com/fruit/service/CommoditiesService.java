package com.fruit.service;

import com.fruit.entity.Commodities;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommoditiesService {

  public Commodities get(Serializable id);

  public List<Commodities> find(Map<String, Object> map);

  public void insert(Commodities commodities);

  public void update(Commodities commodities);

  public void delete(Serializable[] ids);

  public void deleteById(Serializable id);

  public int count(Map<String, Object> map);

}
