package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary;


import org.springframework.scheduling.annotation.Async;
import uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.model.request.S3Request;

public interface S3UploaderSysIntegrator {
    @Async
    void saveToS3Bucket(S3Request request);
}
