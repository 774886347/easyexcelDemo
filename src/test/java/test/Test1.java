package test;

import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.wings.easyexcel.model.ImportModel;
import org.junit.Test;


public class Test1 {

    @Test
    public void testTableInfoHelper() {
        TableInfo tableInfo = TableInfoHelper.getTableInfo(ImportModel.class);
        System.out.println(tableInfo);
    }


}
