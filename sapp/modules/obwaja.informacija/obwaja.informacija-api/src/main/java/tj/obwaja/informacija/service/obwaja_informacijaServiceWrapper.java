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

package tj.obwaja.informacija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link obwaja_informacijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacijaService
 * @generated
 */
@ProviderType
public class obwaja_informacijaServiceWrapper
	implements obwaja_informacijaService,
		ServiceWrapper<obwaja_informacijaService> {
	public obwaja_informacijaServiceWrapper(
		obwaja_informacijaService obwaja_informacijaService) {
		_obwaja_informacijaService = obwaja_informacijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _obwaja_informacijaService.getOSGiServiceIdentifier();
	}

	@Override
	public obwaja_informacijaService getWrappedService() {
		return _obwaja_informacijaService;
	}

	@Override
	public void setWrappedService(
		obwaja_informacijaService obwaja_informacijaService) {
		_obwaja_informacijaService = obwaja_informacijaService;
	}

	private obwaja_informacijaService _obwaja_informacijaService;
}