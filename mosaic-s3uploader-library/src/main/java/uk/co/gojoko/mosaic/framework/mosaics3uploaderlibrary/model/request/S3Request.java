package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.model.request;

import lombok.Value;
import uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant.FileFormat;
import uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant.LogType;

@Value
public class S3Request {
    Long applicationId;
    String file;
    FileFormat format;
    LogType type;
    String service;
    String subService;
}
