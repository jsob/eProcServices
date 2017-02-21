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

package tj.dokumenty.na.zajavku.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for dokumenty_na_zajavku. This utility wraps
 * {@link tj.dokumenty.na.zajavku.service.impl.dokumenty_na_zajavkuLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see dokumenty_na_zajavkuLocalService
 * @see tj.dokumenty.na.zajavku.service.base.dokumenty_na_zajavkuLocalServiceBaseImpl
 * @see tj.dokumenty.na.zajavku.service.impl.dokumenty_na_zajavkuLocalServiceImpl
 * @generated
 */
@ProviderType
public class dokumenty_na_zajavkuLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.dokumenty.na.zajavku.service.impl.dokumenty_na_zajavkuLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of dokumenty_na_zajavkus.
	*
	* @return the number of dokumenty_na_zajavkus
	*/
	public static int getdokumenty_na_zajavkusCount() {
		return getService().getdokumenty_na_zajavkusCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the dokumenty_na_zajavkus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.na.zajavku.model.impl.dokumenty_na_zajavkuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty_na_zajavkus
	* @param end the upper bound of the range of dokumenty_na_zajavkus (not inclusive)
	* @return the range of dokumenty_na_zajavkus
	*/
	public static java.util.List<tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku> getdokumenty_na_zajavkus(
		int start, int end) {
		return getService().getdokumenty_na_zajavkus(start, end);
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
	* Adds the dokumenty_na_zajavku to the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was added
	*/
	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku adddokumenty_na_zajavku(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return getService().adddokumenty_na_zajavku(dokumenty_na_zajavku);
	}

	/**
	* Creates a new dokumenty_na_zajavku with the primary key. Does not add the dokumenty_na_zajavku to the database.
	*
	* @param dokumenty_na_zajavku_id the primary key for the new dokumenty_na_zajavku
	* @return the new dokumenty_na_zajavku
	*/
	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku createdokumenty_na_zajavku(
		long dokumenty_na_zajavku_id) {
		return getService().createdokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Deletes the dokumenty_na_zajavku with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was removed
	* @throws PortalException if a dokumenty_na_zajavku with the primary key could not be found
	*/
	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku deletedokumenty_na_zajavku(
		long dokumenty_na_zajavku_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletedokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Deletes the dokumenty_na_zajavku from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was removed
	*/
	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku deletedokumenty_na_zajavku(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return getService().deletedokumenty_na_zajavku(dokumenty_na_zajavku);
	}

	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku fetchdokumenty_na_zajavku(
		long dokumenty_na_zajavku_id) {
		return getService().fetchdokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Returns the dokumenty_na_zajavku with the primary key.
	*
	* @param dokumenty_na_zajavku_id the primary key of the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku
	* @throws PortalException if a dokumenty_na_zajavku with the primary key could not be found
	*/
	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku getdokumenty_na_zajavku(
		long dokumenty_na_zajavku_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getdokumenty_na_zajavku(dokumenty_na_zajavku_id);
	}

	/**
	* Updates the dokumenty_na_zajavku in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_na_zajavku the dokumenty_na_zajavku
	* @return the dokumenty_na_zajavku that was updated
	*/
	public static tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku updatedokumenty_na_zajavku(
		tj.dokumenty.na.zajavku.model.dokumenty_na_zajavku dokumenty_na_zajavku) {
		return getService().updatedokumenty_na_zajavku(dokumenty_na_zajavku);
	}

	public static dokumenty_na_zajavkuLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<dokumenty_na_zajavkuLocalService, dokumenty_na_zajavkuLocalService> _serviceTracker =
		ServiceTrackerFactory.open(dokumenty_na_zajavkuLocalService.class);
}