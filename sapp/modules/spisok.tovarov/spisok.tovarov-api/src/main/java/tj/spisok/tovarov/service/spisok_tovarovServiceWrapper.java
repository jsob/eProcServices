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

package tj.spisok.tovarov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link spisok_tovarovService}.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarovService
 * @generated
 */
@ProviderType
public class spisok_tovarovServiceWrapper implements spisok_tovarovService,
	ServiceWrapper<spisok_tovarovService> {
	public spisok_tovarovServiceWrapper(
		spisok_tovarovService spisok_tovarovService) {
		_spisok_tovarovService = spisok_tovarovService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _spisok_tovarovService.getOSGiServiceIdentifier();
	}

	@Override
	public spisok_tovarovService getWrappedService() {
		return _spisok_tovarovService;
	}

	@Override
	public void setWrappedService(spisok_tovarovService spisok_tovarovService) {
		_spisok_tovarovService = spisok_tovarovService;
	}

	private spisok_tovarovService _spisok_tovarovService;
}