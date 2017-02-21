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

package tj.ne.uchastvujushhie.zajavki.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ne_uchastvujushhie_zajavki. This utility wraps
 * {@link tj.ne.uchastvujushhie.zajavki.service.impl.ne_uchastvujushhie_zajavkiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ne_uchastvujushhie_zajavkiLocalService
 * @see tj.ne.uchastvujushhie.zajavki.service.base.ne_uchastvujushhie_zajavkiLocalServiceBaseImpl
 * @see tj.ne.uchastvujushhie.zajavki.service.impl.ne_uchastvujushhie_zajavkiLocalServiceImpl
 * @generated
 */
@ProviderType
public class ne_uchastvujushhie_zajavkiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.ne.uchastvujushhie.zajavki.service.impl.ne_uchastvujushhie_zajavkiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of ne_uchastvujushhie_zajavkis.
	*
	* @return the number of ne_uchastvujushhie_zajavkis
	*/
	public static int getne_uchastvujushhie_zajavkisCount() {
		return getService().getne_uchastvujushhie_zajavkisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.ne.uchastvujushhie.zajavki.model.impl.ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @return the range of ne_uchastvujushhie_zajavkis
	*/
	public static java.util.List<tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki> getne_uchastvujushhie_zajavkis(
		int start, int end) {
		return getService().getne_uchastvujushhie_zajavkis(start, end);
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
	* Adds the ne_uchastvujushhie_zajavki to the database. Also notifies the appropriate model listeners.
	*
	* @param ne_uchastvujushhie_zajavki the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki that was added
	*/
	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki addne_uchastvujushhie_zajavki(
		tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		return getService()
				   .addne_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki);
	}

	/**
	* Creates a new ne_uchastvujushhie_zajavki with the primary key. Does not add the ne_uchastvujushhie_zajavki to the database.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key for the new ne_uchastvujushhie_zajavki
	* @return the new ne_uchastvujushhie_zajavki
	*/
	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki createne_uchastvujushhie_zajavki(
		long ne_uchastvujushhie_zajavki_id) {
		return getService()
				   .createne_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki_id);
	}

	/**
	* Deletes the ne_uchastvujushhie_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki that was removed
	* @throws PortalException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki deletene_uchastvujushhie_zajavki(
		long ne_uchastvujushhie_zajavki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deletene_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki_id);
	}

	/**
	* Deletes the ne_uchastvujushhie_zajavki from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_uchastvujushhie_zajavki the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki that was removed
	*/
	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki deletene_uchastvujushhie_zajavki(
		tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		return getService()
				   .deletene_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki);
	}

	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki fetchne_uchastvujushhie_zajavki(
		long ne_uchastvujushhie_zajavki_id) {
		return getService()
				   .fetchne_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki_id);
	}

	/**
	* Returns the ne_uchastvujushhie_zajavki with the primary key.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki
	* @throws PortalException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki getne_uchastvujushhie_zajavki(
		long ne_uchastvujushhie_zajavki_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getne_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki_id);
	}

	/**
	* Updates the ne_uchastvujushhie_zajavki in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ne_uchastvujushhie_zajavki the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki that was updated
	*/
	public static tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki updatene_uchastvujushhie_zajavki(
		tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki) {
		return getService()
				   .updatene_uchastvujushhie_zajavki(ne_uchastvujushhie_zajavki);
	}

	public static ne_uchastvujushhie_zajavkiLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ne_uchastvujushhie_zajavkiLocalService, ne_uchastvujushhie_zajavkiLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ne_uchastvujushhie_zajavkiLocalService.class);
}