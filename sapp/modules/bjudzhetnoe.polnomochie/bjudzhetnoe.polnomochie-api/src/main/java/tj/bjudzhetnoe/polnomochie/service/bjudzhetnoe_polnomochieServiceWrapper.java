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

package tj.bjudzhetnoe.polnomochie.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bjudzhetnoe_polnomochieService}.
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochieService
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochieServiceWrapper
	implements bjudzhetnoe_polnomochieService,
		ServiceWrapper<bjudzhetnoe_polnomochieService> {
	public bjudzhetnoe_polnomochieServiceWrapper(
		bjudzhetnoe_polnomochieService bjudzhetnoe_polnomochieService) {
		_bjudzhetnoe_polnomochieService = bjudzhetnoe_polnomochieService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bjudzhetnoe_polnomochieService.getOSGiServiceIdentifier();
	}

	@Override
	public bjudzhetnoe_polnomochieService getWrappedService() {
		return _bjudzhetnoe_polnomochieService;
	}

	@Override
	public void setWrappedService(
		bjudzhetnoe_polnomochieService bjudzhetnoe_polnomochieService) {
		_bjudzhetnoe_polnomochieService = bjudzhetnoe_polnomochieService;
	}

	private bjudzhetnoe_polnomochieService _bjudzhetnoe_polnomochieService;
}