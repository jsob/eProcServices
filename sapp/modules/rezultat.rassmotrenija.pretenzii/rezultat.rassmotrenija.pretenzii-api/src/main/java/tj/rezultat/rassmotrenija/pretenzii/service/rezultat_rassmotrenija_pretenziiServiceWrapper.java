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

package tj.rezultat.rassmotrenija.pretenzii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link rezultat_rassmotrenija_pretenziiService}.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenziiService
 * @generated
 */
@ProviderType
public class rezultat_rassmotrenija_pretenziiServiceWrapper
	implements rezultat_rassmotrenija_pretenziiService,
		ServiceWrapper<rezultat_rassmotrenija_pretenziiService> {
	public rezultat_rassmotrenija_pretenziiServiceWrapper(
		rezultat_rassmotrenija_pretenziiService rezultat_rassmotrenija_pretenziiService) {
		_rezultat_rassmotrenija_pretenziiService = rezultat_rassmotrenija_pretenziiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rezultat_rassmotrenija_pretenziiService.getOSGiServiceIdentifier();
	}

	@Override
	public rezultat_rassmotrenija_pretenziiService getWrappedService() {
		return _rezultat_rassmotrenija_pretenziiService;
	}

	@Override
	public void setWrappedService(
		rezultat_rassmotrenija_pretenziiService rezultat_rassmotrenija_pretenziiService) {
		_rezultat_rassmotrenija_pretenziiService = rezultat_rassmotrenija_pretenziiService;
	}

	private rezultat_rassmotrenija_pretenziiService _rezultat_rassmotrenija_pretenziiService;
}