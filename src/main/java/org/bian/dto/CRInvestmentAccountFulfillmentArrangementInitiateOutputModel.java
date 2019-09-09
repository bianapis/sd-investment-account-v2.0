package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementInitiateOutputModel
 */
public class CRInvestmentAccountFulfillmentArrangementInitiateOutputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String investmentAccountFulfillmentArrangementInitiateActionReference = null;

  private Object investmentAccountFulfillmentArrangementInitiateActionRecord = null;

  private String investmentAccountFulfillmentArrangementInstanceStatus = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return investmentAccountFulfillmentArrangementInitiateActionReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInitiateActionReference() {
    return investmentAccountFulfillmentArrangementInitiateActionReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInitiateActionReference(String investmentAccountFulfillmentArrangementInitiateActionReference) {
    this.investmentAccountFulfillmentArrangementInitiateActionReference = investmentAccountFulfillmentArrangementInitiateActionReference;
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

  public CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
    this.investmentAccountFulfillmentArrangementInstanceRecord = investmentAccountFulfillmentArrangementInstanceRecord;
  }


}

