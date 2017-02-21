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

package tj.roli.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link roliLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see roliLocalService
 * @generated
 */
@ProviderType
public class roliLocalServiceWrapper implements roliLocalService,
	ServiceWrapper<roliLocalService> {
	public roliLocalServiceWrapper(roliLocalService roliLocalService) {
		_roliLocalService = roliLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _roliLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roliLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _roliLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roliLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roliLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of rolis.
	*
	* @return the number of rolis
	*/
	@Override
	public int getrolisCount() {
		return _roliLocalService.getrolisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _roliLocalService.getOSGiServiceIdentifier();
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
		return _roliLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.roli.model.impl.roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _roliLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.roli.model.impl.roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _roliLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the rolis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.roli.model.impl.roliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rolis
	* @param end the upper bound of the range of rolis (not inclusive)
	* @return the range of rolis
	*/
	@Override
	public java.util.List<tj.roli.model.roli> getrolis(int start, int end) {
		return _roliLocalService.getrolis(start, end);
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
		return _roliLocalService.dynamicQueryCount(dynamicQuery);
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
		return _roliLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the roli to the database. Also notifies the appropriate model listeners.
	*
	* @param roli the roli
	* @return the roli that was added
	*/
	@Override
	public tj.roli.model.roli addroli(tj.roli.model.roli roli) {
		return _roliLocalService.addroli(roli);
	}

	/**
	* Creates a new roli with the primary key. Does not add the roli to the database.
	*
	* @param roli_id the primary key for the new roli
	* @return the new roli
	*/
	@Override
	public tj.roli.model.roli createroli(long roli_id) {
		return _roliLocalService.createroli(roli_id);
	}

	/**
	* Deletes the roli with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roli_id the primary key of the roli
	* @return the roli that was removed
	* @throws PortalException if a roli with the primary key could not be found
	*/
	@Override
	public tj.roli.model.roli deleteroli(long roli_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roliLocalService.deleteroli(roli_id);
	}

	/**
	* Deletes the roli from the database. Also notifies the appropriate model listeners.
	*
	* @param roli the roli
	* @return the roli that was removed
	*/
	@Override
	public tj.roli.model.roli deleteroli(tj.roli.model.roli roli) {
		return _roliLocalService.deleteroli(roli);
	}

	@Override
	public tj.roli.model.roli fetchroli(long roli_id) {
		return _roliLocalService.fetchroli(roli_id);
	}

	/**
	* Returns the roli with the primary key.
	*
	* @param roli_id the primary key of the roli
	* @return the roli
	* @throws PortalException if a roli with the primary key could not be found
	*/
	@Override
	public tj.roli.model.roli getroli(long roli_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roliLocalService.getroli(roli_id);
	}

	/**
	* Updates the roli in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param roli the roli
	* @return the roli that was updated
	*/
	@Override
	public tj.roli.model.roli updateroli(tj.roli.model.roli roli) {
		return _roliLocalService.updateroli(roli);
	}

	@Override
	public roliLocalService getWrappedService() {
		return _roliLocalService;
	}

	@Override
	public void setWrappedService(roliLocalService roliLocalService) {
		_roliLocalService = roliLocalService;
	}

	private roliLocalService _roliLocalService;
}