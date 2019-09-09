package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis   {
  private String investmentAccountFulfillmentArrangementInstanceAnalysisReference = null;

  private String investmentAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private String investmentAccountFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return investmentAccountFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceAnalysisReference() {
    return investmentAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysisReference(String investmentAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysisReference = investmentAccountFulfillmentArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return investmentAccountFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return investmentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysisReportType(String investmentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysisReportType = investmentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return investmentAccountFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceAnalysisParameters() {
    return investmentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysisParameters(String investmentAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysisParameters = investmentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }


}

