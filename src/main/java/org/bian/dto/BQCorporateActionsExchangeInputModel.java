package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsExchangeInputModel
 */
public class BQCorporateActionsExchangeInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String corporateActionsInstanceReference = null;

  private Object corporateActionsExchangeActionTaskRecord = null;

  private BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest corporateActionsExchangeActionRequest = null;


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
   * Get corporateActionsExchangeActionRequest
   * @return corporateActionsExchangeActionRequest
  **/

  public BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest getCorporateActionsExchangeActionRequest() {
    return corporateActionsExchangeActionRequest;
  }

  public void setCorporateActionsExchangeActionRequest(BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest corporateActionsExchangeActionRequest) {
    this.corporateActionsExchangeActionRequest = corporateActionsExchangeActionRequest;
  }


}

