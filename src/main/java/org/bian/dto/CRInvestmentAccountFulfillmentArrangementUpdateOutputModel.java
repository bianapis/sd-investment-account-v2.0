package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementUpdateOutputModel
 */
public class CRInvestmentAccountFulfillmentArrangementUpdateOutputModel   {
  private CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;

  private String investmentAccountFulfillmentArrangementUpdateActionTaskReference = null;

  private Object investmentAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get investmentAccountFulfillmentArrangementInstanceRecord
   * @return investmentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(CRInvestmentAccountFulfillmentArrangementUpdateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
    this.investmentAccountFulfillmentArrangementInstanceRecord = investmentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return investmentAccountFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getInvestmentAccountFulfillmentArrangementUpdateActionTaskReference() {
    return investmentAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setInvestmentAccountFulfillmentArrangementUpdateActionTaskReference(String investmentAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.investmentAccountFulfillmentArrangementUpdateActionTaskReference = investmentAccountFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return investmentAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getInvestmentAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return investmentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementUpdateActionTaskRecord(Object investmentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.investmentAccountFulfillmentArrangementUpdateActionTaskRecord = investmentAccountFulfillmentArrangementUpdateActionTaskRecord;
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

