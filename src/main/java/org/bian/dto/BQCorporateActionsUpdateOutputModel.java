package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsUpdateOutputModel
 */
public class BQCorporateActionsUpdateOutputModel   {
  private String corporateActionsUpdateActionTaskReference = null;

  private Object corporateActionsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateActionsUpdateActionTaskReference
  **/

  public String getCorporateActionsUpdateActionTaskReference() {
    return corporateActionsUpdateActionTaskReference;
  }

  public void setCorporateActionsUpdateActionTaskReference(String corporateActionsUpdateActionTaskReference) {
    this.corporateActionsUpdateActionTaskReference = corporateActionsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateActionsUpdateActionTaskRecord
  **/

  public Object getCorporateActionsUpdateActionTaskRecord() {
    return corporateActionsUpdateActionTaskRecord;
  }

  public void setCorporateActionsUpdateActionTaskRecord(Object corporateActionsUpdateActionTaskRecord) {
    this.corporateActionsUpdateActionTaskRecord = corporateActionsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

