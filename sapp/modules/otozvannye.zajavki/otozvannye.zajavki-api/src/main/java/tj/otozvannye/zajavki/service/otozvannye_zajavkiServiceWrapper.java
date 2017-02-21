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

package tj.otozvannye.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link otozvannye_zajavkiService}.
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavkiService
 * @generated
 */
@ProviderType
public class otozvannye_zajavkiServiceWrapper
	implements otozvannye_zajavkiService,
		ServiceWrapper<otozvannye_zajavkiService> {
	public otozvannye_zajavkiServiceWrapper(
		otozvannye_zajavkiService otozvannye_zajavkiService) {
		_otozvannye_zajavkiService = otozvannye_zajavkiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _otozvannye_zajavkiService.getOSGiServiceIdentifier();
	}

	@Override
	public otozvannye_zajavkiService getWrappedService() {
		return _otozvannye_zajavkiService;
	}

	@Override
	public void setWrappedService(
		otozvannye_zajavkiService otozvannye_zajavkiService) {
		_otozvannye_zajavkiService = otozvannye_zajavkiService;
	}

	private otozvannye_zajavkiService _otozvannye_zajavkiService;
}