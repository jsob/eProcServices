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

package tj.bjudzhetnoe.polnomochie.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bjudzhetnoe_polnomochieLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see bjudzhetnoe_polnomochieLocalService
 * @generated
 */
@ProviderType
public class bjudzhetnoe_polnomochieLocalServiceWrapper
	implements bjudzhetnoe_polnomochieLocalService,
		ServiceWrapper<bjudzhetnoe_polnomochieLocalService> {
	public bjudzhetnoe_polnomochieLocalServiceWrapper(
		bjudzhetnoe_polnomochieLocalService bjudzhetnoe_polnomochieLocalService) {
		_bjudzhetnoe_polnomochieLocalService = bjudzhetnoe_polnomochieLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bjudzhetnoe_polnomochieLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bjudzhetnoe_polnomochieLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bjudzhetnoe_polnomochieLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bjudzhetnoe_polnomochieLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bjudzhetnoe_polnomochieLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bjudzhetnoe_polnomochies.
	*
	* @return the number of bjudzhetnoe_polnomochies
	*/
	@Override
	public int getbjudzhetnoe_polnomochiesCount() {
		return _bjudzhetnoe_polnomochieLocalService.getbjudzhetnoe_polnomochiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bjudzhetnoe_polnomochieLocalService.getOSGiServiceIdentifier();
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
		return _bjudzhetnoe_polnomochieLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bjudzhetnoe_polnomochieLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bjudzhetnoe_polnomochieLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the bjudzhetnoe_polnomochies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bjudzhetnoe.polnomochie.model.impl.bjudzhetnoe_polnomochieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bjudzhetnoe_polnomochies
	* @param end the upper bound of the range of bjudzhetnoe_polnomochies (not inclusive)
	* @return the range of bjudzhetnoe_polnomochies
	*/
	@Override
	public java.util.List<tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie> getbjudzhetnoe_polnomochies(
		int start, int end) {
		return _bjudzhetnoe_polnomochieLocalService.getbjudzhetnoe_polnomochies(start,
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
		return _bjudzhetnoe_polnomochieLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bjudzhetnoe_polnomochieLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the bjudzhetnoe_polnomochie to the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was added
	*/
	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie addbjudzhetnoe_polnomochie(
		tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return _bjudzhetnoe_polnomochieLocalService.addbjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie);
	}

	/**
	* Creates a new bjudzhetnoe_polnomochie with the primary key. Does not add the bjudzhetnoe_polnomochie to the database.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key for the new bjudzhetnoe_polnomochie
	* @return the new bjudzhetnoe_polnomochie
	*/
	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie createbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) {
		return _bjudzhetnoe_polnomochieLocalService.createbjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie_id);
	}

	/**
	* Deletes the bjudzhetnoe_polnomochie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was removed
	* @throws PortalException if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie deletebjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bjudzhetnoe_polnomochieLocalService.deletebjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie_id);
	}

	/**
	* Deletes the bjudzhetnoe_polnomochie from the database. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was removed
	*/
	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie deletebjudzhetnoe_polnomochie(
		tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return _bjudzhetnoe_polnomochieLocalService.deletebjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie);
	}

	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie fetchbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id) {
		return _bjudzhetnoe_polnomochieLocalService.fetchbjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie_id);
	}

	/**
	* Returns the bjudzhetnoe_polnomochie with the primary key.
	*
	* @param bjudzhetnoe_polnomochie_id the primary key of the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie
	* @throws PortalException if a bjudzhetnoe_polnomochie with the primary key could not be found
	*/
	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie getbjudzhetnoe_polnomochie(
		long bjudzhetnoe_polnomochie_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bjudzhetnoe_polnomochieLocalService.getbjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie_id);
	}

	/**
	* Updates the bjudzhetnoe_polnomochie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bjudzhetnoe_polnomochie the bjudzhetnoe_polnomochie
	* @return the bjudzhetnoe_polnomochie that was updated
	*/
	@Override
	public tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie updatebjudzhetnoe_polnomochie(
		tj.bjudzhetnoe.polnomochie.model.bjudzhetnoe_polnomochie bjudzhetnoe_polnomochie) {
		return _bjudzhetnoe_polnomochieLocalService.updatebjudzhetnoe_polnomochie(bjudzhetnoe_polnomochie);
	}

	@Override
	public bjudzhetnoe_polnomochieLocalService getWrappedService() {
		return _bjudzhetnoe_polnomochieLocalService;
	}

	@Override
	public void setWrappedService(
		bjudzhetnoe_polnomochieLocalService bjudzhetnoe_polnomochieLocalService) {
		_bjudzhetnoe_polnomochieLocalService = bjudzhetnoe_polnomochieLocalService;
	}

	private bjudzhetnoe_polnomochieLocalService _bjudzhetnoe_polnomochieLocalService;
}