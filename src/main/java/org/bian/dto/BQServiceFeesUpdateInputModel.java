package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesUpdateInputModel
 */
public class BQServiceFeesUpdateInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String serviceFeesInstanceReference = null;

  private Object serviceFeesUpdateActionTaskRecord = null;

  private String serviceFeesUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  **/

  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return serviceFeesUpdateActionTaskRecord
  **/

  public Object getServiceFeesUpdateActionTaskRecord() {
    return serviceFeesUpdateActionTaskRecord;
  }

  public void setServiceFeesUpdateActionTaskRecord(Object serviceFeesUpdateActionTaskRecord) {
    this.serviceFeesUpdateActionTaskRecord = serviceFeesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return serviceFeesUpdateActionRequest
  **/

  public String getServiceFeesUpdateActionRequest() {
    return serviceFeesUpdateActionRequest;
  }

  public void setServiceFeesUpdateActionRequest(String serviceFeesUpdateActionRequest) {
    this.serviceFeesUpdateActionRequest = serviceFeesUpdateActionRequest;
  }


}

