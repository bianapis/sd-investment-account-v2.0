package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceReport
 */
public class BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceReport   {
  private Object corporateActionsInstanceReportRecord = null;

  private String corporateActionsInstanceReportType = null;

  private String corporateActionsInstanceReportParameters = null;

  private Object corporateActionsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateActionsInstanceReportRecord
  **/

  public Object getCorporateActionsInstanceReportRecord() {
    return corporateActionsInstanceReportRecord;
  }

  public void setCorporateActionsInstanceReportRecord(Object corporateActionsInstanceReportRecord) {
    this.corporateActionsInstanceReportRecord = corporateActionsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateActionsInstanceReportType
  **/

  public String getCorporateActionsInstanceReportType() {
    return corporateActionsInstanceReportType;
  }

  public void setCorporateActionsInstanceReportType(String corporateActionsInstanceReportType) {
    this.corporateActionsInstanceReportType = corporateActionsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateActionsInstanceReportParameters
  **/

  public String getCorporateActionsInstanceReportParameters() {
    return corporateActionsInstanceReportParameters;
  }

  public void setCorporateActionsInstanceReportParameters(String corporateActionsInstanceReportParameters) {
    this.corporateActionsInstanceReportParameters = corporateActionsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateActionsInstanceReport
  **/

  public Object getCorporateActionsInstanceReport() {
    return corporateActionsInstanceReport;
  }

  public void setCorporateActionsInstanceReport(Object corporateActionsInstanceReport) {
    this.corporateActionsInstanceReport = corporateActionsInstanceReport;
  }


}

