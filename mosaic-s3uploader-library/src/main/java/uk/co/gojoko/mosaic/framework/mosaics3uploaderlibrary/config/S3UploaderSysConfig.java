package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.config;

import uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.S3UploaderSysIntegratorImpl;
import uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant.S3UploaderSysProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@RequiredArgsConstructor
public class S3UploaderSysConfig {
    private final S3UploaderSysProperties s3UploaderSysProperties;

    @Bean
    public S3UploaderSysIntegratorImpl createS3UploaderIntegrator() {
        return new S3UploaderSysIntegratorImpl(WebClient.builder().baseUrl(
                s3UploaderSysProperties.getBaseUrl()
        ).build());
    }
}
