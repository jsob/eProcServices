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

package tj.informacija.o.razmewenii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for informacija_o_razmewenii. This utility wraps
 * {@link tj.informacija.o.razmewenii.service.impl.informacija_o_razmeweniiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see informacija_o_razmeweniiLocalService
 * @see tj.informacija.o.razmewenii.service.base.informacija_o_razmeweniiLocalServiceBaseImpl
 * @see tj.informacija.o.razmewenii.service.impl.informacija_o_razmeweniiLocalServiceImpl
 * @generated
 */
@ProviderType
public class informacija_o_razmeweniiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.informacija.o.razmewenii.service.impl.informacija_o_razmeweniiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of informacija_o_razmeweniis.
	*
	* @return the number of informacija_o_razmeweniis
	*/
	public static int getinformacija_o_razmeweniisCount() {
		return getService().getinformacija_o_razmeweniisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the informacija_o_razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.o.razmewenii.model.impl.informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija_o_razmeweniis
	* @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	* @return the range of informacija_o_razmeweniis
	*/
	public static java.util.List<tj.informacija.o.razmewenii.model.informacija_o_razmewenii> getinformacija_o_razmeweniis(
		int start, int end) {
		return getService().getinformacija_o_razmeweniis(start, end);
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
	* Adds the informacija_o_razmewenii to the database. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii the informacija_o_razmewenii
	* @return the informacija_o_razmewenii that was added
	*/
	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii addinformacija_o_razmewenii(
		tj.informacija.o.razmewenii.model.informacija_o_razmewenii informacija_o_razmewenii) {
		return getService().addinformacija_o_razmewenii(informacija_o_razmewenii);
	}

	/**
	* Creates a new informacija_o_razmewenii with the primary key. Does not add the informacija_o_razmewenii to the database.
	*
	* @param informacija_o_razmewenii_id the primary key for the new informacija_o_razmewenii
	* @return the new informacija_o_razmewenii
	*/
	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii createinformacija_o_razmewenii(
		long informacija_o_razmewenii_id) {
		return getService()
				   .createinformacija_o_razmewenii(informacija_o_razmewenii_id);
	}

	/**
	* Deletes the informacija_o_razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	* @return the informacija_o_razmewenii that was removed
	* @throws PortalException if a informacija_o_razmewenii with the primary key could not be found
	*/
	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii deleteinformacija_o_razmewenii(
		long informacija_o_razmewenii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteinformacija_o_razmewenii(informacija_o_razmewenii_id);
	}

	/**
	* Deletes the informacija_o_razmewenii from the database. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii the informacija_o_razmewenii
	* @return the informacija_o_razmewenii that was removed
	*/
	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii deleteinformacija_o_razmewenii(
		tj.informacija.o.razmewenii.model.informacija_o_razmewenii informacija_o_razmewenii) {
		return getService()
				   .deleteinformacija_o_razmewenii(informacija_o_razmewenii);
	}

	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii fetchinformacija_o_razmewenii(
		long informacija_o_razmewenii_id) {
		return getService()
				   .fetchinformacija_o_razmewenii(informacija_o_razmewenii_id);
	}

	/**
	* Returns the informacija_o_razmewenii with the primary key.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	* @return the informacija_o_razmewenii
	* @throws PortalException if a informacija_o_razmewenii with the primary key could not be found
	*/
	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii getinformacija_o_razmewenii(
		long informacija_o_razmewenii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getinformacija_o_razmewenii(informacija_o_razmewenii_id);
	}

	/**
	* Updates the informacija_o_razmewenii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii the informacija_o_razmewenii
	* @return the informacija_o_razmewenii that was updated
	*/
	public static tj.informacija.o.razmewenii.model.informacija_o_razmewenii updateinformacija_o_razmewenii(
		tj.informacija.o.razmewenii.model.informacija_o_razmewenii informacija_o_razmewenii) {
		return getService()
				   .updateinformacija_o_razmewenii(informacija_o_razmewenii);
	}

	public static informacija_o_razmeweniiLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<informacija_o_razmeweniiLocalService, informacija_o_razmeweniiLocalService> _serviceTracker =
		ServiceTrackerFactory.open(informacija_o_razmeweniiLocalService.class);
}