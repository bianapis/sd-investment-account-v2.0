package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceReport
 */
public class BQDepositsandWithdrawalsRetrieveOutputModelDepositsandWithdrawalsInstanceReport   {
  private Object depositsandWithdrawalsInstanceReportRecord = null;

  private String depositsandWithdrawalsInstanceReportType = null;

  private String depositsandWithdrawalsInstanceReportParameters = null;

  private Object depositsandWithdrawalsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return depositsandWithdrawalsInstanceReportRecord
  **/

  public Object getDepositsandWithdrawalsInstanceReportRecord() {
    return depositsandWithdrawalsInstanceReportRecord;
  }

  public void setDepositsandWithdrawalsInstanceReportRecord(Object depositsandWithdrawalsInstanceReportRecord) {
    this.depositsandWithdrawalsInstanceReportRecord = depositsandWithdrawalsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return depositsandWithdrawalsInstanceReportType
  **/

  public String getDepositsandWithdrawalsInstanceReportType() {
    return depositsandWithdrawalsInstanceReportType;
  }

  public void setDepositsandWithdrawalsInstanceReportType(String depositsandWithdrawalsInstanceReportType) {
    this.depositsandWithdrawalsInstanceReportType = depositsandWithdrawalsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return depositsandWithdrawalsInstanceReportParameters
  **/

  public String getDepositsandWithdrawalsInstanceReportParameters() {
    return depositsandWithdrawalsInstanceReportParameters;
  }

  public void setDepositsandWithdrawalsInstanceReportParameters(String depositsandWithdrawalsInstanceReportParameters) {
    this.depositsandWithdrawalsInstanceReportParameters = depositsandWithdrawalsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return depositsandWithdrawalsInstanceReport
  **/

  public Object getDepositsandWithdrawalsInstanceReport() {
    return depositsandWithdrawalsInstanceReport;
  }

  public void setDepositsandWithdrawalsInstanceReport(Object depositsandWithdrawalsInstanceReport) {
    this.depositsandWithdrawalsInstanceReport = depositsandWithdrawalsInstanceReport;
  }


}

