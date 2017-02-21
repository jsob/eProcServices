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

package tj.otpravlennye.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link otpravlennye_zajavkiService}.
 *
 * @author Brian Wing Shun Chan
 * @see otpravlennye_zajavkiService
 * @generated
 */
@ProviderType
public class otpravlennye_zajavkiServiceWrapper
	implements otpravlennye_zajavkiService,
		ServiceWrapper<otpravlennye_zajavkiService> {
	public otpravlennye_zajavkiServiceWrapper(
		otpravlennye_zajavkiService otpravlennye_zajavkiService) {
		_otpravlennye_zajavkiService = otpravlennye_zajavkiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _otpravlennye_zajavkiService.getOSGiServiceIdentifier();
	}

	@Override
	public otpravlennye_zajavkiService getWrappedService() {
		return _otpravlennye_zajavkiService;
	}

	@Override
	public void setWrappedService(
		otpravlennye_zajavkiService otpravlennye_zajavkiService) {
		_otpravlennye_zajavkiService = otpravlennye_zajavkiService;
	}

	private otpravlennye_zajavkiService _otpravlennye_zajavkiService;
}