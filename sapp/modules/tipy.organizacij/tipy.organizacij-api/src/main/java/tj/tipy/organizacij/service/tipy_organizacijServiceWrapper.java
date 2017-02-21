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

package tj.tipy.organizacij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link tipy_organizacijService}.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacijService
 * @generated
 */
@ProviderType
public class tipy_organizacijServiceWrapper implements tipy_organizacijService,
	ServiceWrapper<tipy_organizacijService> {
	public tipy_organizacijServiceWrapper(
		tipy_organizacijService tipy_organizacijService) {
		_tipy_organizacijService = tipy_organizacijService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tipy_organizacijService.getOSGiServiceIdentifier();
	}

	@Override
	public tipy_organizacijService getWrappedService() {
		return _tipy_organizacijService;
	}

	@Override
	public void setWrappedService(
		tipy_organizacijService tipy_organizacijService) {
		_tipy_organizacijService = tipy_organizacijService;
	}

	private tipy_organizacijService _tipy_organizacijService;
}