package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExchangeOutputModel
 */
public class BQDepositsandWithdrawalsExchangeOutputModel   {
  private String depositsandWithdrawalsExchangeActionTaskReference = null;

  private Object depositsandWithdrawalsExchangeActionTaskRecord = null;

  private String depositsandWithdrawalsExchangeActionResponse = null;

  private String depositsandWithdrawalsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits and Withdrawals instance exchange service call 
   * @return depositsandWithdrawalsExchangeActionTaskReference
  **/

  public String getDepositsandWithdrawalsExchangeActionTaskReference() {
    return depositsandWithdrawalsExchangeActionTaskReference;
  }

  public void setDepositsandWithdrawalsExchangeActionTaskReference(String depositsandWithdrawalsExchangeActionTaskReference) {
    this.depositsandWithdrawalsExchangeActionTaskReference = depositsandWithdrawalsExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return depositsandWithdrawalsExchangeActionResponse
  **/

  public String getDepositsandWithdrawalsExchangeActionResponse() {
    return depositsandWithdrawalsExchangeActionResponse;
  }

  public void setDepositsandWithdrawalsExchangeActionResponse(String depositsandWithdrawalsExchangeActionResponse) {
    this.depositsandWithdrawalsExchangeActionResponse = depositsandWithdrawalsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposits and Withdrawals instance (e.g. accepted, rejected, verified) 
   * @return depositsandWithdrawalsInstanceStatus
  **/

  public String getDepositsandWithdrawalsInstanceStatus() {
    return depositsandWithdrawalsInstanceStatus;
  }

  public void setDepositsandWithdrawalsInstanceStatus(String depositsandWithdrawalsInstanceStatus) {
    this.depositsandWithdrawalsInstanceStatus = depositsandWithdrawalsInstanceStatus;
  }


}

