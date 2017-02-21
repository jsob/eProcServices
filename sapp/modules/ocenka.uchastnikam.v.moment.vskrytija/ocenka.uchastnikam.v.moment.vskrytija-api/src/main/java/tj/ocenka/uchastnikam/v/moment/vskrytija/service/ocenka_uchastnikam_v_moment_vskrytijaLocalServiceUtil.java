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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ocenka_uchastnikam_v_moment_vskrytija. This utility wraps
 * {@link tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytijaLocalService
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.base.ocenka_uchastnikam_v_moment_vskrytijaLocalServiceBaseImpl
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class ocenka_uchastnikam_v_moment_vskrytijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.ocenka.uchastnikam.v.moment.vskrytija.service.impl.ocenka_uchastnikam_v_moment_vskrytijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of ocenka_uchastnikam_v_moment_vskrytijas.
	*
	* @return the number of ocenka_uchastnikam_v_moment_vskrytijas
	*/
	public static int getocenka_uchastnikam_v_moment_vskrytijasCount() {
		return getService().getocenka_uchastnikam_v_moment_vskrytijasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the ocenka_uchastnikam_v_moment_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ocenka_uchastnikam_v_moment_vskrytijas
	* @param end the upper bound of the range of ocenka_uchastnikam_v_moment_vskrytijas (not inclusive)
	* @return the range of ocenka_uchastnikam_v_moment_vskrytijas
	*/
	public static java.util.List<tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija> getocenka_uchastnikam_v_moment_vskrytijas(
		int start, int end) {
		return getService().getocenka_uchastnikam_v_moment_vskrytijas(start, end);
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
	* Adds the ocenka_uchastnikam_v_moment_vskrytija to the database. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was added
	*/
	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija addocenka_uchastnikam_v_moment_vskrytija(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return getService()
				   .addocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija);
	}

	/**
	* Creates a new ocenka_uchastnikam_v_moment_vskrytija with the primary key. Does not add the ocenka_uchastnikam_v_moment_vskrytija to the database.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the primary key for the new ocenka_uchastnikam_v_moment_vskrytija
	* @return the new ocenka_uchastnikam_v_moment_vskrytija
	*/
	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija createocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id) {
		return getService()
				   .createocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Deletes the ocenka_uchastnikam_v_moment_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the primary key of the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was removed
	* @throws PortalException if a ocenka_uchastnikam_v_moment_vskrytija with the primary key could not be found
	*/
	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija deleteocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Deletes the ocenka_uchastnikam_v_moment_vskrytija from the database. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was removed
	*/
	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija deleteocenka_uchastnikam_v_moment_vskrytija(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return getService()
				   .deleteocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija);
	}

	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija fetchocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id) {
		return getService()
				   .fetchocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Returns the ocenka_uchastnikam_v_moment_vskrytija with the primary key.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija_id the primary key of the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija
	* @throws PortalException if a ocenka_uchastnikam_v_moment_vskrytija with the primary key could not be found
	*/
	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija getocenka_uchastnikam_v_moment_vskrytija(
		long ocenka_uchastnikam_v_moment_vskrytija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija_id);
	}

	/**
	* Updates the ocenka_uchastnikam_v_moment_vskrytija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ocenka_uchastnikam_v_moment_vskrytija the ocenka_uchastnikam_v_moment_vskrytija
	* @return the ocenka_uchastnikam_v_moment_vskrytija that was updated
	*/
	public static tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija updateocenka_uchastnikam_v_moment_vskrytija(
		tj.ocenka.uchastnikam.v.moment.vskrytija.model.ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
		return getService()
				   .updateocenka_uchastnikam_v_moment_vskrytija(ocenka_uchastnikam_v_moment_vskrytija);
	}

	public static ocenka_uchastnikam_v_moment_vskrytijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ocenka_uchastnikam_v_moment_vskrytijaLocalService, ocenka_uchastnikam_v_moment_vskrytijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ocenka_uchastnikam_v_moment_vskrytijaLocalService.class);
}