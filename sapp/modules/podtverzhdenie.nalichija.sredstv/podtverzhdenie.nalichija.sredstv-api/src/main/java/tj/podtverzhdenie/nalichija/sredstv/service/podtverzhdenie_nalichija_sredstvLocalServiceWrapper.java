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

package tj.podtverzhdenie.nalichija.sredstv.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link podtverzhdenie_nalichija_sredstvLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_nalichija_sredstvLocalService
 * @generated
 */
@ProviderType
public class podtverzhdenie_nalichija_sredstvLocalServiceWrapper
	implements podtverzhdenie_nalichija_sredstvLocalService,
		ServiceWrapper<podtverzhdenie_nalichija_sredstvLocalService> {
	public podtverzhdenie_nalichija_sredstvLocalServiceWrapper(
		podtverzhdenie_nalichija_sredstvLocalService podtverzhdenie_nalichija_sredstvLocalService) {
		_podtverzhdenie_nalichija_sredstvLocalService = podtverzhdenie_nalichija_sredstvLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _podtverzhdenie_nalichija_sredstvLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _podtverzhdenie_nalichija_sredstvLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _podtverzhdenie_nalichija_sredstvLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_nalichija_sredstvLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_nalichija_sredstvLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of podtverzhdenie_nalichija_sredstvs.
	*
	* @return the number of podtverzhdenie_nalichija_sredstvs
	*/
	@Override
	public int getpodtverzhdenie_nalichija_sredstvsCount() {
		return _podtverzhdenie_nalichija_sredstvLocalService.getpodtverzhdenie_nalichija_sredstvsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _podtverzhdenie_nalichija_sredstvLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _podtverzhdenie_nalichija_sredstvLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _podtverzhdenie_nalichija_sredstvLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _podtverzhdenie_nalichija_sredstvLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the podtverzhdenie_nalichija_sredstvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.podtverzhdenie.nalichija.sredstv.model.impl.podtverzhdenie_nalichija_sredstvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of podtverzhdenie_nalichija_sredstvs
	* @param end the upper bound of the range of podtverzhdenie_nalichija_sredstvs (not inclusive)
	* @return the range of podtverzhdenie_nalichija_sredstvs
	*/
	@Override
	public java.util.List<tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv> getpodtverzhdenie_nalichija_sredstvs(
		int start, int end) {
		return _podtverzhdenie_nalichija_sredstvLocalService.getpodtverzhdenie_nalichija_sredstvs(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _podtverzhdenie_nalichija_sredstvLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _podtverzhdenie_nalichija_sredstvLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the podtverzhdenie_nalichija_sredstv to the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was added
	*/
	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv addpodtverzhdenie_nalichija_sredstv(
		tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		return _podtverzhdenie_nalichija_sredstvLocalService.addpodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv);
	}

	/**
	* Creates a new podtverzhdenie_nalichija_sredstv with the primary key. Does not add the podtverzhdenie_nalichija_sredstv to the database.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key for the new podtverzhdenie_nalichija_sredstv
	* @return the new podtverzhdenie_nalichija_sredstv
	*/
	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv createpodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id) {
		return _podtverzhdenie_nalichija_sredstvLocalService.createpodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Deletes the podtverzhdenie_nalichija_sredstv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was removed
	* @throws PortalException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv deletepodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_nalichija_sredstvLocalService.deletepodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Deletes the podtverzhdenie_nalichija_sredstv from the database. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was removed
	*/
	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv deletepodtverzhdenie_nalichija_sredstv(
		tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		return _podtverzhdenie_nalichija_sredstvLocalService.deletepodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv);
	}

	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv fetchpodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id) {
		return _podtverzhdenie_nalichija_sredstvLocalService.fetchpodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Returns the podtverzhdenie_nalichija_sredstv with the primary key.
	*
	* @param podtverzhdenie_nalichija_sredstv_id the primary key of the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv
	* @throws PortalException if a podtverzhdenie_nalichija_sredstv with the primary key could not be found
	*/
	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv getpodtverzhdenie_nalichija_sredstv(
		long podtverzhdenie_nalichija_sredstv_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _podtverzhdenie_nalichija_sredstvLocalService.getpodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv_id);
	}

	/**
	* Updates the podtverzhdenie_nalichija_sredstv in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param podtverzhdenie_nalichija_sredstv the podtverzhdenie_nalichija_sredstv
	* @return the podtverzhdenie_nalichija_sredstv that was updated
	*/
	@Override
	public tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv updatepodtverzhdenie_nalichija_sredstv(
		tj.podtverzhdenie.nalichija.sredstv.model.podtverzhdenie_nalichija_sredstv podtverzhdenie_nalichija_sredstv) {
		return _podtverzhdenie_nalichija_sredstvLocalService.updatepodtverzhdenie_nalichija_sredstv(podtverzhdenie_nalichija_sredstv);
	}

	@Override
	public podtverzhdenie_nalichija_sredstvLocalService getWrappedService() {
		return _podtverzhdenie_nalichija_sredstvLocalService;
	}

	@Override
	public void setWrappedService(
		podtverzhdenie_nalichija_sredstvLocalService podtverzhdenie_nalichija_sredstvLocalService) {
		_podtverzhdenie_nalichija_sredstvLocalService = podtverzhdenie_nalichija_sredstvLocalService;
	}

	private podtverzhdenie_nalichija_sredstvLocalService _podtverzhdenie_nalichija_sredstvLocalService;
}