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

package tj.dostup.po.podrazdelenijam.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for dostup_po_podrazdelenijam. This utility wraps
 * {@link tj.dostup.po.podrazdelenijam.service.impl.dostup_po_podrazdelenijamServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamService
 * @see tj.dostup.po.podrazdelenijam.service.base.dostup_po_podrazdelenijamServiceBaseImpl
 * @see tj.dostup.po.podrazdelenijam.service.impl.dostup_po_podrazdelenijamServiceImpl
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.dostup.po.podrazdelenijam.service.impl.dostup_po_podrazdelenijamServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static dostup_po_podrazdelenijamService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<dostup_po_podrazdelenijamService, dostup_po_podrazdelenijamService> _serviceTracker =
		ServiceTrackerFactory.open(dostup_po_podrazdelenijamService.class);
}