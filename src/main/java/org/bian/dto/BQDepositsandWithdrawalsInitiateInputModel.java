package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsInitiateInputModel
 */
public class BQDepositsandWithdrawalsInitiateInputModel   {
  private BQDepositsandWithdrawalsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;

  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private Object depositsandWithdrawalsInitiateActionRecord = null;


  /**
   * Get investmentAccountFulfillmentArrangementInstanceRecord
   * @return investmentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQDepositsandWithdrawalsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(BQDepositsandWithdrawalsInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
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
   * @return depositsandWithdrawalsInitiateActionRecord
  **/

  public Object getDepositsandWithdrawalsInitiateActionRecord() {
    return depositsandWithdrawalsInitiateActionRecord;
  }

  public void setDepositsandWithdrawalsInitiateActionRecord(Object depositsandWithdrawalsInitiateActionRecord) {
    this.depositsandWithdrawalsInitiateActionRecord = depositsandWithdrawalsInitiateActionRecord;
  }


}

