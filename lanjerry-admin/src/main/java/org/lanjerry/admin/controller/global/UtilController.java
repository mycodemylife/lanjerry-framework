package org.lanjerry.admin.controller.global;

import java.util.HashMap;
import java.util.Map;

import org.lanjerry.admin.util.AdminConsts;
import org.lanjerry.admin.util.RedisUtil;
import org.lanjerry.common.core.bean.ApiResult;
import org.lanjerry.common.core.util.IDGeneratorUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.wf.captcha.SpecCaptcha;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 工具类控制器
 * </p>
 *
 * @author lanjerry
 * @since 2019-11-22
 */
@RestController
@RequestMapping("/util")
@Api(tags = "工具类api", position = 1)
@ApiSupport(author = "38046851@qq.com")
public class UtilController {

    @GetMapping("/captchaCode/create")
    @ApiOperation(value = "生成图形验证码", position = 10)
    public ApiResult<Map<String, String>> createCaptchaCode() {
        Map<String, String> result = new HashMap<>();
        SpecCaptcha specCaptcha = new SpecCaptcha(111, 36, 4);
        String verCode = specCaptcha.text().toLowerCase();
        String key = String.valueOf(IDGeneratorUtil.nextId());
        RedisUtil.setFromString(AdminConsts.CAPTCHA_CODE_KEY.concat(key), verCode, AdminConsts.CAPTCHA_EXPIRATION);
        result.put("key", key);
        result.put("image", specCaptcha.toBase64());
        return ApiResult.success(result);
    }
}