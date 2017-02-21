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

package tj.spisok.tovarov.vremenno.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link spisok_tovarov_vremennoService}.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremennoService
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoServiceWrapper
	implements spisok_tovarov_vremennoService,
		ServiceWrapper<spisok_tovarov_vremennoService> {
	public spisok_tovarov_vremennoServiceWrapper(
		spisok_tovarov_vremennoService spisok_tovarov_vremennoService) {
		_spisok_tovarov_vremennoService = spisok_tovarov_vremennoService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _spisok_tovarov_vremennoService.getOSGiServiceIdentifier();
	}

	@Override
	public spisok_tovarov_vremennoService getWrappedService() {
		return _spisok_tovarov_vremennoService;
	}

	@Override
	public void setWrappedService(
		spisok_tovarov_vremennoService spisok_tovarov_vremennoService) {
		_spisok_tovarov_vremennoService = spisok_tovarov_vremennoService;
	}

	private spisok_tovarov_vremennoService _spisok_tovarov_vremennoService;
}