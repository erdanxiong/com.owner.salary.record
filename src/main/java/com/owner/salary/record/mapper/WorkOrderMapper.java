package com.owner.salary.record.mapper;

import com.owner.salary.record.model.WorkOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(WorkOrder record);

    int insertSelective(WorkOrder record);

    WorkOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(WorkOrder record);

    int updateByPrimaryKey(WorkOrder record);

}