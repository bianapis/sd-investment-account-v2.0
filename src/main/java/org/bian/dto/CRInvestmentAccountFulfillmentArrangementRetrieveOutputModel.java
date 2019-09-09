package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel
 */
public class CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel   {
  private CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord = null;

  private String investmentAccountFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object investmentAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String investmentAccountFulfillmentArrangementRetrieveActionResponse = null;

  private CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord investmentAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis investmentAccountFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get investmentAccountFulfillmentArrangementInstanceRecord
   * @return investmentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord getInvestmentAccountFulfillmentArrangementInstanceRecord() {
    return investmentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceRecord(CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord investmentAccountFulfillmentArrangementInstanceRecord) {
    this.investmentAccountFulfillmentArrangementInstanceRecord = investmentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Investment Account Fulfillment Arrangement instance retrieve service call 
   * @return investmentAccountFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getInvestmentAccountFulfillmentArrangementRetrieveActionTaskReference() {
    return investmentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setInvestmentAccountFulfillmentArrangementRetrieveActionTaskReference(String investmentAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.investmentAccountFulfillmentArrangementRetrieveActionTaskReference = investmentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return investmentAccountFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getInvestmentAccountFulfillmentArrangementRetrieveActionTaskRecord() {
    return investmentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementRetrieveActionTaskRecord(Object investmentAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.investmentAccountFulfillmentArrangementRetrieveActionTaskRecord = investmentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return investmentAccountFulfillmentArrangementRetrieveActionResponse
  **/

  public String getInvestmentAccountFulfillmentArrangementRetrieveActionResponse() {
    return investmentAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public void setInvestmentAccountFulfillmentArrangementRetrieveActionResponse(String investmentAccountFulfillmentArrangementRetrieveActionResponse) {
    this.investmentAccountFulfillmentArrangementRetrieveActionResponse = investmentAccountFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get investmentAccountFulfillmentArrangementInstanceReportRecord
   * @return investmentAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord getInvestmentAccountFulfillmentArrangementInstanceReportRecord() {
    return investmentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReportRecord(CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord investmentAccountFulfillmentArrangementInstanceReportRecord) {
    this.investmentAccountFulfillmentArrangementInstanceReportRecord = investmentAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get investmentAccountFulfillmentArrangementInstanceAnalysis
   * @return investmentAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis getInvestmentAccountFulfillmentArrangementInstanceAnalysis() {
    return investmentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysis(CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis investmentAccountFulfillmentArrangementInstanceAnalysis) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysis = investmentAccountFulfillmentArrangementInstanceAnalysis;
  }


}

