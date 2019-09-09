package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsUpdateInputModel
 */
public class BQCorporateActionsUpdateInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String corporateActionsInstanceReference = null;

  private Object corporateActionsUpdateActionTaskRecord = null;

  private String corporateActionsUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Investment Account Fulfillment Arrangement instance 
   * @return investmentAccountFulfillmentArrangementInstanceReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReference() {
    return investmentAccountFulfillmentArrangementInstanceReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReference(String investmentAccountFulfillmentArrangementInstanceReference) {
    this.investmentAccountFulfillmentArrangementInstanceReference = investmentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Actions instance 
   * @return corporateActionsInstanceReference
  **/

  public String getCorporateActionsInstanceReference() {
    return corporateActionsInstanceReference;
  }

  public void setCorporateActionsInstanceReference(String corporateActionsInstanceReference) {
    this.corporateActionsInstanceReference = corporateActionsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateActionsUpdateActionTaskRecord
  **/

  public Object getCorporateActionsUpdateActionTaskRecord() {
    return corporateActionsUpdateActionTaskRecord;
  }

  public void setCorporateActionsUpdateActionTaskRecord(Object corporateActionsUpdateActionTaskRecord) {
    this.corporateActionsUpdateActionTaskRecord = corporateActionsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return corporateActionsUpdateActionRequest
  **/

  public String getCorporateActionsUpdateActionRequest() {
    return corporateActionsUpdateActionRequest;
  }

  public void setCorporateActionsUpdateActionRequest(String corporateActionsUpdateActionRequest) {
    this.corporateActionsUpdateActionRequest = corporateActionsUpdateActionRequest;
  }


}

