/* *********************************************************************** *
 * project: org.matsim.*
 * DgRunCreateFlightScenario
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2012 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */
package org.matsim.air.scripts;

import org.matsim.air.scenario.DgCreateDgFlightScenario;



/**
 * @author dgrether
 *
 */
public class DgRunCreateFlightScenario {

	/**
	 * Separate main due to eclipse compile problems
	 */
	public static void main(String[] args) throws Exception {
		new DgCreateDgFlightScenario().createFlightScenarios();
	}

}
