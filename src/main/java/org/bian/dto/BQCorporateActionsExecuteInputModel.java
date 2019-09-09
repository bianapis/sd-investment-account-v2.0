package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorporateActionsExecuteInputModelCorporateActionsInstanceRecord;
import org.bian.dto.BQDepositsandWithdrawalsExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsExecuteInputModel
 */
public class BQCorporateActionsExecuteInputModel   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String corporateActionsInstanceReference = null;

  private BQCorporateActionsExecuteInputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord = null;

  private Object corporateActionsExecuteActionTaskRecord = null;

  private BQDepositsandWithdrawalsExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Investment Account Fulfillment Arrangement instance 
   * @return investmentAccountFulfillmentArrangementInstanceReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReference() {
    return investmentAccountFulfillmentArrangementInstanceReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReference(String investmentAccountFulfillmentArrangementInstanceReference) {
    this.investmentAccountFulfillmentArrangementInstanceReference = investmentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Actions instance 
   * @return corporateActionsInstanceReference
  **/

  public String getCorporateActionsInstanceReference() {
    return corporateActionsInstanceReference;
  }

  public void setCorporateActionsInstanceReference(String corporateActionsInstanceReference) {
    this.corporateActionsInstanceReference = corporateActionsInstanceReference;
  }


  /**
   * Get corporateActionsInstanceRecord
   * @return corporateActionsInstanceRecord
  **/

  public BQCorporateActionsExecuteInputModelCorporateActionsInstanceRecord getCorporateActionsInstanceRecord() {
    return corporateActionsInstanceRecord;
  }

  public void setCorporateActionsInstanceRecord(BQCorporateActionsExecuteInputModelCorporateActionsInstanceRecord corporateActionsInstanceRecord) {
    this.corporateActionsInstanceRecord = corporateActionsInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQDepositsandWithdrawalsExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQDepositsandWithdrawalsExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

