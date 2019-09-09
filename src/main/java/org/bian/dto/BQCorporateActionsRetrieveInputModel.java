package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsRetrieveInputModelCorporateActionsInstanceAnalysis;
import org.bian.dto.BQCorporateActionsRetrieveInputModelCorporateActionsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsRetrieveInputModel
 */
public class BQCorporateActionsRetrieveInputModel   {
  private Object corporateActionsRetrieveActionTaskRecord = null;

  private String corporateActionsRetrieveActionRequest = null;

  private BQCorporateActionsRetrieveInputModelCorporateActionsInstanceReport corporateActionsInstanceReport = null;

  private BQCorporateActionsRetrieveInputModelCorporateActionsInstanceAnalysis corporateActionsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateActionsRetrieveActionTaskRecord
  **/

  public Object getCorporateActionsRetrieveActionTaskRecord() {
    return corporateActionsRetrieveActionTaskRecord;
  }

  public void setCorporateActionsRetrieveActionTaskRecord(Object corporateActionsRetrieveActionTaskRecord) {
    this.corporateActionsRetrieveActionTaskRecord = corporateActionsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateActionsRetrieveActionRequest
  **/

  public String getCorporateActionsRetrieveActionRequest() {
    return corporateActionsRetrieveActionRequest;
  }

  public void setCorporateActionsRetrieveActionRequest(String corporateActionsRetrieveActionRequest) {
    this.corporateActionsRetrieveActionRequest = corporateActionsRetrieveActionRequest;
  }


  /**
   * Get corporateActionsInstanceReport
   * @return corporateActionsInstanceReport
  **/

  public BQCorporateActionsRetrieveInputModelCorporateActionsInstanceReport getCorporateActionsInstanceReport() {
    return corporateActionsInstanceReport;
  }

  public void setCorporateActionsInstanceReport(BQCorporateActionsRetrieveInputModelCorporateActionsInstanceReport corporateActionsInstanceReport) {
    this.corporateActionsInstanceReport = corporateActionsInstanceReport;
  }


  /**
   * Get corporateActionsInstanceAnalysis
   * @return corporateActionsInstanceAnalysis
  **/

  public BQCorporateActionsRetrieveInputModelCorporateActionsInstanceAnalysis getCorporateActionsInstanceAnalysis() {
    return corporateActionsInstanceAnalysis;
  }

  public void setCorporateActionsInstanceAnalysis(BQCorporateActionsRetrieveInputModelCorporateActionsInstanceAnalysis corporateActionsInstanceAnalysis) {
    this.corporateActionsInstanceAnalysis = corporateActionsInstanceAnalysis;
  }


}

