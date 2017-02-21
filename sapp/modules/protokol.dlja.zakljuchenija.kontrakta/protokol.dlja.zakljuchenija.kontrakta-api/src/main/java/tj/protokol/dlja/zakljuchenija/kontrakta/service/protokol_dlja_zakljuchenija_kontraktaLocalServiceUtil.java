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

package tj.protokol.dlja.zakljuchenija.kontrakta.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for protokol_dlja_zakljuchenija_kontrakta. This utility wraps
 * {@link tj.protokol.dlja.zakljuchenija.kontrakta.service.impl.protokol_dlja_zakljuchenija_kontraktaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontraktaLocalService
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.service.base.protokol_dlja_zakljuchenija_kontraktaLocalServiceBaseImpl
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.service.impl.protokol_dlja_zakljuchenija_kontraktaLocalServiceImpl
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.protokol.dlja.zakljuchenija.kontrakta.service.impl.protokol_dlja_zakljuchenija_kontraktaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of protokol_dlja_zakljuchenija_kontraktas.
	*
	* @return the number of protokol_dlja_zakljuchenija_kontraktas
	*/
	public static int getprotokol_dlja_zakljuchenija_kontraktasCount() {
		return getService().getprotokol_dlja_zakljuchenija_kontraktasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the protokol_dlja_zakljuchenija_kontraktas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.dlja.zakljuchenija.kontrakta.model.impl.protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_dlja_zakljuchenija_kontraktas
	* @param end the upper bound of the range of protokol_dlja_zakljuchenija_kontraktas (not inclusive)
	* @return the range of protokol_dlja_zakljuchenija_kontraktas
	*/
	public static java.util.List<tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta> getprotokol_dlja_zakljuchenija_kontraktas(
		int start, int end) {
		return getService().getprotokol_dlja_zakljuchenija_kontraktas(start, end);
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
	* Adds the protokol_dlja_zakljuchenija_kontrakta to the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was added
	*/
	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta addprotokol_dlja_zakljuchenija_kontrakta(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return getService()
				   .addprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta);
	}

	/**
	* Creates a new protokol_dlja_zakljuchenija_kontrakta with the primary key. Does not add the protokol_dlja_zakljuchenija_kontrakta to the database.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key for the new protokol_dlja_zakljuchenija_kontrakta
	* @return the new protokol_dlja_zakljuchenija_kontrakta
	*/
	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta createprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		return getService()
				   .createprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Deletes the protokol_dlja_zakljuchenija_kontrakta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was removed
	* @throws PortalException if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta deleteprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Deletes the protokol_dlja_zakljuchenija_kontrakta from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was removed
	*/
	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta deleteprotokol_dlja_zakljuchenija_kontrakta(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return getService()
				   .deleteprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta);
	}

	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta fetchprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		return getService()
				   .fetchprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Returns the protokol_dlja_zakljuchenija_kontrakta with the primary key.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta
	* @throws PortalException if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta getprotokol_dlja_zakljuchenija_kontrakta(
		long protokol_dlja_zakljuchenija_kontrakta_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Updates the protokol_dlja_zakljuchenija_kontrakta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was updated
	*/
	public static tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta updateprotokol_dlja_zakljuchenija_kontrakta(
		tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return getService()
				   .updateprotokol_dlja_zakljuchenija_kontrakta(protokol_dlja_zakljuchenija_kontrakta);
	}

	public static protokol_dlja_zakljuchenija_kontraktaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<protokol_dlja_zakljuchenija_kontraktaLocalService, protokol_dlja_zakljuchenija_kontraktaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(protokol_dlja_zakljuchenija_kontraktaLocalService.class);
}