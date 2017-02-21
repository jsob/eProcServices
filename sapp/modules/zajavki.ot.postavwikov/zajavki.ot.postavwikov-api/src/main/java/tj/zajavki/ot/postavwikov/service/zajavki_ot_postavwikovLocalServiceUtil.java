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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for zajavki_ot_postavwikov. This utility wraps
 * {@link tj.zajavki.ot.postavwikov.service.impl.zajavki_ot_postavwikovLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikovLocalService
 * @see tj.zajavki.ot.postavwikov.service.base.zajavki_ot_postavwikovLocalServiceBaseImpl
 * @see tj.zajavki.ot.postavwikov.service.impl.zajavki_ot_postavwikovLocalServiceImpl
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.zajavki.ot.postavwikov.service.impl.zajavki_ot_postavwikovLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of zajavki_ot_postavwikovs.
	*
	* @return the number of zajavki_ot_postavwikovs
	*/
	public static int getzajavki_ot_postavwikovsCount() {
		return getService().getzajavki_ot_postavwikovsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the zajavki_ot_postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.zajavki.ot.postavwikov.model.impl.zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki_ot_postavwikovs
	* @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	* @return the range of zajavki_ot_postavwikovs
	*/
	public static java.util.List<tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov> getzajavki_ot_postavwikovs(
		int start, int end) {
		return getService().getzajavki_ot_postavwikovs(start, end);
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
	* Adds the zajavki_ot_postavwikov to the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was added
	*/
	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov addzajavki_ot_postavwikov(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return getService().addzajavki_ot_postavwikov(zajavki_ot_postavwikov);
	}

	/**
	* Creates a new zajavki_ot_postavwikov with the primary key. Does not add the zajavki_ot_postavwikov to the database.
	*
	* @param zajavki_ot_postavwikov_id the primary key for the new zajavki_ot_postavwikov
	* @return the new zajavki_ot_postavwikov
	*/
	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov createzajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id) {
		return getService()
				   .createzajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Deletes the zajavki_ot_postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was removed
	* @throws PortalException if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov deletezajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deletezajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Deletes the zajavki_ot_postavwikov from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was removed
	*/
	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov deletezajavki_ot_postavwikov(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return getService().deletezajavki_ot_postavwikov(zajavki_ot_postavwikov);
	}

	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov fetchzajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id) {
		return getService()
				   .fetchzajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Returns the zajavki_ot_postavwikov with the primary key.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov
	* @throws PortalException if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov getzajavki_ot_postavwikov(
		long zajavki_ot_postavwikov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getzajavki_ot_postavwikov(zajavki_ot_postavwikov_id);
	}

	/**
	* Updates the zajavki_ot_postavwikov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was updated
	*/
	public static tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov updatezajavki_ot_postavwikov(
		tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return getService().updatezajavki_ot_postavwikov(zajavki_ot_postavwikov);
	}

	public static zajavki_ot_postavwikovLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<zajavki_ot_postavwikovLocalService, zajavki_ot_postavwikovLocalService> _serviceTracker =
		ServiceTrackerFactory.open(zajavki_ot_postavwikovLocalService.class);
}