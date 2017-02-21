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

package tj.protokol.podachi.pretenzij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link protokol_podachi_pretenzijLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see protokol_podachi_pretenzijLocalService
 * @generated
 */
@ProviderType
public class protokol_podachi_pretenzijLocalServiceWrapper
	implements protokol_podachi_pretenzijLocalService,
		ServiceWrapper<protokol_podachi_pretenzijLocalService> {
	public protokol_podachi_pretenzijLocalServiceWrapper(
		protokol_podachi_pretenzijLocalService protokol_podachi_pretenzijLocalService) {
		_protokol_podachi_pretenzijLocalService = protokol_podachi_pretenzijLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _protokol_podachi_pretenzijLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _protokol_podachi_pretenzijLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _protokol_podachi_pretenzijLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_podachi_pretenzijLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_podachi_pretenzijLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of protokol_podachi_pretenzijs.
	*
	* @return the number of protokol_podachi_pretenzijs
	*/
	@Override
	public int getprotokol_podachi_pretenzijsCount() {
		return _protokol_podachi_pretenzijLocalService.getprotokol_podachi_pretenzijsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _protokol_podachi_pretenzijLocalService.getOSGiServiceIdentifier();
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
		return _protokol_podachi_pretenzijLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protokol_podachi_pretenzijLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _protokol_podachi_pretenzijLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the protokol_podachi_pretenzijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.protokol.podachi.pretenzij.model.impl.protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_podachi_pretenzijs
	* @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	* @return the range of protokol_podachi_pretenzijs
	*/
	@Override
	public java.util.List<tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij> getprotokol_podachi_pretenzijs(
		int start, int end) {
		return _protokol_podachi_pretenzijLocalService.getprotokol_podachi_pretenzijs(start,
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
		return _protokol_podachi_pretenzijLocalService.dynamicQueryCount(dynamicQuery);
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
		return _protokol_podachi_pretenzijLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the protokol_podachi_pretenzij to the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was added
	*/
	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij addprotokol_podachi_pretenzij(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return _protokol_podachi_pretenzijLocalService.addprotokol_podachi_pretenzij(protokol_podachi_pretenzij);
	}

	/**
	* Creates a new protokol_podachi_pretenzij with the primary key. Does not add the protokol_podachi_pretenzij to the database.
	*
	* @param protokol_podachi_pretenzij_id the primary key for the new protokol_podachi_pretenzij
	* @return the new protokol_podachi_pretenzij
	*/
	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij createprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id) {
		return _protokol_podachi_pretenzijLocalService.createprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Deletes the protokol_podachi_pretenzij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was removed
	* @throws PortalException if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij deleteprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_podachi_pretenzijLocalService.deleteprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Deletes the protokol_podachi_pretenzij from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was removed
	*/
	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij deleteprotokol_podachi_pretenzij(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return _protokol_podachi_pretenzijLocalService.deleteprotokol_podachi_pretenzij(protokol_podachi_pretenzij);
	}

	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij fetchprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id) {
		return _protokol_podachi_pretenzijLocalService.fetchprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Returns the protokol_podachi_pretenzij with the primary key.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij
	* @throws PortalException if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij getprotokol_podachi_pretenzij(
		long protokol_podachi_pretenzij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _protokol_podachi_pretenzijLocalService.getprotokol_podachi_pretenzij(protokol_podachi_pretenzij_id);
	}

	/**
	* Updates the protokol_podachi_pretenzij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was updated
	*/
	@Override
	public tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij updateprotokol_podachi_pretenzij(
		tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij protokol_podachi_pretenzij) {
		return _protokol_podachi_pretenzijLocalService.updateprotokol_podachi_pretenzij(protokol_podachi_pretenzij);
	}

	@Override
	public protokol_podachi_pretenzijLocalService getWrappedService() {
		return _protokol_podachi_pretenzijLocalService;
	}

	@Override
	public void setWrappedService(
		protokol_podachi_pretenzijLocalService protokol_podachi_pretenzijLocalService) {
		_protokol_podachi_pretenzijLocalService = protokol_podachi_pretenzijLocalService;
	}

	private protokol_podachi_pretenzijLocalService _protokol_podachi_pretenzijLocalService;
}