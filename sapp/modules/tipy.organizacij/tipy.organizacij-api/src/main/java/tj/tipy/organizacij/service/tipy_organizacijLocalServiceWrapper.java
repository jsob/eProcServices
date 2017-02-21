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

package tj.tipy.organizacij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link tipy_organizacijLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacijLocalService
 * @generated
 */
@ProviderType
public class tipy_organizacijLocalServiceWrapper
	implements tipy_organizacijLocalService,
		ServiceWrapper<tipy_organizacijLocalService> {
	public tipy_organizacijLocalServiceWrapper(
		tipy_organizacijLocalService tipy_organizacijLocalService) {
		_tipy_organizacijLocalService = tipy_organizacijLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tipy_organizacijLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipy_organizacijLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tipy_organizacijLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_organizacijLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_organizacijLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of tipy_organizacijs.
	*
	* @return the number of tipy_organizacijs
	*/
	@Override
	public int gettipy_organizacijsCount() {
		return _tipy_organizacijLocalService.gettipy_organizacijsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tipy_organizacijLocalService.getOSGiServiceIdentifier();
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
		return _tipy_organizacijLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipy_organizacijLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipy_organizacijLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.organizacij.model.impl.tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @return the range of tipy_organizacijs
	*/
	@Override
	public java.util.List<tj.tipy.organizacij.model.tipy_organizacij> gettipy_organizacijs(
		int start, int end) {
		return _tipy_organizacijLocalService.gettipy_organizacijs(start, end);
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
		return _tipy_organizacijLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tipy_organizacijLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the tipy_organizacij to the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_organizacij the tipy_organizacij
	* @return the tipy_organizacij that was added
	*/
	@Override
	public tj.tipy.organizacij.model.tipy_organizacij addtipy_organizacij(
		tj.tipy.organizacij.model.tipy_organizacij tipy_organizacij) {
		return _tipy_organizacijLocalService.addtipy_organizacij(tipy_organizacij);
	}

	/**
	* Creates a new tipy_organizacij with the primary key. Does not add the tipy_organizacij to the database.
	*
	* @param tipy_organizacij_id the primary key for the new tipy_organizacij
	* @return the new tipy_organizacij
	*/
	@Override
	public tj.tipy.organizacij.model.tipy_organizacij createtipy_organizacij(
		long tipy_organizacij_id) {
		return _tipy_organizacijLocalService.createtipy_organizacij(tipy_organizacij_id);
	}

	/**
	* Deletes the tipy_organizacij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij that was removed
	* @throws PortalException if a tipy_organizacij with the primary key could not be found
	*/
	@Override
	public tj.tipy.organizacij.model.tipy_organizacij deletetipy_organizacij(
		long tipy_organizacij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_organizacijLocalService.deletetipy_organizacij(tipy_organizacij_id);
	}

	/**
	* Deletes the tipy_organizacij from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_organizacij the tipy_organizacij
	* @return the tipy_organizacij that was removed
	*/
	@Override
	public tj.tipy.organizacij.model.tipy_organizacij deletetipy_organizacij(
		tj.tipy.organizacij.model.tipy_organizacij tipy_organizacij) {
		return _tipy_organizacijLocalService.deletetipy_organizacij(tipy_organizacij);
	}

	@Override
	public tj.tipy.organizacij.model.tipy_organizacij fetchtipy_organizacij(
		long tipy_organizacij_id) {
		return _tipy_organizacijLocalService.fetchtipy_organizacij(tipy_organizacij_id);
	}

	/**
	* Returns the tipy_organizacij with the primary key.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij
	* @throws PortalException if a tipy_organizacij with the primary key could not be found
	*/
	@Override
	public tj.tipy.organizacij.model.tipy_organizacij gettipy_organizacij(
		long tipy_organizacij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipy_organizacijLocalService.gettipy_organizacij(tipy_organizacij_id);
	}

	/**
	* Updates the tipy_organizacij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipy_organizacij the tipy_organizacij
	* @return the tipy_organizacij that was updated
	*/
	@Override
	public tj.tipy.organizacij.model.tipy_organizacij updatetipy_organizacij(
		tj.tipy.organizacij.model.tipy_organizacij tipy_organizacij) {
		return _tipy_organizacijLocalService.updatetipy_organizacij(tipy_organizacij);
	}

	@Override
	public tipy_organizacijLocalService getWrappedService() {
		return _tipy_organizacijLocalService;
	}

	@Override
	public void setWrappedService(
		tipy_organizacijLocalService tipy_organizacijLocalService) {
		_tipy_organizacijLocalService = tipy_organizacijLocalService;
	}

	private tipy_organizacijLocalService _tipy_organizacijLocalService;
}