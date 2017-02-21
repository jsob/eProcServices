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

package tj.strany.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link stranyService}.
 *
 * @author Brian Wing Shun Chan
 * @see stranyService
 * @generated
 */
@ProviderType
public class stranyServiceWrapper implements stranyService,
	ServiceWrapper<stranyService> {
	public stranyServiceWrapper(stranyService stranyService) {
		_stranyService = stranyService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _stranyService.getOSGiServiceIdentifier();
	}

	@Override
	public stranyService getWrappedService() {
		return _stranyService;
	}

	@Override
	public void setWrappedService(stranyService stranyService) {
		_stranyService = stranyService;
	}

	private stranyService _stranyService;
}