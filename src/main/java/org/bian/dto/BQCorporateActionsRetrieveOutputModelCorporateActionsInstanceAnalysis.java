package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceAnalysis
 */
public class BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceAnalysis   {
  private Object corporateActionsInstanceAnalysisRecord = null;

  private String corporateActionsInstanceAnalysisReportType = null;

  private String corporateActionsInstanceAnalysisParameters = null;

  private Object corporateActionsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateActionsInstanceAnalysisRecord
  **/

  public Object getCorporateActionsInstanceAnalysisRecord() {
    return corporateActionsInstanceAnalysisRecord;
  }

  public void setCorporateActionsInstanceAnalysisRecord(Object corporateActionsInstanceAnalysisRecord) {
    this.corporateActionsInstanceAnalysisRecord = corporateActionsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateActionsInstanceAnalysisReportType
  **/

  public String getCorporateActionsInstanceAnalysisReportType() {
    return corporateActionsInstanceAnalysisReportType;
  }

  public void setCorporateActionsInstanceAnalysisReportType(String corporateActionsInstanceAnalysisReportType) {
    this.corporateActionsInstanceAnalysisReportType = corporateActionsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateActionsInstanceAnalysisParameters
  **/

  public String getCorporateActionsInstanceAnalysisParameters() {
    return corporateActionsInstanceAnalysisParameters;
  }

  public void setCorporateActionsInstanceAnalysisParameters(String corporateActionsInstanceAnalysisParameters) {
    this.corporateActionsInstanceAnalysisParameters = corporateActionsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateActionsInstanceAnalysisReport
  **/

  public Object getCorporateActionsInstanceAnalysisReport() {
    return corporateActionsInstanceAnalysisReport;
  }

  public void setCorporateActionsInstanceAnalysisReport(Object corporateActionsInstanceAnalysisReport) {
    this.corporateActionsInstanceAnalysisReport = corporateActionsInstanceAnalysisReport;
  }


}

