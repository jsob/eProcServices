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

package tj.porjadok.raboty.komissii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link porjadok_raboty_komissiiService}.
 *
 * @author Brian Wing Shun Chan
 * @see porjadok_raboty_komissiiService
 * @generated
 */
@ProviderType
public class porjadok_raboty_komissiiServiceWrapper
	implements porjadok_raboty_komissiiService,
		ServiceWrapper<porjadok_raboty_komissiiService> {
	public porjadok_raboty_komissiiServiceWrapper(
		porjadok_raboty_komissiiService porjadok_raboty_komissiiService) {
		_porjadok_raboty_komissiiService = porjadok_raboty_komissiiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _porjadok_raboty_komissiiService.getOSGiServiceIdentifier();
	}

	@Override
	public porjadok_raboty_komissiiService getWrappedService() {
		return _porjadok_raboty_komissiiService;
	}

	@Override
	public void setWrappedService(
		porjadok_raboty_komissiiService porjadok_raboty_komissiiService) {
		_porjadok_raboty_komissiiService = porjadok_raboty_komissiiService;
	}

	private porjadok_raboty_komissiiService _porjadok_raboty_komissiiService;
}