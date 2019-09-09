package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsUpdateInputModel
 */
public class BQDepositsandWithdrawalsUpdateInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String depositsandWithdrawalsInstanceReference = null;

  private Object depositsandWithdrawalsUpdateActionTaskRecord = null;

  private String depositsandWithdrawalsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsandWithdrawalsUpdateActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsUpdateActionTaskRecord() {
    return depositsandWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsandWithdrawalsUpdateActionTaskRecord(Object depositsandWithdrawalsUpdateActionTaskRecord) {
    this.depositsandWithdrawalsUpdateActionTaskRecord = depositsandWithdrawalsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositsandWithdrawalsUpdateActionRequest
  **/

  public String getDepositsandWithdrawalsUpdateActionRequest() {
    return depositsandWithdrawalsUpdateActionRequest;
  }

  public void setDepositsandWithdrawalsUpdateActionRequest(String depositsandWithdrawalsUpdateActionRequest) {
    this.depositsandWithdrawalsUpdateActionRequest = depositsandWithdrawalsUpdateActionRequest;
  }


}

