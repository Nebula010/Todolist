package com.nebula.todolist.common;

import java.util.List;
import java.util.Map;

public interface BaseMapper<Entity> {

    void create(Entity entity);

    void update(Entity entity);

    void deleteById(Integer id);

    Entity findById(Integer id);

    List<Entity> getAll();

    List<Entity> findByMap(Map<String, Object> map);

    Integer getCount(Map<String, Object> map);

    List<Entity> findByPage(Map<String, Object> map);
}
