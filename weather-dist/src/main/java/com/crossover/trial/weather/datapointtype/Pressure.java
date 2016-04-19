package com.crossover.trial.weather.datapointtype;

import com.crossover.trial.weather.AtmosphericInformation;
import com.crossover.trial.weather.DataPoint;

class Pressure extends AtmosphericInformationUpdater {

	@Override
	protected double getMinimumMean() {
		return 650;
	}

	@Override
	protected double getMaximumMean() {
		return 799;
	}

	@Override
	protected void update(AtmosphericInformation ai, DataPoint dp) {
		ai.setPressure(dp);
	}
	
}