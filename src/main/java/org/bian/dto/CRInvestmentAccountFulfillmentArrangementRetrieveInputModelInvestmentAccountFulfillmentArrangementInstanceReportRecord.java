package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRInvestmentAccountFulfillmentArrangementRetrieveInputModelInvestmentAccountFulfillmentArrangementInstanceReportRecord   {
  private String investmentAccountFulfillmentArrangementInstanceReportReference = null;

  private String investmentAccountFulfillmentArrangementInstanceReportType = null;

  private String investmentAccountFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return investmentAccountFulfillmentArrangementInstanceReportReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReportReference() {
    return investmentAccountFulfillmentArrangementInstanceReportReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReportReference(String investmentAccountFulfillmentArrangementInstanceReportReference) {
    this.investmentAccountFulfillmentArrangementInstanceReportReference = investmentAccountFulfillmentArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return investmentAccountFulfillmentArrangementInstanceReportParameters
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReportParameters() {
    return investmentAccountFulfillmentArrangementInstanceReportParameters;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReportParameters(String investmentAccountFulfillmentArrangementInstanceReportParameters) {
    this.investmentAccountFulfillmentArrangementInstanceReportParameters = investmentAccountFulfillmentArrangementInstanceReportParameters;
  }


}

