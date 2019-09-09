package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceAnalysis;
import org.bian.dto.BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceRecord;
import org.bian.dto.BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsRetrieveOutputModel
 */
public class BQCorporateActionsRetrieveOutputModel   {
  private BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord = null;

  private String corporateActionsRetrieveActionTaskReference = null;

  private Object corporateActionsRetrieveActionTaskRecord = null;

  private String corporateActionsRetrieveActionResponse = null;

  private BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceReport corporateActionsInstanceReport = null;

  private BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceAnalysis corporateActionsInstanceAnalysis = null;


  /**
   * Get corporateActionsInstanceRecord
   * @return corporateActionsInstanceRecord
  **/

  public BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceRecord getCorporateActionsInstanceRecord() {
    return corporateActionsInstanceRecord;
  }

  public void setCorporateActionsInstanceRecord(BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord) {
    this.corporateActionsInstanceRecord = corporateActionsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Actions instance retrieve service call 
   * @return corporateActionsRetrieveActionTaskReference
  **/

  public String getCorporateActionsRetrieveActionTaskReference() {
    return corporateActionsRetrieveActionTaskReference;
  }

  public void setCorporateActionsRetrieveActionTaskReference(String corporateActionsRetrieveActionTaskReference) {
    this.corporateActionsRetrieveActionTaskReference = corporateActionsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateActionsRetrieveActionResponse
  **/

  public String getCorporateActionsRetrieveActionResponse() {
    return corporateActionsRetrieveActionResponse;
  }

  public void setCorporateActionsRetrieveActionResponse(String corporateActionsRetrieveActionResponse) {
    this.corporateActionsRetrieveActionResponse = corporateActionsRetrieveActionResponse;
  }


  /**
   * Get corporateActionsInstanceReport
   * @return corporateActionsInstanceReport
  **/

  public BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceReport getCorporateActionsInstanceReport() {
    return corporateActionsInstanceReport;
  }

  public void setCorporateActionsInstanceReport(BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceReport corporateActionsInstanceReport) {
    this.corporateActionsInstanceReport = corporateActionsInstanceReport;
  }


  /**
   * Get corporateActionsInstanceAnalysis
   * @return corporateActionsInstanceAnalysis
  **/

  public BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceAnalysis getCorporateActionsInstanceAnalysis() {
    return corporateActionsInstanceAnalysis;
  }

  public void setCorporateActionsInstanceAnalysis(BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceAnalysis corporateActionsInstanceAnalysis) {
    this.corporateActionsInstanceAnalysis = corporateActionsInstanceAnalysis;
  }


}

