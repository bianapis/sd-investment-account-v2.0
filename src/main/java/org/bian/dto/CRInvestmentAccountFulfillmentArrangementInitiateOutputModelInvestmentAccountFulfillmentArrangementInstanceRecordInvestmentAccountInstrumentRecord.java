package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentProcessingSchedule;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentPositionRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord
 */
public class CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord   {
  private String instrumentType = null;

  private String instrumentReference = null;

  private String tradingMarketplaceReference = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentPositionRecord instrumentPositionRecord = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentProcessingSchedule instrumentProcessingSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the type of investment instrument being tracked (e.g. equity, commodity, FX/MM, derivative) 
   * @return instrumentType
  **/

  public String getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The specific instrument trading identifier (e.g. NASDAQ Id) 
   * @return instrumentReference
  **/

  public String getInstrumentReference() {
    return instrumentReference;
  }

  public void setInstrumentReference(String instrumentReference) {
    this.instrumentReference = instrumentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the market where the instrument is quoted/traded (e.g. ISE Equities Marketplace) 
   * @return tradingMarketplaceReference
  **/

  public String getTradingMarketplaceReference() {
    return tradingMarketplaceReference;
  }

  public void setTradingMarketplaceReference(String tradingMarketplaceReference) {
    this.tradingMarketplaceReference = tradingMarketplaceReference;
  }


  /**
   * Get instrumentPositionRecord
   * @return instrumentPositionRecord
  **/

  public CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentPositionRecord getInstrumentPositionRecord() {
    return instrumentPositionRecord;
  }

  public void setInstrumentPositionRecord(CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentPositionRecord instrumentPositionRecord) {
    this.instrumentPositionRecord = instrumentPositionRecord;
  }


  /**
   * Get instrumentProcessingSchedule
   * @return instrumentProcessingSchedule
  **/

  public CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentProcessingSchedule getInstrumentProcessingSchedule() {
    return instrumentProcessingSchedule;
  }

  public void setInstrumentProcessingSchedule(CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentProcessingSchedule instrumentProcessingSchedule) {
    this.instrumentProcessingSchedule = instrumentProcessingSchedule;
  }


}

