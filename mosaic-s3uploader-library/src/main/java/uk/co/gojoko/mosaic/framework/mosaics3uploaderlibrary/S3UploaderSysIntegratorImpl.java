package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.model.request.S3Request;

@Log4j2
@RequiredArgsConstructor
public class S3UploaderSysIntegratorImpl implements S3UploaderSysIntegrator {

    private final WebClient webClient;

    private static final String UPLOAD_TO_S3_URL = "/applications/saveToS3Bucket";

    @Async
    public void saveToS3Bucket(S3Request request) {
        webClient.post()
                .uri(UPLOAD_TO_S3_URL)
                .bodyValue(request)
                .exchangeToMono(clientResponse -> {
                    if (clientResponse.statusCode().isError()) {
                        return clientResponse.createException().flatMap(Mono::error);
                    } else {
                        return clientResponse.bodyToMono(Void.class);
                    }
                })
                .block();
    }
}
