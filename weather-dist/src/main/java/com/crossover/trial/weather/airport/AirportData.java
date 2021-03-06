package com.crossover.trial.weather.airport;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.crossover.trial.weather.atmosphere.AtmosphericInformation;

/**
 * Basic airport information.
 *
 * @author code test administrator
 */
public class AirportData {

    /** the three letter IATA code */
    private String iata;

    /** latitude value in degrees */
    private double latitude;

    /** longitude value in degrees */
    private double longitude;

    private AtmosphericInformation atmosphericInformation;

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
    }

    @Override
    public final boolean equals(Object other) {
        if (other instanceof AirportData) {
            return new EqualsBuilder().append(this.getIata(), ((AirportData) other).getIata()).isEquals();
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder().append(getIata()).toHashCode();
    }

    public AtmosphericInformation getAtmosphericInformation() {
        return atmosphericInformation;
    }

    public void setAtmosphericInformation(AtmosphericInformation atmosphericInformation) {
        this.atmosphericInformation = atmosphericInformation;
    }
}
