package com.wings.easyexcel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName ImportModel
 * @Description 导入模型
 * @Author wings
 * @Version 1.0.0
 * @Date 2020/9/13 15:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "tb_constructs")
public class ImportModel extends Model<ImportModel> implements Serializable {

    @ExcelProperty(index = 0)
    @TableId("id")
    Integer id;
    @ExcelProperty(index = 1)
    @TableField("operator")
    String operator;
    @TableField("region")
    @ExcelProperty(index = 2)
    String region;
    @TableField("street")
    @ExcelProperty(index = 3)
    String street;
    @TableField("station")
    @ExcelProperty(index = 4)
    String station;
    @TableField("address")
    @ExcelProperty(index = 5)
    String address;
    @TableField("longitude")
    @ExcelProperty(index = 6)
    String longitude;
    @TableField("latitude")
    @ExcelProperty(index = 7)
    String latitude;
    @TableField("linkman")
    @ExcelProperty(index = 8)
    String linkman;
    @TableField("mobile")
    @ExcelProperty(index = 9)
    String mobile;
    @TableField("type")
    @ExcelProperty(index = 10)
    String type;
    @TableField("public_or_private")
    @ExcelProperty(index = 11)
    String publicOrPrivate;
    @TableField("status")
    @ExcelProperty(index = 12)
    String status;
    @TableField("frequency")
    @ExcelProperty(index = 13)
    String frequency;
    @TableField("property")
    @ExcelProperty(index = 14)
    String property;
    @TableField("isPublic")
    @ExcelProperty(index = 15)
    String isPublic;
    @TableField("remark1")
    @ExcelProperty(index = 16)
    String remark1;
    @TableField("remark2")
    @ExcelProperty(index = 17)
    String remark2;
    @TableField(update = "now()")
    private Date modtime;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
