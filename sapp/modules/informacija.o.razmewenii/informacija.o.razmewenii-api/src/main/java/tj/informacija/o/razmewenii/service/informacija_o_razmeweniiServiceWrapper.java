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

package tj.informacija.o.razmewenii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link informacija_o_razmeweniiService}.
 *
 * @author Brian Wing Shun Chan
 * @see informacija_o_razmeweniiService
 * @generated
 */
@ProviderType
public class informacija_o_razmeweniiServiceWrapper
	implements informacija_o_razmeweniiService,
		ServiceWrapper<informacija_o_razmeweniiService> {
	public informacija_o_razmeweniiServiceWrapper(
		informacija_o_razmeweniiService informacija_o_razmeweniiService) {
		_informacija_o_razmeweniiService = informacija_o_razmeweniiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _informacija_o_razmeweniiService.getOSGiServiceIdentifier();
	}

	@Override
	public informacija_o_razmeweniiService getWrappedService() {
		return _informacija_o_razmeweniiService;
	}

	@Override
	public void setWrappedService(
		informacija_o_razmeweniiService informacija_o_razmeweniiService) {
		_informacija_o_razmeweniiService = informacija_o_razmeweniiService;
	}

	private informacija_o_razmeweniiService _informacija_o_razmeweniiService;
}