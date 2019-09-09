package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsRetrieveInputModelCorporateActionsInstanceAnalysis
 */
public class BQCorporateActionsRetrieveInputModelCorporateActionsInstanceAnalysis   {
  private String corporateActionsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateActionsInstanceAnalysisReference
  **/

  public String getCorporateActionsInstanceAnalysisReference() {
    return corporateActionsInstanceAnalysisReference;
  }

  public void setCorporateActionsInstanceAnalysisReference(String corporateActionsInstanceAnalysisReference) {
    this.corporateActionsInstanceAnalysisReference = corporateActionsInstanceAnalysisReference;
  }


}

