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

package naruwenija.v.izvewenii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link naruwenija_v_izveweniiService}.
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izveweniiService
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiServiceWrapper
	implements naruwenija_v_izveweniiService,
		ServiceWrapper<naruwenija_v_izveweniiService> {
	public naruwenija_v_izveweniiServiceWrapper(
		naruwenija_v_izveweniiService naruwenija_v_izveweniiService) {
		_naruwenija_v_izveweniiService = naruwenija_v_izveweniiService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _naruwenija_v_izveweniiService.getOSGiServiceIdentifier();
	}

	@Override
	public naruwenija_v_izveweniiService getWrappedService() {
		return _naruwenija_v_izveweniiService;
	}

	@Override
	public void setWrappedService(
		naruwenija_v_izveweniiService naruwenija_v_izveweniiService) {
		_naruwenija_v_izveweniiService = naruwenija_v_izveweniiService;
	}

	private naruwenija_v_izveweniiService _naruwenija_v_izveweniiService;
}