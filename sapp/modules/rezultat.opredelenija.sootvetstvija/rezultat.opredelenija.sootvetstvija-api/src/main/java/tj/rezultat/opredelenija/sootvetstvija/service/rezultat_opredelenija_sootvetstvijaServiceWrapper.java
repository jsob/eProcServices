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

package tj.rezultat.opredelenija.sootvetstvija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link rezultat_opredelenija_sootvetstvijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvijaService
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaServiceWrapper
	implements rezultat_opredelenija_sootvetstvijaService,
		ServiceWrapper<rezultat_opredelenija_sootvetstvijaService> {
	public rezultat_opredelenija_sootvetstvijaServiceWrapper(
		rezultat_opredelenija_sootvetstvijaService rezultat_opredelenija_sootvetstvijaService) {
		_rezultat_opredelenija_sootvetstvijaService = rezultat_opredelenija_sootvetstvijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rezultat_opredelenija_sootvetstvijaService.getOSGiServiceIdentifier();
	}

	@Override
	public rezultat_opredelenija_sootvetstvijaService getWrappedService() {
		return _rezultat_opredelenija_sootvetstvijaService;
	}

	@Override
	public void setWrappedService(
		rezultat_opredelenija_sootvetstvijaService rezultat_opredelenija_sootvetstvijaService) {
		_rezultat_opredelenija_sootvetstvijaService = rezultat_opredelenija_sootvetstvijaService;
	}

	private rezultat_opredelenija_sootvetstvijaService _rezultat_opredelenija_sootvetstvijaService;
}