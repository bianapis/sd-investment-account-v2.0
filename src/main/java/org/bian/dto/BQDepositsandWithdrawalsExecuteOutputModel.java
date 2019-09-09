package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExecuteOutputModel
 */
public class BQDepositsandWithdrawalsExecuteOutputModel   {
  private String depositsandWithdrawalsExecuteActionTaskReference = null;

  private Object depositsandWithdrawalsExecuteActionTaskRecord = null;

  private String depositsandWithdrawalsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits and Withdrawals instance execute service call 
   * @return depositsandWithdrawalsExecuteActionTaskReference
  **/

  public String getDepositsandWithdrawalsExecuteActionTaskReference() {
    return depositsandWithdrawalsExecuteActionTaskReference;
  }

  public void setDepositsandWithdrawalsExecuteActionTaskReference(String depositsandWithdrawalsExecuteActionTaskReference) {
    this.depositsandWithdrawalsExecuteActionTaskReference = depositsandWithdrawalsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsandWithdrawalsExecuteActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsExecuteActionTaskRecord() {
    return depositsandWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsandWithdrawalsExecuteActionTaskRecord(Object depositsandWithdrawalsExecuteActionTaskRecord) {
    this.depositsandWithdrawalsExecuteActionTaskRecord = depositsandWithdrawalsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits and Withdrawals execute transaction/record 
   * @return depositsandWithdrawalsExecuteRecordReference
  **/

  public String getDepositsandWithdrawalsExecuteRecordReference() {
    return depositsandWithdrawalsExecuteRecordReference;
  }

  public void setDepositsandWithdrawalsExecuteRecordReference(String depositsandWithdrawalsExecuteRecordReference) {
    this.depositsandWithdrawalsExecuteRecordReference = depositsandWithdrawalsExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

