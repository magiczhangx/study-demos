package com.example.web.config.PropertyValidate;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix="example.web")
//注意这里 validated是和 下面的validation(@NotNull , @Max , @Min ...)注解联合使用的
@Validated
@Data
public class ProfileProperties {
    @NotNull
    private String[] dockerServers;
    @NotNull
    private String profileName;

    /**
     *  如果NotNull属性值为空, 会产生如下bind失败
     *  Binding to target org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'example.web' to com.example.web.config.PropertyValidate.ProfileProperties failed:
     *
     *     Property: example.web.profileName
     *     Value: null
     *     Reason: 不能为null
     *
     *
     * Action:
     *
     * Update your application's configuration
     * javax.validation.constraints下还有Size , NotBlank , NotEmpty , Digits , Max  , Min等有用注解
     * @Size(min = 8, max = 10)可表达范围
     */
    @NotNull
    private String hostSystem;

}
