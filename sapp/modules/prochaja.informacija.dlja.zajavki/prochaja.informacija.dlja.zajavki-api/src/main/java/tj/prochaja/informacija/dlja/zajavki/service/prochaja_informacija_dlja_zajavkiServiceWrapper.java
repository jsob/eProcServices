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

package tj.prochaja.informacija.dlja.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link prochaja_informacija_dlja_zajavkiService}.
 *
 * @author Brian Wing Shun Chan
 * @see prochaja_informacija_dlja_zajavkiService
 * @generated
 */
@ProviderType
public class prochaja_informacija_dlja_zajavkiServiceWrapper
	implements prochaja_informacija_dlja_zajavkiService,
		ServiceWrapper<prochaja_informacija_dlja_zajavkiService> {
	public prochaja_informacija_dlja_zajavkiServiceWrapper(
		prochaja_informacija_dlja_zajavkiService prochaja_informacija_dlja_zajavkiService) {
		_prochaja_informacija_dlja_zajavkiService = prochaja_informacija_dlja_zajavkiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _prochaja_informacija_dlja_zajavkiService.getOSGiServiceIdentifier();
	}

	@Override
	public prochaja_informacija_dlja_zajavkiService getWrappedService() {
		return _prochaja_informacija_dlja_zajavkiService;
	}

	@Override
	public void setWrappedService(
		prochaja_informacija_dlja_zajavkiService prochaja_informacija_dlja_zajavkiService) {
		_prochaja_informacija_dlja_zajavkiService = prochaja_informacija_dlja_zajavkiService;
	}

	private prochaja_informacija_dlja_zajavkiService _prochaja_informacija_dlja_zajavkiService;
}