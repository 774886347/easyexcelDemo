package com.wings.easyexcel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wings.easyexcel.model.ImportModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExcelMapper extends BaseMapper<ImportModel> {
}
