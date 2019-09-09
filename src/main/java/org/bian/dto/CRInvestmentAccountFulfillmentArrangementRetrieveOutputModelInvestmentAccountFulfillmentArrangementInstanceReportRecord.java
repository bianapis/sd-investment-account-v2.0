package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRInvestmentAccountFulfillmentArrangementRetrieveOutputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord   {
  private String investmentAccountFulfillmentArrangementInstanceReportData = null;

  private String investmentAccountFulfillmentArrangementInstanceReportType = null;

  private Object investmentAccountFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return investmentAccountFulfillmentArrangementInstanceReportData
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReportData() {
    return investmentAccountFulfillmentArrangementInstanceReportData;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReportData(String investmentAccountFulfillmentArrangementInstanceReportData) {
    this.investmentAccountFulfillmentArrangementInstanceReportData = investmentAccountFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return investmentAccountFulfillmentArrangementInstanceReportType
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReportType() {
    return investmentAccountFulfillmentArrangementInstanceReportType;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReportType(String investmentAccountFulfillmentArrangementInstanceReportType) {
    this.investmentAccountFulfillmentArrangementInstanceReportType = investmentAccountFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return investmentAccountFulfillmentArrangementInstanceReport
  **/

  public Object getInvestmentAccountFulfillmentArrangementInstanceReport() {
    return investmentAccountFulfillmentArrangementInstanceReport;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReport(Object investmentAccountFulfillmentArrangementInstanceReport) {
    this.investmentAccountFulfillmentArrangementInstanceReport = investmentAccountFulfillmentArrangementInstanceReport;
  }


}

