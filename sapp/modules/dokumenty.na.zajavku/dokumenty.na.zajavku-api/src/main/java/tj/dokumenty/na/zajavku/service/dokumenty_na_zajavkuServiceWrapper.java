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

package tj.dokumenty.na.zajavku.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link dokumenty_na_zajavkuService}.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuService
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuServiceWrapper
	implements dokumenty_na_zajavkuService,
		ServiceWrapper<dokumenty_na_zajavkuService> {
	public dokumenty_na_zajavkuServiceWrapper(
		dokumenty_na_zajavkuService dokumenty_na_zajavkuService) {
		_dokumenty_na_zajavkuService = dokumenty_na_zajavkuService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dokumenty_na_zajavkuService.getOSGiServiceIdentifier();
	}

	@Override
	public dokumenty_na_zajavkuService getWrappedService() {
		return _dokumenty_na_zajavkuService;
	}

	@Override
	public void setWrappedService(
		dokumenty_na_zajavkuService dokumenty_na_zajavkuService) {
		_dokumenty_na_zajavkuService = dokumenty_na_zajavkuService;
	}

	private dokumenty_na_zajavkuService _dokumenty_na_zajavkuService;
}