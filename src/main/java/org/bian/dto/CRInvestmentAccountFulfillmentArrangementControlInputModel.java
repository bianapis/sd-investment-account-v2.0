package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementControlInputModelInvestmentAccountFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementControlInputModel
 */
public class CRInvestmentAccountFulfillmentArrangementControlInputModel   {
  private String investmentAccountServicingSessionReference = null;

  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private Object investmentAccountFulfillmentArrangementControlActionTaskRecord = null;

  private CRInvestmentAccountFulfillmentArrangementControlInputModelInvestmentAccountFulfillmentArrangementControlActionRequest investmentAccountFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return investmentAccountServicingSessionReference
  **/

  public String getInvestmentAccountServicingSessionReference() {
    return investmentAccountServicingSessionReference;
  }

  public void setInvestmentAccountServicingSessionReference(String investmentAccountServicingSessionReference) {
    this.investmentAccountServicingSessionReference = investmentAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Investment Account Fulfillment Arrangement instance 
   * @return investmentAccountFulfillmentArrangementInstanceReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReference() {
    return investmentAccountFulfillmentArrangementInstanceReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReference(String investmentAccountFulfillmentArrangementInstanceReference) {
    this.investmentAccountFulfillmentArrangementInstanceReference = investmentAccountFulfillmentArrangementInstanceReference;
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
   * Get investmentAccountFulfillmentArrangementControlActionRequest
   * @return investmentAccountFulfillmentArrangementControlActionRequest
  **/

  public CRInvestmentAccountFulfillmentArrangementControlInputModelInvestmentAccountFulfillmentArrangementControlActionRequest getInvestmentAccountFulfillmentArrangementControlActionRequest() {
    return investmentAccountFulfillmentArrangementControlActionRequest;
  }

  public void setInvestmentAccountFulfillmentArrangementControlActionRequest(CRInvestmentAccountFulfillmentArrangementControlInputModelInvestmentAccountFulfillmentArrangementControlActionRequest investmentAccountFulfillmentArrangementControlActionRequest) {
    this.investmentAccountFulfillmentArrangementControlActionRequest = investmentAccountFulfillmentArrangementControlActionRequest;
  }


}

