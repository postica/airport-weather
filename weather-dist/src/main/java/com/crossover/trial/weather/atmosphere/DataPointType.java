package com.crossover.trial.weather.atmosphere;

/**
 * The various types of data points we can collect.
 *
 * @author code test administrator
 */
public enum DataPointType {
    WIND(new AtmosphericInformationUpdater.Builder().updating(AtmosphericInformation::setWind)
            .withMeanLessThan(Double.POSITIVE_INFINITY).build()), 
    TEMPERATURE(new AtmosphericInformationUpdater.Builder().updating(AtmosphericInformation::setTemperature)
            .withMeanFrom(-50).build()), 
    HUMIDTY(new AtmosphericInformationUpdater.Builder().updating(AtmosphericInformation::setHumidity).build()), 
    PRESSURE(new AtmosphericInformationUpdater.Builder().updating(AtmosphericInformation::setPressure)
            .withMeanFrom(650).withMeanLessThan(800).build()), 
    CLOUDCOVER(new AtmosphericInformationUpdater.Builder().updating(AtmosphericInformation::setCloudCover).build()), 
    PRECIPITATION(new AtmosphericInformationUpdater.Builder().updating(AtmosphericInformation::setPrecipitation).build());

    private final transient AtmosphericInformationUpdater updater;

    private DataPointType(AtmosphericInformationUpdater updater) {
        this.updater = updater;
    }

    public void update(AtmosphericInformation ai, DataPoint dp) {
        updater.updateAtmosphericInformation(ai, dp);
    }
}
