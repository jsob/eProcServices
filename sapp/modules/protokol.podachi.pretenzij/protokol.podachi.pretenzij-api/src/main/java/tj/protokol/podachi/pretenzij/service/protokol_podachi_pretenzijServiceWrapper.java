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

package tj.protokol.podachi.pretenzij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link protokol_podachi_pretenzijService}.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzijService
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijServiceWrapper
	implements protokol_podachi_pretenzijService,
		ServiceWrapper<protokol_podachi_pretenzijService> {
	public protokol_podachi_pretenzijServiceWrapper(
		protokol_podachi_pretenzijService protokol_podachi_pretenzijService) {
		_protokol_podachi_pretenzijService = protokol_podachi_pretenzijService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protokol_podachi_pretenzijService.getOSGiServiceIdentifier();
	}

	@Override
	public protokol_podachi_pretenzijService getWrappedService() {
		return _protokol_podachi_pretenzijService;
	}

	@Override
	public void setWrappedService(
		protokol_podachi_pretenzijService protokol_podachi_pretenzijService) {
		_protokol_podachi_pretenzijService = protokol_podachi_pretenzijService;
	}

	private protokol_podachi_pretenzijService _protokol_podachi_pretenzijService;
}