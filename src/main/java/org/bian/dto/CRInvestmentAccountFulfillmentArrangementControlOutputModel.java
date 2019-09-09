package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementControlOutputModel
 */
public class CRInvestmentAccountFulfillmentArrangementControlOutputModel   {
  private String investmentAccountFulfillmentArrangementControlActionTaskReference = null;

  private Object investmentAccountFulfillmentArrangementControlActionTaskRecord = null;

  private String investmentAccountFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Investment Account Fulfillment Arrangement instance control processing service call 
   * @return investmentAccountFulfillmentArrangementControlActionTaskReference
  **/

  public String getInvestmentAccountFulfillmentArrangementControlActionTaskReference() {
    return investmentAccountFulfillmentArrangementControlActionTaskReference;
  }

  public void setInvestmentAccountFulfillmentArrangementControlActionTaskReference(String investmentAccountFulfillmentArrangementControlActionTaskReference) {
    this.investmentAccountFulfillmentArrangementControlActionTaskReference = investmentAccountFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return investmentAccountFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getInvestmentAccountFulfillmentArrangementControlActionTaskRecord() {
    return investmentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementControlActionTaskRecord(Object investmentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.investmentAccountFulfillmentArrangementControlActionTaskRecord = investmentAccountFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return investmentAccountFulfillmentArrangementControlActionResponse
  **/

  public String getInvestmentAccountFulfillmentArrangementControlActionResponse() {
    return investmentAccountFulfillmentArrangementControlActionResponse;
  }

  public void setInvestmentAccountFulfillmentArrangementControlActionResponse(String investmentAccountFulfillmentArrangementControlActionResponse) {
    this.investmentAccountFulfillmentArrangementControlActionResponse = investmentAccountFulfillmentArrangementControlActionResponse;
  }


}

