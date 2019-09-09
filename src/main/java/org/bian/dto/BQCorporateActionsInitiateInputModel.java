package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsInitiateInputModelCorporateActionsInstanceRecord;
import org.bian.dto.BQCorporateActionsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsInitiateInputModel
 */
public class BQCorporateActionsInitiateInputModel   {
  private BQCorporateActionsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;

  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private Object corporateActionsInitiateActionRecord = null;

  private BQCorporateActionsInitiateInputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord = null;


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
   * Get corporateActionsInstanceRecord
   * @return corporateActionsInstanceRecord
  **/

  public BQCorporateActionsInitiateInputModelCorporateActionsInstanceRecord getCorporateActionsInstanceRecord() {
    return corporateActionsInstanceRecord;
  }

  public void setCorporateActionsInstanceRecord(BQCorporateActionsInitiateInputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord) {
    this.corporateActionsInstanceRecord = corporateActionsInstanceRecord;
  }


}

