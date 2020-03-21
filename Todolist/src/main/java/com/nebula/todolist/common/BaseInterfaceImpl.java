package com.nebula.todolist.common;

import java.util.Date;

public abstract class BaseInterfaceImpl<Entity extends CommonEntity> {

    public abstract BaseMapper<Entity> getMapper();

    public Integer create(Entity entity) throws Exception {
        try {
            entity.setCreateTime(new Date());
            getMapper().create(entity);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return entity.getId();
    }

}
