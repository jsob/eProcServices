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

package tj.ne.sostojavshiesja.zakazy.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ne_sostojavshiesja_zakazyService}.
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazyService
 * @generated
 */
@ProviderType
public class ne_sostojavshiesja_zakazyServiceWrapper
	implements ne_sostojavshiesja_zakazyService,
		ServiceWrapper<ne_sostojavshiesja_zakazyService> {
	public ne_sostojavshiesja_zakazyServiceWrapper(
		ne_sostojavshiesja_zakazyService ne_sostojavshiesja_zakazyService) {
		_ne_sostojavshiesja_zakazyService = ne_sostojavshiesja_zakazyService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ne_sostojavshiesja_zakazyService.getOSGiServiceIdentifier();
	}

	@Override
	public ne_sostojavshiesja_zakazyService getWrappedService() {
		return _ne_sostojavshiesja_zakazyService;
	}

	@Override
	public void setWrappedService(
		ne_sostojavshiesja_zakazyService ne_sostojavshiesja_zakazyService) {
		_ne_sostojavshiesja_zakazyService = ne_sostojavshiesja_zakazyService;
	}

	private ne_sostojavshiesja_zakazyService _ne_sostojavshiesja_zakazyService;
}