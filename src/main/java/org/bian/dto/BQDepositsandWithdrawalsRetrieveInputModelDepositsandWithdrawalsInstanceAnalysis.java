package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceAnalysis
 */
public class BQDepositsandWithdrawalsRetrieveInputModelDepositsandWithdrawalsInstanceAnalysis   {
  private String depositsandWithdrawalsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return depositsandWithdrawalsInstanceAnalysisReference
  **/

  public String getDepositsandWithdrawalsInstanceAnalysisReference() {
    return depositsandWithdrawalsInstanceAnalysisReference;
  }

  public void setDepositsandWithdrawalsInstanceAnalysisReference(String depositsandWithdrawalsInstanceAnalysisReference) {
    this.depositsandWithdrawalsInstanceAnalysisReference = depositsandWithdrawalsInstanceAnalysisReference;
  }


}

