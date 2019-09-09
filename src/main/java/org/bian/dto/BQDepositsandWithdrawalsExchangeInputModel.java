package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExchangeInputModel
 */
public class BQDepositsandWithdrawalsExchangeInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String depositsandWithdrawalsInstanceReference = null;

  private Object depositsandWithdrawalsExchangeActionTaskRecord = null;

  private BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest depositsandWithdrawalsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits and Withdrawals instance 
   * @return depositsandWithdrawalsInstanceReference
  **/

  public String getDepositsandWithdrawalsInstanceReference() {
    return depositsandWithdrawalsInstanceReference;
  }

  public void setDepositsandWithdrawalsInstanceReference(String depositsandWithdrawalsInstanceReference) {
    this.depositsandWithdrawalsInstanceReference = depositsandWithdrawalsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return depositsandWithdrawalsExchangeActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsExchangeActionTaskRecord() {
    return depositsandWithdrawalsExchangeActionTaskRecord;
  }

  public void setDepositsandWithdrawalsExchangeActionTaskRecord(Object depositsandWithdrawalsExchangeActionTaskRecord) {
    this.depositsandWithdrawalsExchangeActionTaskRecord = depositsandWithdrawalsExchangeActionTaskRecord;
  }


  /**
   * Get depositsandWithdrawalsExchangeActionRequest
   * @return depositsandWithdrawalsExchangeActionRequest
  **/

  public BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest getDepositsandWithdrawalsExchangeActionRequest() {
    return depositsandWithdrawalsExchangeActionRequest;
  }

  public void setDepositsandWithdrawalsExchangeActionRequest(BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest depositsandWithdrawalsExchangeActionRequest) {
    this.depositsandWithdrawalsExchangeActionRequest = depositsandWithdrawalsExchangeActionRequest;
  }


}

