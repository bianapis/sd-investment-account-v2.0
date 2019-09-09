package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecordCorporateActionTransaction;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecord
 */
public class BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecord   {
  private BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecordCorporateActionTransaction corporateActionTransaction = null;


  /**
   * Get corporateActionTransaction
   * @return corporateActionTransaction
  **/

  public BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecordCorporateActionTransaction getCorporateActionTransaction() {
    return corporateActionTransaction;
  }

  public void setCorporateActionTransaction(BQCorporateActionsExecuteOutputModelCorporateActionsInstanceRecordCorporateActionTransaction corporateActionTransaction) {
    this.corporateActionTransaction = corporateActionTransaction;
  }


}

