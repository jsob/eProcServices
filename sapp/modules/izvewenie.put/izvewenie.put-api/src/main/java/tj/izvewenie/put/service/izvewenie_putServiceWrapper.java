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

package tj.izvewenie.put.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link izvewenie_putService}.
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_putService
 * @generated
 */
@ProviderType
public class izvewenie_putServiceWrapper implements izvewenie_putService,
	ServiceWrapper<izvewenie_putService> {
	public izvewenie_putServiceWrapper(
		izvewenie_putService izvewenie_putService) {
		_izvewenie_putService = izvewenie_putService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _izvewenie_putService.getOSGiServiceIdentifier();
	}

	@Override
	public izvewenie_putService getWrappedService() {
		return _izvewenie_putService;
	}

	@Override
	public void setWrappedService(izvewenie_putService izvewenie_putService) {
		_izvewenie_putService = izvewenie_putService;
	}

	private izvewenie_putService _izvewenie_putService;
}