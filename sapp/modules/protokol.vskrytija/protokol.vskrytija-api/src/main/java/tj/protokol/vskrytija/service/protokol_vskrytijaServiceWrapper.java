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

package tj.protokol.vskrytija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link protokol_vskrytijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytijaService
 * @generated
 */
@ProviderType
public class protokol_vskrytijaServiceWrapper
	implements protokol_vskrytijaService,
		ServiceWrapper<protokol_vskrytijaService> {
	public protokol_vskrytijaServiceWrapper(
		protokol_vskrytijaService protokol_vskrytijaService) {
		_protokol_vskrytijaService = protokol_vskrytijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protokol_vskrytijaService.getOSGiServiceIdentifier();
	}

	@Override
	public protokol_vskrytijaService getWrappedService() {
		return _protokol_vskrytijaService;
	}

	@Override
	public void setWrappedService(
		protokol_vskrytijaService protokol_vskrytijaService) {
		_protokol_vskrytijaService = protokol_vskrytijaService;
	}

	private protokol_vskrytijaService _protokol_vskrytijaService;
}