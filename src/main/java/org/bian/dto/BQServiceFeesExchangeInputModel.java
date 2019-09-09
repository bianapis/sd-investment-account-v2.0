package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExchangeInputModel
 */
public class BQServiceFeesExchangeInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String serviceFeesInstanceReference = null;

  private Object serviceFeesExchangeActionTaskRecord = null;

  private BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest serviceFeesExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return serviceFeesExchangeActionTaskRecord
  **/

  public Object getServiceFeesExchangeActionTaskRecord() {
    return serviceFeesExchangeActionTaskRecord;
  }

  public void setServiceFeesExchangeActionTaskRecord(Object serviceFeesExchangeActionTaskRecord) {
    this.serviceFeesExchangeActionTaskRecord = serviceFeesExchangeActionTaskRecord;
  }


  /**
   * Get serviceFeesExchangeActionRequest
   * @return serviceFeesExchangeActionRequest
  **/

  public BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest getServiceFeesExchangeActionRequest() {
    return serviceFeesExchangeActionRequest;
  }

  public void setServiceFeesExchangeActionRequest(BQDepositsandWithdrawalsExchangeInputModelDepositsandWithdrawalsExchangeActionRequest serviceFeesExchangeActionRequest) {
    this.serviceFeesExchangeActionRequest = serviceFeesExchangeActionRequest;
  }


}

