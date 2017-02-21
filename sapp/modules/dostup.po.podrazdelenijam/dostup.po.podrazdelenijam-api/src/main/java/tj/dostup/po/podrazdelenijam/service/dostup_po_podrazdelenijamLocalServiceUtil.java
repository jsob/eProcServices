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
 * Provides the local service utility for dostup_po_podrazdelenijam. This utility wraps
 * {@link tj.dostup.po.podrazdelenijam.service.impl.dostup_po_podrazdelenijamLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijamLocalService
 * @see tj.dostup.po.podrazdelenijam.service.base.dostup_po_podrazdelenijamLocalServiceBaseImpl
 * @see tj.dostup.po.podrazdelenijam.service.impl.dostup_po_podrazdelenijamLocalServiceImpl
 * @generated
 */
@ProviderType
public class dostup_po_podrazdelenijamLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.dostup.po.podrazdelenijam.service.impl.dostup_po_podrazdelenijamLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of dostup_po_podrazdelenijams.
	*
	* @return the number of dostup_po_podrazdelenijams
	*/
	public static int getdostup_po_podrazdelenijamsCount() {
		return getService().getdostup_po_podrazdelenijamsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the dostup_po_podrazdelenijams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dostup_po_podrazdelenijams
	* @param end the upper bound of the range of dostup_po_podrazdelenijams (not inclusive)
	* @return the range of dostup_po_podrazdelenijams
	*/
	public static java.util.List<tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam> getdostup_po_podrazdelenijams(
		int start, int end) {
		return getService().getdostup_po_podrazdelenijams(start, end);
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
	* Adds the dostup_po_podrazdelenijam to the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_po_podrazdelenijam the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam that was added
	*/
	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam adddostup_po_podrazdelenijam(
		tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		return getService()
				   .adddostup_po_podrazdelenijam(dostup_po_podrazdelenijam);
	}

	/**
	* Creates a new dostup_po_podrazdelenijam with the primary key. Does not add the dostup_po_podrazdelenijam to the database.
	*
	* @param dostup_po_podrazdelenijam_id the primary key for the new dostup_po_podrazdelenijam
	* @return the new dostup_po_podrazdelenijam
	*/
	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam createdostup_po_podrazdelenijam(
		long dostup_po_podrazdelenijam_id) {
		return getService()
				   .createdostup_po_podrazdelenijam(dostup_po_podrazdelenijam_id);
	}

	/**
	* Deletes the dostup_po_podrazdelenijam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam that was removed
	* @throws PortalException if a dostup_po_podrazdelenijam with the primary key could not be found
	*/
	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam deletedostup_po_podrazdelenijam(
		long dostup_po_podrazdelenijam_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deletedostup_po_podrazdelenijam(dostup_po_podrazdelenijam_id);
	}

	/**
	* Deletes the dostup_po_podrazdelenijam from the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_po_podrazdelenijam the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam that was removed
	*/
	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam deletedostup_po_podrazdelenijam(
		tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		return getService()
				   .deletedostup_po_podrazdelenijam(dostup_po_podrazdelenijam);
	}

	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam fetchdostup_po_podrazdelenijam(
		long dostup_po_podrazdelenijam_id) {
		return getService()
				   .fetchdostup_po_podrazdelenijam(dostup_po_podrazdelenijam_id);
	}

	/**
	* Returns the dostup_po_podrazdelenijam with the primary key.
	*
	* @param dostup_po_podrazdelenijam_id the primary key of the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam
	* @throws PortalException if a dostup_po_podrazdelenijam with the primary key could not be found
	*/
	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam getdostup_po_podrazdelenijam(
		long dostup_po_podrazdelenijam_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getdostup_po_podrazdelenijam(dostup_po_podrazdelenijam_id);
	}

	/**
	* Updates the dostup_po_podrazdelenijam in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dostup_po_podrazdelenijam the dostup_po_podrazdelenijam
	* @return the dostup_po_podrazdelenijam that was updated
	*/
	public static tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam updatedostup_po_podrazdelenijam(
		tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam dostup_po_podrazdelenijam) {
		return getService()
				   .updatedostup_po_podrazdelenijam(dostup_po_podrazdelenijam);
	}

	public static dostup_po_podrazdelenijamLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<dostup_po_podrazdelenijamLocalService, dostup_po_podrazdelenijamLocalService> _serviceTracker =
		ServiceTrackerFactory.open(dostup_po_podrazdelenijamLocalService.class);
}