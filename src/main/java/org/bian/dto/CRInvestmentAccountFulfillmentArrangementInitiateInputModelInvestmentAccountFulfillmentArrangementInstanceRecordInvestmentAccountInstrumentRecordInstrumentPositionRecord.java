package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentPositionRecord
 */
public class CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentPositionRecord   {
  private String instrumentPositionLimitType = null;

  private String instrumentPositionLimitSettings = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position maintained for the account (e.g. min/max holdings,) 
   * @return instrumentPositionLimitType
  **/

  public String getInstrumentPositionLimitType() {
    return instrumentPositionLimitType;
  }

  public void setInstrumentPositionLimitType(String instrumentPositionLimitType) {
    this.instrumentPositionLimitType = instrumentPositionLimitType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules 
   * @return instrumentPositionLimitSettings
  **/

  public String getInstrumentPositionLimitSettings() {
    return instrumentPositionLimitSettings;
  }

  public void setInstrumentPositionLimitSettings(String instrumentPositionLimitSettings) {
    this.instrumentPositionLimitSettings = instrumentPositionLimitSettings;
  }


}

