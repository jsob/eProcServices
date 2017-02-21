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

package tj.oplachennye.zakazy.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link oplachennye_zakazyService}.
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazyService
 * @generated
 */
@ProviderType
public class oplachennye_zakazyServiceWrapper
	implements oplachennye_zakazyService,
		ServiceWrapper<oplachennye_zakazyService> {
	public oplachennye_zakazyServiceWrapper(
		oplachennye_zakazyService oplachennye_zakazyService) {
		_oplachennye_zakazyService = oplachennye_zakazyService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _oplachennye_zakazyService.getOSGiServiceIdentifier();
	}

	@Override
	public oplachennye_zakazyService getWrappedService() {
		return _oplachennye_zakazyService;
	}

	@Override
	public void setWrappedService(
		oplachennye_zakazyService oplachennye_zakazyService) {
		_oplachennye_zakazyService = oplachennye_zakazyService;
	}

	private oplachennye_zakazyService _oplachennye_zakazyService;
}