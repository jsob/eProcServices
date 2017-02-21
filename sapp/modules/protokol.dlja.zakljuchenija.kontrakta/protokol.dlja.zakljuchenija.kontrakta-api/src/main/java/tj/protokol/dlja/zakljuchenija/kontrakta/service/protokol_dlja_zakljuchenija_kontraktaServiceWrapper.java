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

package tj.protokol.dlja.zakljuchenija.kontrakta.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link protokol_dlja_zakljuchenija_kontraktaService}.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontraktaService
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaServiceWrapper
	implements protokol_dlja_zakljuchenija_kontraktaService,
		ServiceWrapper<protokol_dlja_zakljuchenija_kontraktaService> {
	public protokol_dlja_zakljuchenija_kontraktaServiceWrapper(
		protokol_dlja_zakljuchenija_kontraktaService protokol_dlja_zakljuchenija_kontraktaService) {
		_protokol_dlja_zakljuchenija_kontraktaService = protokol_dlja_zakljuchenija_kontraktaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protokol_dlja_zakljuchenija_kontraktaService.getOSGiServiceIdentifier();
	}

	@Override
	public protokol_dlja_zakljuchenija_kontraktaService getWrappedService() {
		return _protokol_dlja_zakljuchenija_kontraktaService;
	}

	@Override
	public void setWrappedService(
		protokol_dlja_zakljuchenija_kontraktaService protokol_dlja_zakljuchenija_kontraktaService) {
		_protokol_dlja_zakljuchenija_kontraktaService = protokol_dlja_zakljuchenija_kontraktaService;
	}

	private protokol_dlja_zakljuchenija_kontraktaService _protokol_dlja_zakljuchenija_kontraktaService;
}