package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsExecuteOutputModel
 */
public class BQCorporateActionsExecuteOutputModel   {
  private BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord = null;

  private String corporateActionsExecuteActionTaskReference = null;

  private Object corporateActionsExecuteActionTaskRecord = null;

  private String corporateActionsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get corporateActionsInstanceRecord
   * @return corporateActionsInstanceRecord
  **/

  public BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecord getCorporateActionsInstanceRecord() {
    return corporateActionsInstanceRecord;
  }

  public void setCorporateActionsInstanceRecord(BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord) {
    this.corporateActionsInstanceRecord = corporateActionsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Actions instance execute service call 
   * @return corporateActionsExecuteActionTaskReference
  **/

  public String getCorporateActionsExecuteActionTaskReference() {
    return corporateActionsExecuteActionTaskReference;
  }

  public void setCorporateActionsExecuteActionTaskReference(String corporateActionsExecuteActionTaskReference) {
    this.corporateActionsExecuteActionTaskReference = corporateActionsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return corporateActionsExecuteActionTaskRecord
  **/

  public Object getCorporateActionsExecuteActionTaskRecord() {
    return corporateActionsExecuteActionTaskRecord;
  }

  public void setCorporateActionsExecuteActionTaskRecord(Object corporateActionsExecuteActionTaskRecord) {
    this.corporateActionsExecuteActionTaskRecord = corporateActionsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Actions execute transaction/record 
   * @return corporateActionsExecuteRecordReference
  **/

  public String getCorporateActionsExecuteRecordReference() {
    return corporateActionsExecuteRecordReference;
  }

  public void setCorporateActionsExecuteRecordReference(String corporateActionsExecuteRecordReference) {
    this.corporateActionsExecuteRecordReference = corporateActionsExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

