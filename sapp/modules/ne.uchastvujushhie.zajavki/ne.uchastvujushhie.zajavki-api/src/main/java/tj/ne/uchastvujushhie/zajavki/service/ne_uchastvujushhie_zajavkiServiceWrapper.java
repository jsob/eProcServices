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

package tj.ne.uchastvujushhie.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ne_uchastvujushhie_zajavkiService}.
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavkiService
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiServiceWrapper
	implements ne_uchastvujushhie_zajavkiService,
		ServiceWrapper<ne_uchastvujushhie_zajavkiService> {
	public ne_uchastvujushhie_zajavkiServiceWrapper(
		ne_uchastvujushhie_zajavkiService ne_uchastvujushhie_zajavkiService) {
		_ne_uchastvujushhie_zajavkiService = ne_uchastvujushhie_zajavkiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ne_uchastvujushhie_zajavkiService.getOSGiServiceIdentifier();
	}

	@Override
	public ne_uchastvujushhie_zajavkiService getWrappedService() {
		return _ne_uchastvujushhie_zajavkiService;
	}

	@Override
	public void setWrappedService(
		ne_uchastvujushhie_zajavkiService ne_uchastvujushhie_zajavkiService) {
		_ne_uchastvujushhie_zajavkiService = ne_uchastvujushhie_zajavkiService;
	}

	private ne_uchastvujushhie_zajavkiService _ne_uchastvujushhie_zajavkiService;
}