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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for naruwenija_v_izvewenii. This utility wraps
 * {@link naruwenija.v.izvewenii.service.impl.naruwenija_v_izveweniiServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izveweniiService
 * @see naruwenija.v.izvewenii.service.base.naruwenija_v_izveweniiServiceBaseImpl
 * @see naruwenija.v.izvewenii.service.impl.naruwenija_v_izveweniiServiceImpl
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link naruwenija.v.izvewenii.service.impl.naruwenija_v_izveweniiServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static naruwenija_v_izveweniiService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<naruwenija_v_izveweniiService, naruwenija_v_izveweniiService> _serviceTracker =
		ServiceTrackerFactory.open(naruwenija_v_izveweniiService.class);
}