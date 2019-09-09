package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsExchangeOutputModel
 */
public class BQCorporateActionsExchangeOutputModel   {
  private String corporateActionsExchangeActionTaskReference = null;

  private Object corporateActionsExchangeActionTaskRecord = null;

  private String corporateActionsExchangeActionResponse = null;

  private String corporateActionsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Actions instance exchange service call 
   * @return corporateActionsExchangeActionTaskReference
  **/

  public String getCorporateActionsExchangeActionTaskReference() {
    return corporateActionsExchangeActionTaskReference;
  }

  public void setCorporateActionsExchangeActionTaskReference(String corporateActionsExchangeActionTaskReference) {
    this.corporateActionsExchangeActionTaskReference = corporateActionsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return corporateActionsExchangeActionTaskRecord
  **/

  public Object getCorporateActionsExchangeActionTaskRecord() {
    return corporateActionsExchangeActionTaskRecord;
  }

  public void setCorporateActionsExchangeActionTaskRecord(Object corporateActionsExchangeActionTaskRecord) {
    this.corporateActionsExchangeActionTaskRecord = corporateActionsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return corporateActionsExchangeActionResponse
  **/

  public String getCorporateActionsExchangeActionResponse() {
    return corporateActionsExchangeActionResponse;
  }

  public void setCorporateActionsExchangeActionResponse(String corporateActionsExchangeActionResponse) {
    this.corporateActionsExchangeActionResponse = corporateActionsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Actions instance (e.g. accepted, rejected, verified) 
   * @return corporateActionsInstanceStatus
  **/

  public String getCorporateActionsInstanceStatus() {
    return corporateActionsInstanceStatus;
  }

  public void setCorporateActionsInstanceStatus(String corporateActionsInstanceStatus) {
    this.corporateActionsInstanceStatus = corporateActionsInstanceStatus;
  }


}

