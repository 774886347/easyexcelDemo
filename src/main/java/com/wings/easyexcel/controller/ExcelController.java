package com.wings.easyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.wings.easyexcel.listener.IndexOrNameDataListener;
import com.wings.easyexcel.model.ImportModel;
import com.wings.easyexcel.utils.TestFileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/easyExcel")
public class ExcelController {
    @RequestMapping("/import")
    public String importData(){
        String fileName = TestFileUtil.getPath() + "demo" + File.separator + "construct.xlsx";
        EasyExcel.read(fileName, ImportModel.class, new IndexOrNameDataListener()).sheet().doRead();
        return "success";
    }

}
