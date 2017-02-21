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

package tj.izvewenie.put.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link izvewenie_putLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_putLocalService
 * @generated
 */
@ProviderType
public class izvewenie_putLocalServiceWrapper
	implements izvewenie_putLocalService,
		ServiceWrapper<izvewenie_putLocalService> {
	public izvewenie_putLocalServiceWrapper(
		izvewenie_putLocalService izvewenie_putLocalService) {
		_izvewenie_putLocalService = izvewenie_putLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _izvewenie_putLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _izvewenie_putLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _izvewenie_putLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenie_putLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenie_putLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of izvewenie_puts.
	*
	* @return the number of izvewenie_puts
	*/
	@Override
	public int getizvewenie_putsCount() {
		return _izvewenie_putLocalService.getizvewenie_putsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _izvewenie_putLocalService.getOSGiServiceIdentifier();
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
		return _izvewenie_putLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenie.put.model.impl.izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _izvewenie_putLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenie.put.model.impl.izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _izvewenie_putLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenie.put.model.impl.izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @return the range of izvewenie_puts
	*/
	@Override
	public java.util.List<tj.izvewenie.put.model.izvewenie_put> getizvewenie_puts(
		int start, int end) {
		return _izvewenie_putLocalService.getizvewenie_puts(start, end);
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
		return _izvewenie_putLocalService.dynamicQueryCount(dynamicQuery);
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
		return _izvewenie_putLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the izvewenie_put to the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put the izvewenie_put
	* @return the izvewenie_put that was added
	*/
	@Override
	public tj.izvewenie.put.model.izvewenie_put addizvewenie_put(
		tj.izvewenie.put.model.izvewenie_put izvewenie_put) {
		return _izvewenie_putLocalService.addizvewenie_put(izvewenie_put);
	}

	/**
	* Creates a new izvewenie_put with the primary key. Does not add the izvewenie_put to the database.
	*
	* @param izvewenie_put_id the primary key for the new izvewenie_put
	* @return the new izvewenie_put
	*/
	@Override
	public tj.izvewenie.put.model.izvewenie_put createizvewenie_put(
		long izvewenie_put_id) {
		return _izvewenie_putLocalService.createizvewenie_put(izvewenie_put_id);
	}

	/**
	* Deletes the izvewenie_put with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put that was removed
	* @throws PortalException if a izvewenie_put with the primary key could not be found
	*/
	@Override
	public tj.izvewenie.put.model.izvewenie_put deleteizvewenie_put(
		long izvewenie_put_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenie_putLocalService.deleteizvewenie_put(izvewenie_put_id);
	}

	/**
	* Deletes the izvewenie_put from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put the izvewenie_put
	* @return the izvewenie_put that was removed
	*/
	@Override
	public tj.izvewenie.put.model.izvewenie_put deleteizvewenie_put(
		tj.izvewenie.put.model.izvewenie_put izvewenie_put) {
		return _izvewenie_putLocalService.deleteizvewenie_put(izvewenie_put);
	}

	@Override
	public tj.izvewenie.put.model.izvewenie_put fetchizvewenie_put(
		long izvewenie_put_id) {
		return _izvewenie_putLocalService.fetchizvewenie_put(izvewenie_put_id);
	}

	/**
	* Returns the izvewenie_put with the primary key.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put
	* @throws PortalException if a izvewenie_put with the primary key could not be found
	*/
	@Override
	public tj.izvewenie.put.model.izvewenie_put getizvewenie_put(
		long izvewenie_put_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izvewenie_putLocalService.getizvewenie_put(izvewenie_put_id);
	}

	/**
	* Updates the izvewenie_put in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put the izvewenie_put
	* @return the izvewenie_put that was updated
	*/
	@Override
	public tj.izvewenie.put.model.izvewenie_put updateizvewenie_put(
		tj.izvewenie.put.model.izvewenie_put izvewenie_put) {
		return _izvewenie_putLocalService.updateizvewenie_put(izvewenie_put);
	}

	@Override
	public izvewenie_putLocalService getWrappedService() {
		return _izvewenie_putLocalService;
	}

	@Override
	public void setWrappedService(
		izvewenie_putLocalService izvewenie_putLocalService) {
		_izvewenie_putLocalService = izvewenie_putLocalService;
	}

	private izvewenie_putLocalService _izvewenie_putLocalService;
}