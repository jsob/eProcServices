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

package tj.obwaja.informacija.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for obwaja_informacija. This utility wraps
 * {@link tj.obwaja.informacija.service.impl.obwaja_informacijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see obwaja_informacijaLocalService
 * @see tj.obwaja.informacija.service.base.obwaja_informacijaLocalServiceBaseImpl
 * @see tj.obwaja.informacija.service.impl.obwaja_informacijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class obwaja_informacijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.obwaja.informacija.service.impl.obwaja_informacijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of obwaja_informacijas.
	*
	* @return the number of obwaja_informacijas
	*/
	public static int getobwaja_informacijasCount() {
		return getService().getobwaja_informacijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.obwaja.informacija.model.impl.obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @return the range of obwaja_informacijas
	*/
	public static java.util.List<tj.obwaja.informacija.model.obwaja_informacija> getobwaja_informacijas(
		int start, int end) {
		return getService().getobwaja_informacijas(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the obwaja_informacija to the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija the obwaja_informacija
	* @return the obwaja_informacija that was added
	*/
	public static tj.obwaja.informacija.model.obwaja_informacija addobwaja_informacija(
		tj.obwaja.informacija.model.obwaja_informacija obwaja_informacija) {
		return getService().addobwaja_informacija(obwaja_informacija);
	}

	/**
	* Creates a new obwaja_informacija with the primary key. Does not add the obwaja_informacija to the database.
	*
	* @param obwaja_informacija_id the primary key for the new obwaja_informacija
	* @return the new obwaja_informacija
	*/
	public static tj.obwaja.informacija.model.obwaja_informacija createobwaja_informacija(
		long obwaja_informacija_id) {
		return getService().createobwaja_informacija(obwaja_informacija_id);
	}

	/**
	* Deletes the obwaja_informacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija that was removed
	* @throws PortalException if a obwaja_informacija with the primary key could not be found
	*/
	public static tj.obwaja.informacija.model.obwaja_informacija deleteobwaja_informacija(
		long obwaja_informacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteobwaja_informacija(obwaja_informacija_id);
	}

	/**
	* Deletes the obwaja_informacija from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija the obwaja_informacija
	* @return the obwaja_informacija that was removed
	*/
	public static tj.obwaja.informacija.model.obwaja_informacija deleteobwaja_informacija(
		tj.obwaja.informacija.model.obwaja_informacija obwaja_informacija) {
		return getService().deleteobwaja_informacija(obwaja_informacija);
	}

	public static tj.obwaja.informacija.model.obwaja_informacija fetchobwaja_informacija(
		long obwaja_informacija_id) {
		return getService().fetchobwaja_informacija(obwaja_informacija_id);
	}

	/**
	* Returns the obwaja_informacija with the primary key.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija
	* @throws PortalException if a obwaja_informacija with the primary key could not be found
	*/
	public static tj.obwaja.informacija.model.obwaja_informacija getobwaja_informacija(
		long obwaja_informacija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getobwaja_informacija(obwaja_informacija_id);
	}

	/**
	* Updates the obwaja_informacija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija the obwaja_informacija
	* @return the obwaja_informacija that was updated
	*/
	public static tj.obwaja.informacija.model.obwaja_informacija updateobwaja_informacija(
		tj.obwaja.informacija.model.obwaja_informacija obwaja_informacija) {
		return getService().updateobwaja_informacija(obwaja_informacija);
	}

	public static obwaja_informacijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<obwaja_informacijaLocalService, obwaja_informacijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(obwaja_informacijaLocalService.class);
}