package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceAnalysis   {
  private String investmentAccountFulfillmentArrangementInstanceAnalysisData = null;

  private String investmentAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object investmentAccountFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return investmentAccountFulfillmentArrangementInstanceAnalysisData
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceAnalysisData() {
    return investmentAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysisData(String investmentAccountFulfillmentArrangementInstanceAnalysisData) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysisData = investmentAccountFulfillmentArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return investmentAccountFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getInvestmentAccountFulfillmentArrangementInstanceAnalysisReport() {
    return investmentAccountFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceAnalysisReport(Object investmentAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.investmentAccountFulfillmentArrangementInstanceAnalysisReport = investmentAccountFulfillmentArrangementInstanceAnalysisReport;
  }


}

