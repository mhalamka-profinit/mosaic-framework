package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Getter
@Validated
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "integration.s3-uploader")
@ConstructorBinding
public class S3UploaderSysProperties {

    @NotBlank
    private final String baseUrl;

    @NotBlank
    private final String service;

    @NotBlank
    private final String subservice;
}

