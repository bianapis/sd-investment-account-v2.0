package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsInitiateInputModelCorporateActionsInstanceRecord
 */
public class BQCorporateActionsInitiateInputModelCorporateActionsInstanceRecord   {
  private String corporateActionType = null;

  private String corporateActionApplicationSchedule = null;

  private String corporateActionInstrumentType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of corporate action that can be applied 
   * @return corporateActionType
  **/

  public String getCorporateActionType() {
    return corporateActionType;
  }

  public void setCorporateActionType(String corporateActionType) {
    this.corporateActionType = corporateActionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing schedule for applying the type of corporate action to the investment account 
   * @return corporateActionApplicationSchedule
  **/

  public String getCorporateActionApplicationSchedule() {
    return corporateActionApplicationSchedule;
  }

  public void setCorporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
    this.corporateActionApplicationSchedule = corporateActionApplicationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The instrument type that the corporate action impacts (will be one that the investment account tracks) 
   * @return corporateActionInstrumentType
  **/

  public String getCorporateActionInstrumentType() {
    return corporateActionInstrumentType;
  }

  public void setCorporateActionInstrumentType(String corporateActionInstrumentType) {
    this.corporateActionInstrumentType = corporateActionInstrumentType;
  }


}

