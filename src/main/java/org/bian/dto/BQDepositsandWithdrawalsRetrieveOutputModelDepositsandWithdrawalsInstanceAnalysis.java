package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceAnalysis
 */
public class BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceAnalysis   {
  private Object depositsandWithdrawalsInstanceAnalysisRecord = null;

  private String depositsandWithdrawalsInstanceAnalysisReportType = null;

  private String depositsandWithdrawalsInstanceAnalysisParameters = null;

  private Object depositsandWithdrawalsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return depositsandWithdrawalsInstanceAnalysisRecord
  **/

  public Object getDepositsandWithdrawalsInstanceAnalysisRecord() {
    return depositsandWithdrawalsInstanceAnalysisRecord;
  }

  public void setDepositsandWithdrawalsInstanceAnalysisRecord(Object depositsandWithdrawalsInstanceAnalysisRecord) {
    this.depositsandWithdrawalsInstanceAnalysisRecord = depositsandWithdrawalsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return depositsandWithdrawalsInstanceAnalysisReportType
  **/

  public String getDepositsandWithdrawalsInstanceAnalysisReportType() {
    return depositsandWithdrawalsInstanceAnalysisReportType;
  }

  public void setDepositsandWithdrawalsInstanceAnalysisReportType(String depositsandWithdrawalsInstanceAnalysisReportType) {
    this.depositsandWithdrawalsInstanceAnalysisReportType = depositsandWithdrawalsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return depositsandWithdrawalsInstanceAnalysisParameters
  **/

  public String getDepositsandWithdrawalsInstanceAnalysisParameters() {
    return depositsandWithdrawalsInstanceAnalysisParameters;
  }

  public void setDepositsandWithdrawalsInstanceAnalysisParameters(String depositsandWithdrawalsInstanceAnalysisParameters) {
    this.depositsandWithdrawalsInstanceAnalysisParameters = depositsandWithdrawalsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return depositsandWithdrawalsInstanceAnalysisReport
  **/

  public Object getDepositsandWithdrawalsInstanceAnalysisReport() {
    return depositsandWithdrawalsInstanceAnalysisReport;
  }

  public void setDepositsandWithdrawalsInstanceAnalysisReport(Object depositsandWithdrawalsInstanceAnalysisReport) {
    this.depositsandWithdrawalsInstanceAnalysisReport = depositsandWithdrawalsInstanceAnalysisReport;
  }


}

