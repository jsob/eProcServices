/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.edinicy.izmerenija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link edinicy_izmerenijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenijaService
 * @generated
 */
@ProviderType
public class edinicy_izmerenijaServiceWrapper
	implements edinicy_izmerenijaService,
		ServiceWrapper<edinicy_izmerenijaService> {
	public edinicy_izmerenijaServiceWrapper(
		edinicy_izmerenijaService edinicy_izmerenijaService) {
		_edinicy_izmerenijaService = edinicy_izmerenijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _edinicy_izmerenijaService.getOSGiServiceIdentifier();
	}

	@Override
	public edinicy_izmerenijaService getWrappedService() {
		return _edinicy_izmerenijaService;
	}

	@Override
	public void setWrappedService(
		edinicy_izmerenijaService edinicy_izmerenijaService) {
		_edinicy_izmerenijaService = edinicy_izmerenijaService;
	}

	private edinicy_izmerenijaService _edinicy_izmerenijaService;
}