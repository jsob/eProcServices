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

package tj.spisok.tovarov.vremenno.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for spisok_tovarov_vremenno. This utility wraps
 * {@link tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremennoLocalService
 * @see tj.spisok.tovarov.vremenno.service.base.spisok_tovarov_vremennoLocalServiceBaseImpl
 * @see tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.spisok.tovarov.vremenno.service.impl.spisok_tovarov_vremennoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of spisok_tovarov_vremennos.
	*
	* @return the number of spisok_tovarov_vremennos
	*/
	public static int getspisok_tovarov_vremennosCount() {
		return getService().getspisok_tovarov_vremennosCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the spisok_tovarov_vremennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarov_vremennos
	* @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	* @return the range of spisok_tovarov_vremennos
	*/
	public static java.util.List<tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno> getspisok_tovarov_vremennos(
		int start, int end) {
		return getService().getspisok_tovarov_vremennos(start, end);
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
	* Adds the spisok_tovarov_vremenno to the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was added
	*/
	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno addspisok_tovarov_vremenno(
		tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return getService().addspisok_tovarov_vremenno(spisok_tovarov_vremenno);
	}

	/**
	* Creates a new spisok_tovarov_vremenno with the primary key. Does not add the spisok_tovarov_vremenno to the database.
	*
	* @param spisok_tovarov_vremenno_id the primary key for the new spisok_tovarov_vremenno
	* @return the new spisok_tovarov_vremenno
	*/
	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno createspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) {
		return getService()
				   .createspisok_tovarov_vremenno(spisok_tovarov_vremenno_id);
	}

	/**
	* Deletes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was removed
	* @throws PortalException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno deletespisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deletespisok_tovarov_vremenno(spisok_tovarov_vremenno_id);
	}

	/**
	* Deletes the spisok_tovarov_vremenno from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was removed
	*/
	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno deletespisok_tovarov_vremenno(
		tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return getService()
				   .deletespisok_tovarov_vremenno(spisok_tovarov_vremenno);
	}

	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno fetchspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id) {
		return getService()
				   .fetchspisok_tovarov_vremenno(spisok_tovarov_vremenno_id);
	}

	/**
	* Returns the spisok_tovarov_vremenno with the primary key.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno
	* @throws PortalException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno getspisok_tovarov_vremenno(
		long spisok_tovarov_vremenno_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getspisok_tovarov_vremenno(spisok_tovarov_vremenno_id);
	}

	/**
	* Updates the spisok_tovarov_vremenno in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was updated
	*/
	public static tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno updatespisok_tovarov_vremenno(
		tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return getService()
				   .updatespisok_tovarov_vremenno(spisok_tovarov_vremenno);
	}

	public static spisok_tovarov_vremennoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<spisok_tovarov_vremennoLocalService, spisok_tovarov_vremennoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(spisok_tovarov_vremennoLocalService.class);
}