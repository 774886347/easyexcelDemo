package com.wings.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.wings.easyexcel.model.ImportModel;
import com.wings.easyexcel.serviceImpl.ExcelImportServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板的读取类
 *
 * @author Jiaju Zhuang
 */

public class IndexOrNameDataListener extends AnalysisEventListener<ImportModel> {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexOrNameDataListener.class);

    private ExcelImportServiceImpl excelImportService = new ExcelImportServiceImpl();

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 3000;
    private List<ImportModel> list = new ArrayList<ImportModel>();

    @Override
    public void invoke(ImportModel data, AnalysisContext context) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        excelImportService.saveBatch(list);
        LOGGER.info("存储数据库成功！");
    }
}