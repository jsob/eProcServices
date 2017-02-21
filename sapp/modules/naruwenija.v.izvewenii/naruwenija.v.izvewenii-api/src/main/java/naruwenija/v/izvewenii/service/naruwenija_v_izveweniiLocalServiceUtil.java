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
 * Provides the local service utility for naruwenija_v_izvewenii. This utility wraps
 * {@link naruwenija.v.izvewenii.service.impl.naruwenija_v_izveweniiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izveweniiLocalService
 * @see naruwenija.v.izvewenii.service.base.naruwenija_v_izveweniiLocalServiceBaseImpl
 * @see naruwenija.v.izvewenii.service.impl.naruwenija_v_izveweniiLocalServiceImpl
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link naruwenija.v.izvewenii.service.impl.naruwenija_v_izveweniiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of naruwenija_v_izveweniis.
	*
	* @return the number of naruwenija_v_izveweniis
	*/
	public static int getnaruwenija_v_izveweniisCount() {
		return getService().getnaruwenija_v_izveweniisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija.v.izvewenii.model.impl.naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @return the range of naruwenija_v_izveweniis
	*/
	public static java.util.List<naruwenija.v.izvewenii.model.naruwenija_v_izvewenii> getnaruwenija_v_izveweniis(
		int start, int end) {
		return getService().getnaruwenija_v_izveweniis(start, end);
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
	* Adds the naruwenija_v_izvewenii to the database. Also notifies the appropriate model listeners.
	*
	* @param naruwenija_v_izvewenii the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii that was added
	*/
	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii addnaruwenija_v_izvewenii(
		naruwenija.v.izvewenii.model.naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		return getService().addnaruwenija_v_izvewenii(naruwenija_v_izvewenii);
	}

	/**
	* Creates a new naruwenija_v_izvewenii with the primary key. Does not add the naruwenija_v_izvewenii to the database.
	*
	* @param naruwenija_v_izvewenii_id the primary key for the new naruwenija_v_izvewenii
	* @return the new naruwenija_v_izvewenii
	*/
	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii createnaruwenija_v_izvewenii(
		long naruwenija_v_izvewenii_id) {
		return getService()
				   .createnaruwenija_v_izvewenii(naruwenija_v_izvewenii_id);
	}

	/**
	* Deletes the naruwenija_v_izvewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii that was removed
	* @throws PortalException if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii deletenaruwenija_v_izvewenii(
		long naruwenija_v_izvewenii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deletenaruwenija_v_izvewenii(naruwenija_v_izvewenii_id);
	}

	/**
	* Deletes the naruwenija_v_izvewenii from the database. Also notifies the appropriate model listeners.
	*
	* @param naruwenija_v_izvewenii the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii that was removed
	*/
	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii deletenaruwenija_v_izvewenii(
		naruwenija.v.izvewenii.model.naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		return getService().deletenaruwenija_v_izvewenii(naruwenija_v_izvewenii);
	}

	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii fetchnaruwenija_v_izvewenii(
		long naruwenija_v_izvewenii_id) {
		return getService()
				   .fetchnaruwenija_v_izvewenii(naruwenija_v_izvewenii_id);
	}

	/**
	* Returns the naruwenija_v_izvewenii with the primary key.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii
	* @throws PortalException if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii getnaruwenija_v_izvewenii(
		long naruwenija_v_izvewenii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getnaruwenija_v_izvewenii(naruwenija_v_izvewenii_id);
	}

	/**
	* Updates the naruwenija_v_izvewenii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param naruwenija_v_izvewenii the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii that was updated
	*/
	public static naruwenija.v.izvewenii.model.naruwenija_v_izvewenii updatenaruwenija_v_izvewenii(
		naruwenija.v.izvewenii.model.naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		return getService().updatenaruwenija_v_izvewenii(naruwenija_v_izvewenii);
	}

	public static naruwenija_v_izveweniiLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<naruwenija_v_izveweniiLocalService, naruwenija_v_izveweniiLocalService> _serviceTracker =
		ServiceTrackerFactory.open(naruwenija_v_izveweniiLocalService.class);
}