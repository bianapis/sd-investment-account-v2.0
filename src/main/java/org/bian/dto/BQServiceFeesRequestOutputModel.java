package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRequestOutputModel
 */
public class BQServiceFeesRequestOutputModel   {
  private String serviceFeesRequestActionTaskReference = null;

  private Object serviceFeesRequestActionTaskRecord = null;

  private String serviceFeesRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance request service call 
   * @return serviceFeesRequestActionTaskReference
  **/

  public String getServiceFeesRequestActionTaskReference() {
    return serviceFeesRequestActionTaskReference;
  }

  public void setServiceFeesRequestActionTaskReference(String serviceFeesRequestActionTaskReference) {
    this.serviceFeesRequestActionTaskReference = serviceFeesRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return serviceFeesRequestActionTaskRecord
  **/

  public Object getServiceFeesRequestActionTaskRecord() {
    return serviceFeesRequestActionTaskRecord;
  }

  public void setServiceFeesRequestActionTaskRecord(Object serviceFeesRequestActionTaskRecord) {
    this.serviceFeesRequestActionTaskRecord = serviceFeesRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees service request record 
   * @return serviceFeesRequestRecordReference
  **/

  public String getServiceFeesRequestRecordReference() {
    return serviceFeesRequestRecordReference;
  }

  public void setServiceFeesRequestRecordReference(String serviceFeesRequestRecordReference) {
    this.serviceFeesRequestRecordReference = serviceFeesRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

