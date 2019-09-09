package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceAnalysis;
import org.bian.dto.BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsRetrieveInputModel
 */
public class BQDepositsandWithdrawalsRetrieveInputModel   {
  private Object depositsandWithdrawalsRetrieveActionTaskRecord = null;

  private String depositsandWithdrawalsRetrieveActionRequest = null;

  private BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceReport depositsandWithdrawalsInstanceReport = null;

  private BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceAnalysis depositsandWithdrawalsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return depositsandWithdrawalsRetrieveActionRequest
  **/

  public String getDepositsandWithdrawalsRetrieveActionRequest() {
    return depositsandWithdrawalsRetrieveActionRequest;
  }

  public void setDepositsandWithdrawalsRetrieveActionRequest(String depositsandWithdrawalsRetrieveActionRequest) {
    this.depositsandWithdrawalsRetrieveActionRequest = depositsandWithdrawalsRetrieveActionRequest;
  }


  /**
   * Get depositsandWithdrawalsInstanceReport
   * @return depositsandWithdrawalsInstanceReport
  **/

  public BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceReport getDepositsandWithdrawalsInstanceReport() {
    return depositsandWithdrawalsInstanceReport;
  }

  public void setDepositsandWithdrawalsInstanceReport(BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceReport depositsandWithdrawalsInstanceReport) {
    this.depositsandWithdrawalsInstanceReport = depositsandWithdrawalsInstanceReport;
  }


  /**
   * Get depositsandWithdrawalsInstanceAnalysis
   * @return depositsandWithdrawalsInstanceAnalysis
  **/

  public BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceAnalysis getDepositsandWithdrawalsInstanceAnalysis() {
    return depositsandWithdrawalsInstanceAnalysis;
  }

  public void setDepositsandWithdrawalsInstanceAnalysis(BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceAnalysis depositsandWithdrawalsInstanceAnalysis) {
    this.depositsandWithdrawalsInstanceAnalysis = depositsandWithdrawalsInstanceAnalysis;
  }


}

