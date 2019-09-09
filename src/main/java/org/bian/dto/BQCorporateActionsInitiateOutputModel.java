package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQCorporateActionsInitiateOutputModelCorporateActionsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsInitiateOutputModel
 */
public class BQCorporateActionsInitiateOutputModel   {
  private BQCorporateActionsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateActionsInstanceReference = null;

  private String corporateActionsInitiateActionReference = null;

  private Object corporateActionsInitiateActionRecord = null;

  private String corporateActionsInstanceStatus = null;

  private BQCorporateActionsInitiateOutputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord = null;


  /**
   * Get investmentAccountFulfillmentArrangementInstanceRecord
   * @return investmentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQCorporateActionsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(BQCorporateActionsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
    this.investmentAccountFulfillmentArrangementInstanceRecord = investmentAccountFulfillmentArrangementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateActionsInitiateActionReference
  **/

  public String getCorporateActionsInitiateActionReference() {
    return corporateActionsInitiateActionReference;
  }

  public void setCorporateActionsInitiateActionReference(String corporateActionsInitiateActionReference) {
    this.corporateActionsInitiateActionReference = corporateActionsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateActionsInitiateActionRecord
  **/

  public Object getCorporateActionsInitiateActionRecord() {
    return corporateActionsInitiateActionRecord;
  }

  public void setCorporateActionsInitiateActionRecord(Object corporateActionsInitiateActionRecord) {
    this.corporateActionsInitiateActionRecord = corporateActionsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Actions instance (e.g. initialised, pending, active) 
   * @return corporateActionsInstanceStatus
  **/

  public String getCorporateActionsInstanceStatus() {
    return corporateActionsInstanceStatus;
  }

  public void setCorporateActionsInstanceStatus(String corporateActionsInstanceStatus) {
    this.corporateActionsInstanceStatus = corporateActionsInstanceStatus;
  }


  /**
   * Get corporateActionsInstanceRecord
   * @return corporateActionsInstanceRecord
  **/

  public BQCorporateActionsInitiateOutputModelCorporateActionsInstanceRecord getCorporateActionsInstanceRecord() {
    return corporateActionsInstanceRecord;
  }

  public void setCorporateActionsInstanceRecord(BQCorporateActionsInitiateOutputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord) {
    this.corporateActionsInstanceRecord = corporateActionsInstanceRecord;
  }


}

