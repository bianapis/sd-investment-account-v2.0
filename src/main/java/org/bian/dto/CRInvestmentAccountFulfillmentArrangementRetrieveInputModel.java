package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementRetrieveInputModel
 */
public class CRInvestmentAccountFulfillmentArrangementRetrieveInputModel   {
  private Object investmentAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String investmentAccountFulfillmentArrangementRetrieveActionRequest = null;

  private CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord investmentAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis investmentAccountFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return investmentAccountFulfillmentArrangementRetrieveActionRequest
  **/

  public String getInvestmentAccountFulfillmentArrangementRetrieveActionRequest() {
    return investmentAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public void setInvestmentAccountFulfillmentArrangementRetrieveActionRequest(String investmentAccountFulfillmentArrangementRetrieveActionRequest) {
    this.investmentAccountFulfillmentArrangementRetrieveActionRequest = investmentAccountFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get investmentAccountFulfillmentArrangementInstanceReportRecord
   * @return investmentAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord getInvestmentAccountFulfillmentArrangementInstanceReportRecord() {
    return investmentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReportRecord(CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord investmentAccountFulfillmentArrangementInstanceReportRecord) {
    this.investmentAccountFulfillmentArrangementInstanceReportRecord = investmentAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get investmentAccountFulfillmentArrangementInstanceAnalysis
   * @return investmentAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis getInvestmentAccountFulfillmentArrangementInstanceAnalysis() {
    return investmentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysis(CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis investmentAccountFulfillmentArrangementInstanceAnalysis) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysis = investmentAccountFulfillmentArrangementInstanceAnalysis;
  }


}

