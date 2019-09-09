package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementInitiateInputModel
 */
public class CRInvestmentAccountFulfillmentArrangementInitiateInputModel   {
  private String investmentAccountServicingSessionReference = null;

  private Object investmentAccountFulfillmentArrangementInitiateActionRecord = null;

  private String investmentAccountFulfillmentArrangementInstanceStatus = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return investmentAccountFulfillmentArrangementInitiateActionRecord
  **/

  public Object getInvestmentAccountFulfillmentArrangementInitiateActionRecord() {
    return investmentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInitiateActionRecord(Object investmentAccountFulfillmentArrangementInitiateActionRecord) {
    this.investmentAccountFulfillmentArrangementInitiateActionRecord = investmentAccountFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Investment Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return investmentAccountFulfillmentArrangementInstanceStatus
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceStatus() {
    return investmentAccountFulfillmentArrangementInstanceStatus;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceStatus(String investmentAccountFulfillmentArrangementInstanceStatus) {
    this.investmentAccountFulfillmentArrangementInstanceStatus = investmentAccountFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get investmentAccountFulfillmentArrangementInstanceRecord
   * @return investmentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
    this.investmentAccountFulfillmentArrangementInstanceRecord = investmentAccountFulfillmentArrangementInstanceRecord;
  }


}

