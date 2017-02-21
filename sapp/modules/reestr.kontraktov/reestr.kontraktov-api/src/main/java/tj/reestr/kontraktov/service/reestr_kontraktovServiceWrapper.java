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

package tj.reestr.kontraktov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link reestr_kontraktovService}.
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktovService
 * @generated
 */
@ProviderType
public class reestr_kontraktovServiceWrapper implements reestr_kontraktovService,
	ServiceWrapper<reestr_kontraktovService> {
	public reestr_kontraktovServiceWrapper(
		reestr_kontraktovService reestr_kontraktovService) {
		_reestr_kontraktovService = reestr_kontraktovService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _reestr_kontraktovService.getOSGiServiceIdentifier();
	}

	@Override
	public reestr_kontraktovService getWrappedService() {
		return _reestr_kontraktovService;
	}

	@Override
	public void setWrappedService(
		reestr_kontraktovService reestr_kontraktovService) {
		_reestr_kontraktovService = reestr_kontraktovService;
	}

	private reestr_kontraktovService _reestr_kontraktovService;
}