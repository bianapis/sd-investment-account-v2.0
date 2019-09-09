package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsUpdateOutputModel
 */
public class BQDepositsandWithdrawalsUpdateOutputModel   {
  private String depositsandWithdrawalsUpdateActionTaskReference = null;

  private Object depositsandWithdrawalsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return depositsandWithdrawalsUpdateActionTaskReference
  **/

  public String getDepositsandWithdrawalsUpdateActionTaskReference() {
    return depositsandWithdrawalsUpdateActionTaskReference;
  }

  public void setDepositsandWithdrawalsUpdateActionTaskReference(String depositsandWithdrawalsUpdateActionTaskReference) {
    this.depositsandWithdrawalsUpdateActionTaskReference = depositsandWithdrawalsUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

