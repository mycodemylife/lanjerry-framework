package org.lanjerry.admin.vo.tool;

import org.lanjerry.common.core.bean.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 代码生成字段VO
 * </p>
 *
 * @author lanjerry
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ToolGenCodeColumnVO extends BaseEntity {

    /**
     * 列名称
     */
    private String columnName;

    /**
     * 列描述
     */
    private String columnComment;

    /**
     * 列类型
     */
    private String columnType;

    /**
     * JAVA类型
     */
    private String javaType;

    /**
     * JAVA字段名
     */
    private String javaField;

    /**
     * JAVA字段名首字母大写
     */
    private String upperFirstJavaField;

    /**
     * 是否主键 0.否 1.是
     */
    private Boolean pkFlag;

    /**
     * 是否自增 0.否 1.是
     */
    private Boolean incrementFlag;

    /**
     * 是否必填 0.否 1.是
     */
    private Boolean requiredFlag;

    /**
     * 是否唯一 0.否 1.是
     */
    private Boolean onlyFlag;

    /**
     * 是否表单字段 0.否 1.是
     */
    private Boolean formFlag;

    /**
     * 是否列表字段 0.否 1.是
     */
    private Boolean listFlag;

    /**
     * 是否查询字段 0.否 1.是
     */
    private Boolean queryFlag;

    /**
     * 查询方式
     */
    private String queryType;

    /**
     * 显示类型
     */
    private String htmlType;
}