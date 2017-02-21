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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for rezultat_opredelenija_sootvetstvija. This utility wraps
 * {@link tj.rezultat.opredelenija.sootvetstvija.service.impl.rezultat_opredelenija_sootvetstvijaServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_opredelenija_sootvetstvijaService
 * @see tj.rezultat.opredelenija.sootvetstvija.service.base.rezultat_opredelenija_sootvetstvijaServiceBaseImpl
 * @see tj.rezultat.opredelenija.sootvetstvija.service.impl.rezultat_opredelenija_sootvetstvijaServiceImpl
 * @generated
 */
@ProviderType
public class rezultat_opredelenija_sootvetstvijaServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.rezultat.opredelenija.sootvetstvija.service.impl.rezultat_opredelenija_sootvetstvijaServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static rezultat_opredelenija_sootvetstvijaService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<rezultat_opredelenija_sootvetstvijaService, rezultat_opredelenija_sootvetstvijaService> _serviceTracker =
		ServiceTrackerFactory.open(rezultat_opredelenija_sootvetstvijaService.class);
}