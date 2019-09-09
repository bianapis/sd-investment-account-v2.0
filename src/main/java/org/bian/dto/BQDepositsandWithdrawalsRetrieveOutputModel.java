package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceAnalysis;
import org.bian.dto.BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsRetrieveOutputModel
 */
public class BQDepositsandWithdrawalsRetrieveOutputModel   {
  private String depositsandWithdrawalsRetrieveActionTaskReference = null;

  private Object depositsandWithdrawalsRetrieveActionTaskRecord = null;

  private String depositsandWithdrawalsRetrieveActionResponse = null;

  private BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceReport depositsandWithdrawalsInstanceReport = null;

  private BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceAnalysis depositsandWithdrawalsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits and Withdrawals instance retrieve service call 
   * @return depositsandWithdrawalsRetrieveActionTaskReference
  **/

  public String getDepositsandWithdrawalsRetrieveActionTaskReference() {
    return depositsandWithdrawalsRetrieveActionTaskReference;
  }

  public void setDepositsandWithdrawalsRetrieveActionTaskReference(String depositsandWithdrawalsRetrieveActionTaskReference) {
    this.depositsandWithdrawalsRetrieveActionTaskReference = depositsandWithdrawalsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositsandWithdrawalsRetrieveActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsRetrieveActionTaskRecord() {
    return depositsandWithdrawalsRetrieveActionTaskRecord;
  }

  public void setDepositsandWithdrawalsRetrieveActionTaskRecord(Object depositsandWithdrawalsRetrieveActionTaskRecord) {
    this.depositsandWithdrawalsRetrieveActionTaskRecord = depositsandWithdrawalsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return depositsandWithdrawalsRetrieveActionResponse
  **/

  public String getDepositsandWithdrawalsRetrieveActionResponse() {
    return depositsandWithdrawalsRetrieveActionResponse;
  }

  public void setDepositsandWithdrawalsRetrieveActionResponse(String depositsandWithdrawalsRetrieveActionResponse) {
    this.depositsandWithdrawalsRetrieveActionResponse = depositsandWithdrawalsRetrieveActionResponse;
  }


  /**
   * Get depositsandWithdrawalsInstanceReport
   * @return depositsandWithdrawalsInstanceReport
  **/

  public BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceReport getDepositsandWithdrawalsInstanceReport() {
    return depositsandWithdrawalsInstanceReport;
  }

  public void setDepositsandWithdrawalsInstanceReport(BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceReport depositsandWithdrawalsInstanceReport) {
    this.depositsandWithdrawalsInstanceReport = depositsandWithdrawalsInstanceReport;
  }


  /**
   * Get depositsandWithdrawalsInstanceAnalysis
   * @return depositsandWithdrawalsInstanceAnalysis
  **/

  public BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceAnalysis getDepositsandWithdrawalsInstanceAnalysis() {
    return depositsandWithdrawalsInstanceAnalysis;
  }

  public void setDepositsandWithdrawalsInstanceAnalysis(BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceAnalysis depositsandWithdrawalsInstanceAnalysis) {
    this.depositsandWithdrawalsInstanceAnalysis = depositsandWithdrawalsInstanceAnalysis;
  }


}

