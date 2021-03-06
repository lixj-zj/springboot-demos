package com.example.demo.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @Description: Salaries实体类
 * --------------------------------------
 * @ClassName: Salaries.java
 * @Date: 2021/03/10 23:03:32
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 */

@Data
@TableName("salaries")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Salaries对象", description = "Salaries对象")
public class Salaries implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "emp_no", type = IdType.AUTO)
    private Integer empNo;

    @TableField("salary")
    private Integer salary;

    @TableField("from_date")
    private LocalDate fromDate;

    @TableField("to_date")
    private LocalDate toDate;


    public static final String EMP_NO = "emp_no";

    public static final String SALARY = "salary";

    public static final String FROM_DATE = "from_date";

    public static final String TO_DATE = "to_date";

}