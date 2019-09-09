package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementUpdateInputModel
 */
public class CRInvestmentAccountFulfillmentArrangementUpdateInputModel   {
  private String investmentAccountServicingSessionReference = null;

  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;

  private Object investmentAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return investmentAccountServicingSessionReference
  **/

  public String getInvestmentAccountServicingSessionReference() {
    return investmentAccountServicingSessionReference;
  }

  public void setInvestmentAccountServicingSessionReference(String investmentAccountServicingSessionReference) {
    this.investmentAccountServicingSessionReference = investmentAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Investment Account Fulfillment Arrangement instance 
   * @return investmentAccountFulfillmentArrangementInstanceReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReference() {
    return investmentAccountFulfillmentArrangementInstanceReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReference(String investmentAccountFulfillmentArrangementInstanceReference) {
    this.investmentAccountFulfillmentArrangementInstanceReference = investmentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * Get investmentAccountFulfillmentArrangementInstanceRecord
   * @return investmentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
    this.investmentAccountFulfillmentArrangementInstanceRecord = investmentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return investmentAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getInvestmentAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return investmentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementUpdateActionTaskRecord(Object investmentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.investmentAccountFulfillmentArrangementUpdateActionTaskRecord = investmentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

