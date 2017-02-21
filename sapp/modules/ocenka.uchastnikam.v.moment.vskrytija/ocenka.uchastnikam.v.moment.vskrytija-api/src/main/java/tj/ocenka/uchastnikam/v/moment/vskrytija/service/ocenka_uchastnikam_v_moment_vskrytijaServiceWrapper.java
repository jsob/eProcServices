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

package tj.ocenka.uchastnikam.v.moment.vskrytija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ocenka_uchastnikam_v_moment_vskrytijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytijaService
 * @generated
 */
@ProviderType
public class ocenka_uchastnikam_v_moment_vskrytijaServiceWrapper
	implements ocenka_uchastnikam_v_moment_vskrytijaService,
		ServiceWrapper<ocenka_uchastnikam_v_moment_vskrytijaService> {
	public ocenka_uchastnikam_v_moment_vskrytijaServiceWrapper(
		ocenka_uchastnikam_v_moment_vskrytijaService ocenka_uchastnikam_v_moment_vskrytijaService) {
		_ocenka_uchastnikam_v_moment_vskrytijaService = ocenka_uchastnikam_v_moment_vskrytijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ocenka_uchastnikam_v_moment_vskrytijaService.getOSGiServiceIdentifier();
	}

	@Override
	public ocenka_uchastnikam_v_moment_vskrytijaService getWrappedService() {
		return _ocenka_uchastnikam_v_moment_vskrytijaService;
	}

	@Override
	public void setWrappedService(
		ocenka_uchastnikam_v_moment_vskrytijaService ocenka_uchastnikam_v_moment_vskrytijaService) {
		_ocenka_uchastnikam_v_moment_vskrytijaService = ocenka_uchastnikam_v_moment_vskrytijaService;
	}

	private ocenka_uchastnikam_v_moment_vskrytijaService _ocenka_uchastnikam_v_moment_vskrytijaService;
}