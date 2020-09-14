package com.wings.easyexcel.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wings.easyexcel.mapper.ExcelMapper;
import com.wings.easyexcel.model.ImportModel;
import com.wings.easyexcel.service.ExcelImportService;
import org.springframework.stereotype.Service;


@Service
public class ExcelImportServiceImpl extends ServiceImpl<ExcelMapper, ImportModel> implements ExcelImportService {
}
