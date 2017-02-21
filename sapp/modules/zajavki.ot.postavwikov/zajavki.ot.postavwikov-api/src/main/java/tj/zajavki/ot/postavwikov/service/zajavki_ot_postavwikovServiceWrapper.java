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

package tj.zajavki.ot.postavwikov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link zajavki_ot_postavwikovService}.
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikovService
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovServiceWrapper
	implements zajavki_ot_postavwikovService,
		ServiceWrapper<zajavki_ot_postavwikovService> {
	public zajavki_ot_postavwikovServiceWrapper(
		zajavki_ot_postavwikovService zajavki_ot_postavwikovService) {
		_zajavki_ot_postavwikovService = zajavki_ot_postavwikovService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _zajavki_ot_postavwikovService.getOSGiServiceIdentifier();
	}

	@Override
	public zajavki_ot_postavwikovService getWrappedService() {
		return _zajavki_ot_postavwikovService;
	}

	@Override
	public void setWrappedService(
		zajavki_ot_postavwikovService zajavki_ot_postavwikovService) {
		_zajavki_ot_postavwikovService = zajavki_ot_postavwikovService;
	}

	private zajavki_ot_postavwikovService _zajavki_ot_postavwikovService;
}