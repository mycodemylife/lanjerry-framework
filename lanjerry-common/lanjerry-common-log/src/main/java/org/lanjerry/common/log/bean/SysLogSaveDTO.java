package org.lanjerry.common.log.bean;

import java.math.BigDecimal;

import org.lanjerry.common.core.bean.BaseEntity;
import org.lanjerry.common.core.enums.sys.SysLogStatusEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统日志保存DTO
 * </p>
 *
 * @author lanjerry
 * @since 2019-09-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysLogSaveDTO extends BaseEntity {

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 是否异步请求 0.否 1.是
     */
    private Boolean ajaxFlag;

    /**
     * 请求uri
     */
    private String requestUri;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 操作方法
     */
    private String classMethod;

    /**
     * 动作名称
     */
    private String actionName;

    /**
     * 状态 1.成功 2.失败
     */
    private SysLogStatusEnum status;

    /**
     * 执行时间（秒）
     */
    private BigDecimal executionTime;

    /**
     * 异常信息
     */
    private String exceptionMsg;
}
