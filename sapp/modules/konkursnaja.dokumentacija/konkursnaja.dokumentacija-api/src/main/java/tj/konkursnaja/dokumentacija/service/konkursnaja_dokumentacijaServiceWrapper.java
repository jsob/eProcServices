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

package tj.konkursnaja.dokumentacija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link konkursnaja_dokumentacijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see konkursnaja_dokumentacijaService
 * @generated
 */
@ProviderType
public class konkursnaja_dokumentacijaServiceWrapper
	implements konkursnaja_dokumentacijaService,
		ServiceWrapper<konkursnaja_dokumentacijaService> {
	public konkursnaja_dokumentacijaServiceWrapper(
		konkursnaja_dokumentacijaService konkursnaja_dokumentacijaService) {
		_konkursnaja_dokumentacijaService = konkursnaja_dokumentacijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _konkursnaja_dokumentacijaService.getOSGiServiceIdentifier();
	}

	@Override
	public konkursnaja_dokumentacijaService getWrappedService() {
		return _konkursnaja_dokumentacijaService;
	}

	@Override
	public void setWrappedService(
		konkursnaja_dokumentacijaService konkursnaja_dokumentacijaService) {
		_konkursnaja_dokumentacijaService = konkursnaja_dokumentacijaService;
	}

	private konkursnaja_dokumentacijaService _konkursnaja_dokumentacijaService;
}